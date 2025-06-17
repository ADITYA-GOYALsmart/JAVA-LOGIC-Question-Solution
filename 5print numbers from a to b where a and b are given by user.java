import java.util.Scanner;
class Solution5{
    public static void main(String[] args){
        Scanner ad = new Scanner(System.in);
        
        System.out.println("Enter First number: ");
        int a = ad.nextInt();

        System.out.println("Enetr second number: ");
        int b= ad.nextInt();

        for (int i=a ; i<=b ; i++){
            System.out.println(i);
        }
    }
}