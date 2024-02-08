import java.util.Random;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        Random random = new Random();
        boolean jogar = true;

        while (jogar == true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("voce esta jogando um jogo de dados");
            System.out.println("deseja saber as regras? (S/N)");
            String regras = scanner.next();

            if (regras.equals("s") || regras.equals("S")) {
                System.out.println("Regras:");
                System.out.println(
                        "voce devera escolher um numero de 1 a 6, eu tambem escolherei, quem acertarm o numero que cair no dado ganha");

            }

            System.out.println("deseja jogar(J) ou sair(Q)?");
            String play = scanner.next();

            if (play.equals("J") || play.equals("j")) {

                while (jogar) {
                    System.out.println("Escolha um numero de 1 a 6: ");
                    int machine = random.nextInt(6) + 1;
                    int advinha = scanner.nextInt();

                    System.out.printf("voce escolheu o numero %d\n", advinha);
                    System.out.printf("eu escolhi o numero %d\n", machine);

                    Dados dados = new Dados(advinha, machine);

                    System.out.println("\ndeseja jogar novamente? (S/N)");
                    play = scanner.next();
                    if (play.equals("S") || play.equals("s")) {
                        jogar = true;
                    } else {
                        jogar = false;
                    }

                }

            } else {
                jogar = false;
            }
            scanner.close();
        }
    }

}