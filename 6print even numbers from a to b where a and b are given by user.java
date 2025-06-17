import java.util.Scanner;
class Solution6{
    public static void main(String[] args){
        Scanner ad = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = ad.nextInt();

        System.out.println("Enter second number: ");
        int b = ad.nextInt();

        int i=a;
        while(i<=b){
            if(i %2 == 0){
                System.out.println(i);
                
            }
            i++;
        }
    }
}