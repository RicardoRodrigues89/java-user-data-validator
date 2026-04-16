import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario novoUsuario = new Usuario();
        ValidadorUsuario isvalido = new ValidadorUsuario();

        System.out.println("Digite seu nome: ");
        novoUsuario.nome = scanner.nextLine();

        System.out.println("Digite seu email: ");
        novoUsuario.email = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        novoUsuario.senha = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        novoUsuario.idade = scanner.nextInt();

        System.out.println(isvalido.validar(novoUsuario));

        scanner.close();

    }
}
