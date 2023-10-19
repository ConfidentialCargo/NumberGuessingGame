import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfTries = 0;
        
        System.out.println("数字当てゲーム");
        System.out.println("範囲：" + lowerBound + " ～ " + upperBound);
        System.out.println("推測してください。");
        
        boolean hasGuessedCorrectly = false;
        while (!hasGuessedCorrectly) {
            System.out.print("数字を入力して下さい: ");
            int playerGuess = scanner.nextInt();
            numberOfTries++;
            
            if (playerGuess < numberToGuess) {
                System.out.println("数字はもっと高いです。もう一度やり直してください。");
            } else if (playerGuess > numberToGuess) {
                System.out.println("数字はもっと低いです。もう一度やり直してください。");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("おめでとうございます。正解です。　答え：" + numberToGuess + "　試行回数：" + numberOfTries );
            }
        }
        
        scanner.close();
    }
}
