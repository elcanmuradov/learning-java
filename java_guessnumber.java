import java.util.Random;
import java.util.Scanner;

// Game of finding a randomly selected number
public class java_guessnumber {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(100) + 1;
        int temp;

        System.out.println("Enter a number to start");
        temp = scanner.nextInt();

        while (true){
            if (temp > randomNumber){
                System.out.println("Your guess is higher, enter new value");
                temp = scanner.nextInt();
            }else if (temp < randomNumber){
                System.out.println("Your guess is lower, enter new value");
                temp = scanner.nextInt();
            }else{
                System.out.println("Congrulations! Your guess is right!");
                break;
            }
        }
        scanner.close();
    }
}
