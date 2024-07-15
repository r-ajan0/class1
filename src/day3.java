import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 100; i++) {
//            i++;
//            System.out.println(i);
//        }
//
//        for (int i = 0; i < 100; i++) {
//            i++;
//            System.out.println(i);
//        }
//
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int userInput = input.nextInt();
//        for (int i = 1; i<= userInput; i++) {
//            System.out.println("Ram");
//        }

//        int i = 1;
//        while (i <= 100) {
//            System.out.println(i);
//            i++;
//        }
//
//        int j = 0;
//        while (j < 100) {
//            j++;
//            System.out.println(j);
//            j++;
//        }
//
//        int k =1;
//        while (k <= 100) {
//            k++;
//            System.out.println(k);
//            k++;
//        }
//
//        int userInput2 = input.nextInt();
//        int l = 1;
//
//        while ( l<= userInput2){
//            System.out.println("Ram");
//            l++;
//
//        }

        for(int i =1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
