document.getElementById("container").addEventListener("submit", function(event) {
    event.preventDefault();

    var nome = document.getElementById("input_nome").value;
    var email = document.getElementById("input_email").value;
    var senha = document.getElementById("input_senha").value;
    var confirmaSenha = document.getElementById("input_confirmasenha").value;

    if (email.indexOf("@") === -1) {
        document.getElementById("input_email").classList.add("Está faltando o @ no campo 'Email'");
        return;
    } else {
        document.getElementById("input_email").classList.remove("Erro");
    }

    if (senha !== confirmaSenha) {
        alert('A senha está diferente, digite novamente!');
        // document.getElementById("input_senha").classList.add("Erro");
        // document.getElementById("input_confirmasenha").classList.add("Erro");
        return;
    } else {
        document.getElementById("input_senha").classList.remove("Erro");
        document.getElementById("input_confirmasenha").classList.remove("Erro");
    }

    window.location.href = "ListaAcessos.html";
});

if(email === 0 || email === null || email === undefined){
    alert('Email vazio');
}