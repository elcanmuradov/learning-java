import java.util.Scanner;
public class java_input {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        
        scanner.nextLine();
        System.out.println("Enter your favourite animal: ");
        String animal = scanner.nextLine();

        System.out.println("Hi " + name + ", Your age is " + age + ", Your fav animal is " + animal + "!");
        scanner.close();
    }
}
