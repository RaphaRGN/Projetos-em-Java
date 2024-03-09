import java.util.Scanner;
public class Sistema {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Candidatos Raphael = new Candidatos();
        Candidatos Goettzinger = new Candidatos();
        Candidatos Neto = new Candidatos();
        Candidatos Javilson = new Candidatos();

        Raphael.nomecandidato = "Raphael";
        Goettzinger.nomecandidato = "Goettzinger";
        Neto.nomecandidato = "Neto";
        Javilson.nomecandidato = "Javilson";

        while (true) {
            System.out.println("Bem vindo ao sistema de eleição em Java ! \nVote através do número do seu candidato: \n 1. Raphael \n 2. Goettzinger \n 3. Neto \n 4. Javilson");


            int escolha = entrada.nextInt();

            switch (escolha) {

                case 0:

                    System.out.println("Encerrando votação. Contabilização dos votos:");
                    System.out.println("Raphael: " + Raphael.getnumerovoto() + " votos");
                    System.out.println("Goettzinger: " + Goettzinger.getnumerovoto() + " votos");
                    System.out.println("Neto: " + Neto.getnumerovoto() + " votos");
                    System.out.println("Javilson: " + Javilson.getnumerovoto() + " votos");
                    System.exit(0); // Encerra o programa
                    break;

                case 1:

                    Raphael.voto();
                    System.out.println("Seu voto foi computado !");

                    break;

                case 2:
                    Goettzinger.voto();
                    System.out.println("Seu voto foi computado !");

                    break;

                case 3:
                    Neto.voto();
                    System.out.println("Seu voto foi computado !");

                    break;

                case 4:
                    Javilson.voto();
                    System.out.println("Seu voto foi computado !");
                    break;


                default:

                    System.out.println("Insira uma opção válida !");


            }


        }

    }

}


class Candidatos{

public String nomecandidato;
public int numerovoto = 0;

    public boolean voto() {

        numerovoto++;
        return true;
    }
        public int getnumerovoto() {

            return numerovoto;
        }



}


