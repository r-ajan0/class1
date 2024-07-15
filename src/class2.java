import java.util.Scanner;

public class class2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//// odd or even
//        System.out.println("Enter the number");
//        int num = input.nextInt();
//        if (num % 2 == 0) {
//            System.out.println("even");
//        }
//        else {
//            System.out.println("odd");
//        }
//
//
////valid to vote or not
//        int age;
//        System.out.println("Enter the age");
//        age = input.nextInt();
//
//        if (age >=18){
//            System.out.println("allowed to vote");
//        }
//        else {
//            System.out.println("not allowed to vote");
//        }

//        int userInput = input.nextInt();
//        if (userInput%3 == 0  && userInput%5 == 0){
//            System.out.println("FizzBuzz");
//        }
//        else if (userInput%5==0){
//            System.out.println("Buzz");
//        }
//        else if (userInput%3==0){
//            System.out.println("Fizz");
//        }
//        else{
//            System.out.println(userInput);
//        }

        int userInput = input.nextInt();
        int thousand = 0;
        int hundred = 0;
        int ten = 0;
        int five = 0;

        if(userInput > 1000) {
            hundred=(userInput-((userInput/1000)*1000));
            System.out.println(userInput-hundred);
        }
        if(hundred > 500 && hundred < 1000) {
            ten = (hundred-((hundred/500)*500));
            System.out.println(hundred-ten);
        }
        if(ten > 100 && ten < 500) {
            five = (ten-((ten/100)*100));
            System.out.println(ten-five);
        }

        }


    }

