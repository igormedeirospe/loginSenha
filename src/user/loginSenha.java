package user;

import java.util.Scanner;

public class loginSenha {
    public static void main(String[] args) {

        String usuario;

        java.util.Scanner objetoUser = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        usuario = objetoUser.nextLine();

        //senha (nesse caso levando em consideração que a senha tem que ser 123.
        System.out.println("Digite sua senha(em numeros e 3 digitos): ");
        int senha = objetoUser.nextInt();
        //&& "E"
        if (usuario.equals("Igor") && senha == 123){
            System.out.println("O nome é: " + usuario + " e senha : ***(123)");
        }else {
            System.out.println("ocorreu um error");
        }

//

    }
}
