package problems.numberGame;

import java.util.Scanner;

public class NumberGame {
    private int MAX_CHANCES = 7;
    private int number;

    public NumberGame() {
        this.number = (int)(Math.random() * 100);
    }

    private boolean canIPlay() {
        boolean flag = this.MAX_CHANCES > 0;
        if (!flag) {
            System.out.println("Sorry you lost. The number was " + this.number + "!!!");
        }
        return flag;
    }

    private int chancesLeft() {
        return this.MAX_CHANCES;
    }

    private int check(int number) {
        this.MAX_CHANCES--;

        if (this.number == number) {
            System.out.println("You guessed it right!!!!");
            this.MAX_CHANCES = 0;
            return 0;
        } else if (this.number > number) {
            System.out.println("Number is greater than " + number);
            return 1;
        } else {
            System.out.println("Number is smaller than " + number);
            return -1;
        }
    }

    private void play() {
        System.out.println("I have a random number between 1 and 100. You get " + this.MAX_CHANCES + " chances to guess it right");
        Scanner scanner = new Scanner(System.in);
        int number;

        while(this.canIPlay()) {
            System.out.println("You have " + this.chancesLeft() + " chances left to play");
            System.out.print("Enter you number here: ");
            number = scanner.nextInt();
            this.check(number);
        }

    }

    public static void main(String[] args) {
        NumberGame game = new NumberGame();
        game.play();
    }
}
