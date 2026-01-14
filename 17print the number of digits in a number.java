import java.util.Scanner;
class Solution17{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter a num: ");
         int n = sc.nextInt();

        //  String s = Integer.toString(n);
        //  System.out.println(s.length());


         int count = 0;
         while (n != 0){
            n = n / 10;
            count ++;
         }
         System.out.println(count);
    }
}