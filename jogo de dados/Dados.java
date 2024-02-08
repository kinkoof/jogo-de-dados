import java.util.Random;

public class Dados {

    int advinha;
    int machine;
    int numero = 0;
    Random random;

    Dados(){
        random = new Random();
        rolar();
    }

    void rolar(){
        numero = random.nextInt(6)+1;

        if (this.advinha == numero && this.machine != numero) {
            System.out.println("parabens voce ganhou :D");
            System.out.println("e eu perdi :C");
        }
        else if(this.advinha != numero && this.machine == numero){
            System.out.println("que pena, voce perdeu :C");
            System.out.println("e eu ganhei :D");
        }
        else if(this.advinha == numero && this.machine == numero){
            System.out.println("Nos dois ganhamos :D :D");
        }
        else{
            System.out.println("nos dois perdemos :C :C");
        }
    }
}
