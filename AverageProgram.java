/*
AverageProgram
David Sohn
Takes the sum and average of three numbers. I also added an if statement
for the biggest and smallest numbers that were inputted.
 */
package averageprogram;
import java.util.Scanner;
/**
 *
 * @author deeso
 */
public class AverageProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int sum;
        int average;
        int product;
        int largest;
        int smallest;

        System.out.print("Enter First Number: ");
        num1 = input.nextInt();

        System.out.print("Second Number: ");
        num2 = input.nextInt();

        System.out.print("Third Number: ");
        num3 = input.nextInt();

        sum = num1 + num2 + num3;
        average = sum / 3;
        

        largest = num1;
        smallest = num1;

        if(num2 > largest)
            largest = num2;

        if(num3 > largest)
            largest = num3;

        if(num2 < smallest)
            smallest = num2;

        if (num3 < smallest)
            smallest = num3;

        System.out.println("The sum is " + sum);

        System.out.println("The average is " + average);

        System.out.println("The largest number of the three is " + largest + " and the smallest is "+ smallest + ".");
    }
}

        
    
    

