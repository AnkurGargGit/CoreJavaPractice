package CoreJava;

//import java.awt.*;

public class MathsAndMaths {
    void message() {
        System.out.println("We are in MathsAndMaths class i.e. The World of Mathematics");
    }
    void mathematicalOperators(){
        byte x = 14 , y = 5;
        byte sum = (byte) (x + y);  // Use of Mathematical Operators (+ , - , * , / , % ) and typecasting also
        System.out.println("The sum is: "+sum);

        sum += x;   // it's a shortcut, equal to sum = sum + x;
        System.out.println("Again the sum is "+sum);

        System.out.println("This sum is through operators "+x++); // post increment
        System.out.println("Now the x is: "+x);

        System.out.println("This sum is through operators "+ ++x); // pre increment

        double result = (double)x / y;
        System.out.println("The result is: "+result);

        int remainder = x % y;
        System.out.println("The remainder is: "+remainder);

    }
    void workingWithASCII(){
        int ASCII = 65;
        char c = (char)ASCII;
        System.out.println("The ASCII value "+ASCII +" represent: "+c);

        char ch = '%';
        ASCII = ch;
        System.out.println("The ASCII value of -> "+ch +" is: "+ASCII);
    }
    void typeConversion(){
        double x = 5;  // implicit conversion
        int val = (int)5.6; // type casting or explicit conversion
        System.out.println("The value of x is: "+x);
        System.out.println("The value of val is: "+val);

        /* Note: Working of data type
        Which type of data can be cast to which:
        byte -> short -> int -> long -> float -> double
                char -> int -> long -> float -> double
        */
    }
}
