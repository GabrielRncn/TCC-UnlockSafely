document.getElementById("cadastro_funcionario").addEventListener("submit", function(event) {
    var input_email = document.getElementById("input_email");
    var email = input_email.value;

    var input_senha = document.getElementById("input_senha");
    var senha = input_senha.value;

    var input_confirmasenha = document.getElementById("input_confirmasenha");
    var confirmarSenha = input_confirmasenha.value;

    if (!validateEmail(email)) {
        alert("Por favor, insira um endereço de email válido.");
        event.preventDefault();
    }

    if (senha !== confirmarSenha) {
        alert("As senhas não correspondem.");
        event.preventDefault();
    }
});

function validateEmail(email) {
    return email.includes("@") && email.includes(".") && !email.includes(" ") && !email.includes("@.");
}

// document.getElementById("cadastro_funcionario").addEventListener("submit", function(event) {
//     var input_email = document.getElementById("input_email");
//     var email = input_email.value;

//     if (!validateEmail(email)) {
//         alert("Por favor, insira um endereço de email válido.");
//         event.preventDefault();
//     }
// });

// function validateEmail(email) {
//     return email.includes("@") && email.includes(".") && !email.includes(" ") && !email.includes("@.");
// }