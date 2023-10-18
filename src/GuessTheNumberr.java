import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberr {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" Гра відгадай число. В тебе буде 4 спроби, введи число від 0 до 10 : ");
        boolean correctAnswer = false;

        for (int i = 0; i < 4; i++) {
            int number = scanner.nextInt();
            int numberComputer = random.nextInt(10);

            if (number == numberComputer) {
                System.out.println(" Прямо в ціль");
                correctAnswer = true;

                    break;
            }else {System.out.println("майже, але ні  ");
            }

        }

        if (correctAnswer){

            System.out.println("Ти переміг, гра закінчена");}
        else {
            System.out.println("Спроби закінчилися, ти програв");
        }


        }


        }





