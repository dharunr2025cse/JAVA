import java.util.Scanner;
public class CountDigitInANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int count = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10; 
            count++;
        }
        System.out.println("The number of digits in " + number + " is: " + count);
        input.close();
    }
    
}
