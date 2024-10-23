import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String letrasMaiuscula="ABCDEFGHIJKLMNOPQRSTUVXWYZ";
        String letrasMinuscula="abcdefghijklmnopqrstuvxwyz";
        String numeros="1234567890";
        String caracteresEspeciais="!@#$%&*()-_=+[]{}|;:,.<>?/";

        StringBuilder caracteresPossiveis=new StringBuilder();


        System.out.println("Quantos caracteres a sua senha precisa?");
        int tamanhoSenha=scan.nextInt();
        if(tamanhoSenha<=5){
            System.out.println("A senha precisa ter no minimo cinco (5) caracteres");
        }else {


            Random random = new Random();
            StringBuilder senha = new StringBuilder();
            scan.nextLine();

            System.out.println("Sua senha precisa de caracteres maiusculos? s/n");
            if (scan.nextLine().equalsIgnoreCase("s")) {
                senha.append(letrasMaiuscula.charAt(random.nextInt(letrasMaiuscula.length())));
                caracteresPossiveis.append(letrasMaiuscula);
            }


            System.out.println("Sua senha precisa de caracteres minusculos? s/n");
            if (scan.nextLine().equalsIgnoreCase("s")) {
                senha.append(letrasMinuscula.charAt(random.nextInt(letrasMinuscula.length())));
                caracteresPossiveis.append(letrasMinuscula);
            }

            System.out.println("Sua senha precisa de números? s/n");
            if (scan.nextLine().equalsIgnoreCase("s")) {
                senha.append(numeros.charAt(random.nextInt(numeros.length())));
                caracteresPossiveis.append(numeros);
            }

            System.out.println("Sua senha precisa de caracteres especiais? s/n");
            if (scan.nextLine().equalsIgnoreCase("s")) {
                senha.append(caracteresEspeciais.charAt(random.nextInt(caracteresEspeciais.length())));
                caracteresPossiveis.append(caracteresEspeciais);
            }




            for (int i = 0; i <= tamanhoSenha; i++) {
                //gera um indice pra escolher caracteres
                //i== index
                int indexAleatorio = random.nextInt(caracteresPossiveis.length());
                //retorna o caractere que esta na posição index da strig caracteresPossiveis
                senha.append(caracteresPossiveis.charAt(indexAleatorio));

            }


            System.out.println("senha gerada: " + senha.toString());


            scan.nextLine();

        }
    }
}
