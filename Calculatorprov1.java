/*
==========================================================================================
Project name : Calculator Pro v1
Language     : Java
Author       : Srishti Tyagi
Concepts used:
- Scanner
- Functions
- Switch cases
- Loops
- Conditional Statements

Description -:
A menu driven console calculator that performs basic and mathematical operations such as factorial, prime check, power, square and many more.
===========================================================================================
*/

import java.util.Scanner;
public class Calculatorprov1 {
        public static int sumOfTwo(int a, int b){
        int sum = a + b;
        return sum;
        }
        public static int diffOfTwo(int c, int d){
        int diff = c - d;
        return diff;
        }
        public static int mulOfTwo(int e, int f){
        int mul = e * f;
        return mul;
        }
        public static int divOfTwo(int g, int h){
            if(g == 0){
                System.out.println("0");
            }else if( h == 0){
                System.out.println("Not defined");
            }
                int div = g / h;
        return div;
        }
        public static int modOfTwo(int i, int j){
            if(i == 0){
                System.out.println("0");
            }else if( j == 0){
                System.out.println("Not defined");
            }
        int mod = i % j;
        return mod;
        }
        public static int squareOfNum(int A){
            int square = A*A;
            return square;
        }
        public static int cubeOfNum(int B){
            int cube = B*B*B;
            return cube;
        }
        int power = 1;
        public static void powerOfNum(int base, int power){
            if(power == 0){
                System.out.println("1");
            }
            for(int i = 1; i <= power; i++){
                power = power * base;
            }
        }
        public static void factorial(int p){
            if(p < 1){
                System.out.println("not defined for negative numbers");
            }else if( p == 0){
                System.out.println("1");
            }
        int factorial = 1;
            for(int i = p; i >= 1; i--){
                factorial = factorial * i;
            }
        }
        public static void primeCheck(int q){
            if(q == 0){
                System.out.println("niether prime nor composite");
            }else if( q == 1){
                System.out.println("niether prime nor composite");
            }
            for(int i = 2; i <= Math.sqrt(q); i++){
                if(q % i == 0){
                    System.out.println("Not a prime number");
                    return;
                }
            }
            System.out.println("prime number");
        }
        public static void maxOfAll(int C, int D, int E){
            if(C >= D && C >= E){
                System.out.println("C");
            }else if(D >= C && D >= E){
                System.out.println("D");
            }else
                System.out.println("E");
            return;
        }
        public static void minOfAll(int F, int G, int H){
            if(F <= G && F <= H){
                System.out.println("F");
            }else if(G <= F && G <= H){
                System.out.println("G");
            }else
                System.out.println("H");
            return;
        }
        public static int avgOfAll(int k, int l, int m){
            int avg = (k + l + m)/3;
            return avg;
        }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int counterchoice;
        do{
        System.out.println("========================================================");
        System.out.println("                     Calculator Pro                     ");
        System.out.println("========================================================");
        System.out.println("1- Addition");
        System.out.println("2- Subtraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");
        System.out.println("5- Modulas");
        System.out.println("6- Square");
        System.out.println("7- Cube");
        System.out.println("8- power");
        System.out.println("9- factorial");
        System.out.println("10- prime check");
        System.out.println("11- Maximum of all");
        System.out.println("12- Minimum of all");
        System.out.println("13- average of all");
        System.out.println("14- Exit");
        System.out.println("Enter the number of the function you want to perform ");
        int function = sc.nextInt();
        System.out.println(" ");


        switch(function){
        case 1 : System.out.println("Enter your first number - ");
        int a = sc.nextInt();
        System.out.println("Enter your second number - ");
        int b = sc.nextInt();
        int sum = sumOfTwo(a, b);
        System.out.println("   ");
        System.out.println("Result");
        System.out.println(" ");
        System.out.println("Ans is - " + sum);
        break;

        case 2 : System.out.println("Enter your first number - ");
        int c = sc.nextInt();
        System.out.println("Enter your second number - ");
        int d = sc.nextInt();
        int diff = diffOfTwo(c, d);
        System.out.println("   ");
        System.out.println("Result");
        System.out.println(" ");
        System.out.println("Ans is - " +diff);
        break;

        case 3 : System.out.println("Enter your first number - ");
        int e = sc.nextInt();
        System.out.println("Enter your second number - ");
        int f = sc.nextInt();
        int mul = mulOfTwo(e, f);
        System.out.println("   ");
        System.out.println("Result");
        System.out.println(" ");
        System.out.println("Ans is - " +mul);
        break;

        case 4 : System.out.println("Enter your first number - ");
        int g = sc.nextInt();
        System.out.println("Enter your second number - ");
        int h = sc.nextInt();
        int div = divOfTwo(g, h);
        System.out.println("   ");
        System.out.println("Result");
        System.out.println(" ");
        System.out.println("Ans is - " +div);
        break;

        case 5 : System.out.println("Enter your first number - ");
        int i = sc.nextInt();
        System.out.println("Enter your second number - ");
        int j = sc.nextInt();
        int mod = modOfTwo(i, j);
        System.out.println("   ");
        System.out.println("Result");
        System.out.println(" ");
        System.out.println("Ans is - " +mod);
        break;

        case 6 : System.out.println("Enter your number to square - ");
        int A = sc.nextInt();
        int square = squareOfNum(A);
        System.out.println("   ");
        System.out.println("Result");
        System.out.println(" ");
        System.out.println("Ans is - " +square);
        break;

        case 7 : System.out.println("Enter your number to cube - ");
        int B = sc.nextInt();
        int cube = cubeOfNum(B);
        System.out.println("   ");
        System.out.println("Result");
        System.out.println(" ");
        System.out.println("Ans is - " +cube);
        break;

        case 8 : System.out.println("Enter your base number - ");
        int base = sc.nextInt();
        System.out.println("Enter your power - ");
        int power = sc.nextInt();
        System.out.println("   ");
        System.out.println("Result");
        System.out.println(" ");
        powerOfNum(base, power);

        case 9 : System.out.println("Enter your number - ");
        int p = sc.nextInt();
        System.out.println("   ");
        System.out.println("Result");
        System.out.println(" ");
        factorial(p);

        case 10 : System.out.println("Enter your number - ");
        int q = sc.nextInt();
        System.out.println("   ");
        System.out.println("Result");
        System.out.println(" ");
        primeCheck(q);

        case 11 : System.out.println("Enter your first number - ");
        int C = sc.nextInt();
        System.out.println("Enter your second number - ");
        int D = sc.nextInt();
        System.out.println("Enter your third number - ");
        int E = sc.nextInt();
        System.out.println("   ");
        System.out.println("Result");
        System.out.println(" ");
        maxOfAll(C, D, E);
        break;

        case 12 : System.out.println("Enter your first number - ");
        int F = sc.nextInt();
        System.out.println("Enter your second number - ");
        int G = sc.nextInt();
        System.out.println("Enter your third number - ");
        int H = sc.nextInt();
        System.out.println("   ");
        System.out.println("Result");
        System.out.println(" ");
        minOfAll(F, G, H);
        break;

        case 13 : System.out.println("Enter your first number - ");
        int k = sc.nextInt();
        System.out.println("Enter your second number - ");
        int l = sc.nextInt();
        System.out.println("Enter your third number - ");
        int m = sc.nextInt();
        int avg = avgOfAll(k, l, m);
        System.out.println("   ");
        System.out.println("Result");
        System.out.println(" ");
        System.out.println(avg);

        case 14 : System.out.println("Exiting calculator pro");
        counterchoice = 2;
        break;

        default : System.out.println("Invalid Response! \n please Choose a number b/w 1 - 14");
        counterchoice = 1;
        break;
        }

        System.out.println("Would you like to perform further calculations?");
        System.out.println("1 - YES ");
        System.out.println("2 - NO ");
        System.out.println("Enter choice - ");
        counterchoice = sc.nextInt();
    }while(counterchoice == 1);

        System.out.println("===========================================================");
        System.out.println("           Thank you for using calculator pro               ");
        System.out.println("===========================================================");
    }
}
