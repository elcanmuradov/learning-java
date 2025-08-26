import java.util.Scanner;
public class java_romenumbers {

public static int changetonumber(char str){
    int number = switch(str){
        case 'I' -> 1;
        case 'V' -> 5;
        case 'X' -> 10;
        case 'L' -> 50;
        case 'C' -> 100;
        case 'D' -> 500;
        case 'M' -> 1000;
        default -> -1;
    };


    return number;
}
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
// XXLL = 30
        System.out.println("Enter rome number: ");
        String romeNumber = scanner.nextLine();
        int total = 0;
        for (int i = 0; i < romeNumber.length() - 1 ; i++){
            if (changetonumber(romeNumber.charAt(i)) <= changetonumber(romeNumber.charAt(i + 1))){
                total = total - changetonumber(romeNumber.charAt(i));
            }else if ((i == romeNumber.length() - 1) || (changetonumber(romeNumber.charAt(i)) >= changetonumber(romeNumber.charAt(i + 1))) ){
                total = total + changetonumber(romeNumber.charAt(i));
            }
            System.out.println(changetonumber(romeNumber.charAt(i)));
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Your rome number is: ");
        System.out.println(total);
        scanner.close();
    }
}
