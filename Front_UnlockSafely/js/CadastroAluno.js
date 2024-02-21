// Função para adicionar um armário com os dados fornecidos
function adicionarArmario(numeroArmario, numeroBloco, nomePessoa, numeroTag) {
    // Cria um novo elemento de armário
    var novoArmario = document.createElement("div");
    novoArmario.classList.add("armario");
  
    // Cria o ícone de cadeado
    var lockIcon = document.createElement("span");
    lockIcon.classList.add("lock-icon");
    lockIcon.innerHTML = "🔒";
    novoArmario.appendChild(lockIcon);
  
    // Adiciona os dados da pessoa ao armário
    var pessoaNome = document.createElement("div");
    pessoaNome.classList.add("person-name");
    pessoaNome.innerHTML = nomePessoa;
    novoArmario.appendChild(pessoaNome);
  
    var tagNumero = document.createElement("div");
    tagNumero.classList.add("tag-number");
    tagNumero.innerHTML = "Tag: " + numeroTag;
    novoArmario.appendChild(tagNumero);
  
    // Adiciona o armário ao container
    var armariosContainer = document.getElementById("armarios-container");
    armariosContainer.appendChild(novoArmario);
  }
  
  // Exemplo de uso da função adicionarArmario
  adicionarArmario("001", "Bloco A", "João", "12345");
  adicionarArmario("002", "Bloco B", "Maria", "67890");
  