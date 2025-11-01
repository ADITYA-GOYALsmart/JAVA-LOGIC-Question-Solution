import java.util.Scanner;
class Solution7{
    public static void main(String[] args){
        Scanner ad = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = ad.nextInt();
       
        int i = 1;
        int ans=1;
        while(i<=n){
            ans+=ans;
            i++;
        }
        System.out.println(ans);
    }
    
}
