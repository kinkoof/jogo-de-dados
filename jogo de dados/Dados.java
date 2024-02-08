import java.util.Random;

public class Dados {

    int advinha;
    int machine;
    int numero;
    Random random;

    Dados(int advinhaC, int machineC){
        advinha = advinhaC;
        machine = machineC;

        random = new Random();
        rolar();
    }

    void rolar(){
        numero = random.nextInt(6)+1;

        if (this.advinha == numero && this.machine != numero) {
            System.out.println("\no numero sorteado foi: " + numero + "\n");
            System.out.println("parabens voce ganhou :D");
            System.out.println("e eu perdi :C");

        }
        else if(this.advinha != numero && this.machine == numero){
            System.out.println("\no numero sorteado foi: " + numero + "\n");
            System.out.println("que pena, voce perdeu :C");
            System.out.println("e eu ganhei :D");

        }

        else if(this.advinha == numero && this.machine == numero){
            System.out.println("\no numero sorteado foi: " + numero);
            System.out.println("Nos dois ganhamos :D :D"   + "\n");

        }
        else{
            System.out.println("\no numero sorteado foi: " + numero + "\n");
            System.out.println("nos dois perdemos :C :C");

        }
    }
}
