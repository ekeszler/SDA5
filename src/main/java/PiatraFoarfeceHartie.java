import java.util.Random;
import java.util.Scanner;

//Implementeaza o solutia de a juca piatra-foarfece-hartie cu computerul cu o limita de 5 runde
public class PiatraFoarfeceHartie {


    public static void main(String[] args) {

        playTheGame();

    }

    public static void playTheGame(){
        int computerCounter = 0;
        int userCounter = 0;
        int[] values = {1, 2, 3};
        Random random = new Random();
        int randomIndex = random.nextInt(values.length);
        int randomValue = values[randomIndex];
        int computerChoice = randomValue;
        for(int i = 1; i<=5; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("please choose: piatra-1, foarfece-2, hartie-3");
            int userChoice = scanner.nextInt();
            if(userChoice < computerChoice){
                System.out.println("Computer won this round");
                computerCounter++;
            }
            if(userChoice > computerChoice){
                System.out.println("user won this round");
                userCounter++;
            }
            if(userChoice == computerChoice){
                System.out.println("play again");
            }
        }
        if(computerCounter > userCounter){
            System.out.println("computer win the match");
        }else if(userCounter > computerCounter){
            System.out.println("user win the match");
        }else{
            System.out.println("equal results");
        }
    }



}
