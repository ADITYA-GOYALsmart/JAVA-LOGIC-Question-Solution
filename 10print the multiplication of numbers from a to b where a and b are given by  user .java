import java.util.Scanner;
class Solution10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num: ");
        int a =sc.nextInt();

        System.out.println("Enter a num:");
        int b=sc.nextInt();

        int mul = 1;
        while(a<=b){
            mul= mul* a;
            a++;
        }
        System.out.println(mul);
    }
}
    
