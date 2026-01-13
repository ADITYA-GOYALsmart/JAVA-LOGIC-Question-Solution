import java.util.Scanner;
class Solution11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n =  sc.nextInt();

        int ans = 1;
        if(n == 0 || n<0){
            System.out.println("number is not valid");
        }
        else{
            for (int a = 1; a <= n; a++ ){
            ans = ans*a;
         }
        System.out.println("factorial of " + n + "is" + ans);
        }
    }
    
}
