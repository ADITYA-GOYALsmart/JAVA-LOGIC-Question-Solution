import java.util.Scanner;
class Solution8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num: ");
        int n = sc.nextInt();
        
        int i = 1;
        int mul = 1;
        while(i<=n){
            mul = mul*i;
            i++;
        }
        System.out.println(mul);

    }
}