import java.util.Scanner;

class Fib{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Choice:-----> ");
        System.out.print("1.Fibonacci");
        System.out.print("2.Prime");
        System.out.print("3.Armstrong");
        System.out.println();
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
            int num1 = 0;
            int num2 = 1;
            int count = 20;
    
            System.out.print(num1 + " " + num2);
            for(int i = 2; i <= count; i++){
                int num3 = num1 + num2;
                System.out.print(" "+ num3);
                num1 = num2;
                num2 = num3;
            }
                break;
            case 2:
                int i = 0;
                int n = 0;
                for(int j = 2; j <= 20; j++){
                    n = 0;
                    for(i = 1; i <= j; i++){
                        if(j%i == 0){
                            n++;
                        }
                    }
                    if(n == 2){
                        System.out.print(j + " ");
                    }
                }
                case 3 :
    
                System.out.println("Enter Number");
                int number = sc.nextInt() ; 
                int originalNumber=0;
                int remainder=0;
                int result = 0;

                originalNumber = number;

                while (originalNumber != 0)
                {
                    remainder = originalNumber % 10;
                    result += Math.pow(remainder, 3);
                    originalNumber /= 10;
                }

                if(result == number)
                    System.out.println(number + " is an Armstrong number.");
                else
                    System.out.println(number + " is not an Armstrong number.");
                }
            }

            default:
                break;
        }
        

}
