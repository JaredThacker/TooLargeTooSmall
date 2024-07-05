/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
public class Main {

    public static void playGame(){
        int usersGuess;
        int guessCount;
        int computersNum = (int)(20 * (Math.random()) + 1);

        guessCount = 0;
        System.out.println("What is your first guess ");
        Scanner scanner = new Scanner(System.in);
        while(true){
            usersGuess = scanner.nextInt();
            guessCount++;
            if(usersGuess == computersNum){
                System.out.println("You win!");
                break;
            }
            if(guessCount==5){
                System.out.println("You lose");
                break;
            }
                if(usersGuess<computersNum){
                    System.out.println("Your guess is too low");
                }else if(usersGuess>computersNum){
                    System.out.println("Your guess is too high");
                }
        }
    }

    public static void main(String[] args){
        System.out.println("Pick a number between 1 and 20\n");
        Scanner scan = new Scanner(System.in);
        String playAgain = "y";
        do {
            playGame();
            System.out.println("Would you like to play again? y/n");
            playAgain = scan.nextLine().toLowerCase();
        } while (playAgain.equals("y"));


    }
}
