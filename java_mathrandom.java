import java.util.Random;
// Finding the hypotenuse using two randomly selected sides of a triangle
public class java_mathrandom {
    public static void main(String args[]){
        Random random =new Random();

        int side1 = random.nextInt(100) + 1;
        int side2 = random.nextInt(100) + 1;   

        double hyp = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2,2));
        System.out.println("Hypotenuse is " + hyp);
    }
}
