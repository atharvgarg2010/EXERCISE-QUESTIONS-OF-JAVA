import java.util.Scanner;

class ExerciseQues {
    // 1. Enter 3 numbers from the user & make a function to print their average.
    // public static void average(int a , int b,int c){
    //     int avg = (a+b+c)/3;
    //     System.out.println(avg);
    //     return;
    // }

    // 2. Write a function to print the sum of all odd numbers from 1 to n.
    // public static void odd(int n){
    //     for (int i =0; i <= n; i++) {
    //         i++;
    //         if (i<n) {
    //             System.out.println(i);
                
    //         }
            
    //     }
    // }

    // 3. Write a function that takes in the radius as input and returns the circumference of a circle.
    // public static void circumference(int r){
    //     double c=2*3.14*r;
    //     System.out.println(c);    
    // }
    public static void power(double x , double n){
        double num = Math.pow(x, n);
        System.out.println(num);    
    }
    public static void main(String args[]){
        // 1. Enter 3 numbers from the user & make a function to print their average.
        // Scanner sc = new Scanner(System.in);
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int num3 = sc.nextInt();
        // average(num1, num2, num3);

        // 2. Write a function to print the sum of all odd numbers from 1 to n.
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // odd(n);

        // 3. Write a function that takes in the radius as input and returns the circumference of a circle.
        // Scanner sc = new Scanner(System.in);
        // int r = sc.nextInt();
        // circumference(r);

        // 4. Write an infinite loop using do while condition.
        // do {
        //     System.out.println("0");
        // } while (true);

        // 5. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
        // Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // int negative = 0;
        // int positive = 0;
        // int zero = 0;
        // for (int i = 0; i < n; i++) {
        //     int a=sc.nextInt();
        //     if (a<0) {
        //         negative++;
        //     }else if(a>0){
        //         positive++;
        //     }else {
        //         zero++;
        //     }
        // }
        // System.out.println("Positive:"+positive);
        // System.out.println("Negative:"+negative);
        // System.out.println("Zero:"+zero);

        // 6. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
        // Scanner sc = new Scanner(System.in);
        // double x=sc.nextInt();
        // double n=sc.nextInt();
        // power(x, n);

    }
}
