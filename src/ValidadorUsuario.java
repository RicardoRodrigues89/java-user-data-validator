public class ValidadorUsuario {
    public String validar(Usuario usuario) {

        boolean isNomeValido = usuario.nome.length() >= 3;
        boolean isEmailValido = usuario.email.contains("@") && usuario.email.endsWith(".com");
        boolean isSenhaValida = usuario.senha.length() >= 6;
        boolean isIdadeValida = usuario.idade >= 13;

        if (isNomeValido && isEmailValido && isSenhaValida && isIdadeValida) {
            return "ACESSO PERMITIDO!";
        }

        String erros = "ACESSO NEGADO - Erros: ";

        if(!isNomeValido) erros += "Nome muito curto.";
        if(!isEmailValido) erros += "Email inválido.";
        if(!isSenhaValida) erros += "Senha muito curta.";
        if(!isIdadeValida) erros += "Menos de 13 anos.";

        return erros;


    }
}