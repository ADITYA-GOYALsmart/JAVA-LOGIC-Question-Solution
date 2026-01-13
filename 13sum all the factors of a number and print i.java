import java.util.Scanner;
class Solution13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        
        int ans= 0;

        for(int i=1 ; i<= n; i++){
            if(n%i == 0){
                ans = i+ ans;
            }
        }
        System.out.print("Sum of factors of " + n + " is " + ans);
    }
}