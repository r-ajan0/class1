import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World");
        int num4;
        float rad1;

//sum of two numbers
        int num1 = 5;
        int num2 = 6;
        int sum = num1 + num2;
        System.out.println(sum);

//area of circle
        float pi = 3.14159265f;
        float radius = 4f;
        float area = pi * radius * radius;
        System.out.println(area);

//odd or even

        int num = 5;
        if (num%2 == 0) {
            System.out.println("This is an even number.");
        }
        else {
            System.out.println("This is a odd number.");
        }

//odd or even by user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        num4 = input.nextInt();

        if (num4 % 2 == 0) {
            System.out.println("This is an even number.");
        }
        else {
            System.out.println("This is a odd number.");
        }

//area of circle by taking user input
        System.out.println("Enter a radius: ");
        rad1 = input.nextFloat();
        System.out.println("The area is: "+pi * rad1*rad1);

        }
    }
