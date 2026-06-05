import java.util.Scanner;
public class AddAndSub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        Add obj=new Add();
        Sub obj1=new Sub();
        int sum = obj.add(num1, num2);
        int difference = obj1.sub(sum, num3);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The difference between " + sum + " and " + num3 + " is: " + difference);

        scanner.close();
    }
}
class Add{
    int add(int a,int b){
        return a+b;
    }
}
class Sub{
    int sub(int a,int b){
        return a-b;
    }
}