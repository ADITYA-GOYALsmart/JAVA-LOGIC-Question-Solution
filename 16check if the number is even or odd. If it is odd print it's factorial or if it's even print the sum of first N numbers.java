import java.util.Scanner;
    class Solution16{
        public static void main(String[] args){
            
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a num: ");
            int n = sc.nextInt();

            int sum = 0;
            int factorial = 1;

            if(n%2 == 0){
                for (int i =1 ; i<=n ; i++){
                    sum = sum + i;

                }
                System.out.println("it is even so sum of firs n is " + sum);
            }else{
                for(int j  = 1; j<=n ; j++){
                    factorial = factorial * j;
                }
                System.out.println("it is odd so factorial is " + factorial);
            }
        }
    }
