package CoreJava;

import java.util.Scanner;

public class Conditions {

    void checkEvenOdd(int num){     //parameterised method
        //int num;
        if(num % 2 == 0)
            System.out.println("The number "+num+" is Even");
        else
            System.out.println("The number "+num+" is Odd");
    }
    void checkPrimeNo(){
        int number;
        System.out.println("Enter a number to check Prime / Composite");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int flag = 0, i = 2;
        while(i<number) {
            if (number % i == 0) {
                System.out.println("The number " + number + " is a Composite Number");
                break;
            }
            else {
                flag = 1;
            }
            i++;
        }
        if(flag == 1)
            System.out.println("The number " + number + " is a Prime Number");
    }
    void ternaryOperator(){
        int k, a = -5;
        k = a > 0 ? a:-a;
        System.out.println("The absolute value of "+k+" is "+k);

        int val = 50;
        String s;
        s = val % 2 == 0 ? "Even" : "Odd";
        System.out.println(s);
    }
    void switchCase(){
        //int day = 4;
        String day = "sun";
        switch (day){
            case "sun":
                System.out.println("It's Sunday");
                break;
            case "mon":
                System.out.println("It's Monday");
                break;
            case "tue":
                System.out.println("It's Tuesday");
                break;
            default:
                System.out.println("Wrong number entered.");
        }
    }
    void whoIsGreater() {
        byte n1 = 10+9+7, n2 = 26, n3 = 2; // n4 = 11, n5 = 10;
        if (n1 > n2 && n1 > n3) {
            System.out.println("n1 is greatest.");
        }
        else if (n2 > n1 && n2 > n3) {
            System.out.println("n2 is greatest");
        }
        else if(n3 > n1 && n3 > n2)
            System.out.println("n3 is greater.");

        else if (n1==n2 && n1 > n3) {
            System.out.println("n1 and n2 are equal and greater also.");

        }
        else if(n2==n3 && n2 > n1){
            System.out.println("n2 and n3 are equal and greater also.");
        }
        else if(n3==n1 && n3 > n2)
            System.out.println("n3 and n1 are equal and greater also.");
        else
            System.out.println("n1, n2 and n3 all are equal.");
    }
    void average(){
        // in this we are taking input from user.
        System.out.print("First tell that, for how many numbers you want to  get the average.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Please enter "+num+" numbers.");
        int i = 0, j = 0, sum = 0;
        int[] numbers = new int[num];
        while(i<num){
            numbers[i] = sc.nextInt();
            i++;
        }
        System.out.print("The numbers in the array are: ");
        while (j<i){
            System.out.print(", "+numbers[j]);
            sum += numbers[j];
            j++;
        }
        System.out.println("\n The average is: "+sum/num);
    }
    void factorial(){
        int num, factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to get the Factorial");
        num = sc.nextInt();
        System.out.print("The factorial of "+num+" is : ");
        while(num > 0){
            factorial = factorial * num;
            num--;
        }
        System.out.print(factorial);
    }
    void palindrome(){
        int number, temp = 0, remainder, copyOfNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to know it's is Palindrome or not.");
        number = sc.nextInt();
        copyOfNumber = number;
        System.out.print("The reverse of  "+number+" is ");
        while (number > 0){
            remainder = number % 10;
            number = number / 10;

            temp = temp * 10 + remainder;
        }
        System.out.print(temp+" ");
        if(copyOfNumber == temp)
            System.out.print("and it's a Palindrome.");
        else
            System.out.print("and it's not a Palindrome.");
    }
    void swapping(){
        int n1=4, n2=5;
        System.out.println("The values in Num1 and Num2 before swapping are: "+n1+" & "+n2);
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("The values in Num1 and Num2 after swapping are: "+n1+" & "+n2);
    }
    void armstrong(){
        // A number is called Armstrong number - when it is equal to the sum of its digits each raised to the power
        // of numbers of digits in it. Examples: 1, 153, 370, 371, 407, 1634, 8208, 9474, 54748 etc
        int number, num, digit, counter = 0, temp = 0;
        System.out.println("Please enter the no to check, whether it is an Armstrong no or not.");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        System.out.print("The number entered is: "+number);
        num = number;
        while(num>0){
            num = num / 10;
            counter++;
        }
        System.out.print(", it is having: "+counter+" digits and ");
        num = number;
        while (num > 0){
            digit = num % 10;
            num = num / 10;
            temp = temp + (int) Math.pow(digit, counter);
            //System.out.println("The value in digit is: "+digit+" & "+temp);
        }
        //System.out.println("The value in temp is: "+temp);
        if(temp == number)
            System.out.print(" It's an Armstrong no.");
        else
            System.out.print(" It's not an Armstrong no.");
    }
    void sumOfOddNumbers(){
        int startPoint = 1, endPoint = 1, sum = 0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the range (from m to n) of numbers to get the sum of all Odd numbers existing in it.");
        System.out.println("Please enter the value of m (i.e. Starting point of range) ");
        startPoint = sc.nextInt();
        System.out.println("Please enter the value of n (i.e. Ending point of range) ");
        endPoint = sc.nextInt();
        System.out.print("The number are: ");
        for(i=startPoint; i<=endPoint; i++) {
            if (i % 2 != 0)
                sum = sum + i;
            System.out.print(", " + i);
        }
            System.out.print("\nThe sum of all Odd numbers of this range is: "+sum);
    }
}
