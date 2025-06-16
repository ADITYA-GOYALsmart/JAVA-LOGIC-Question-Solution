import java.util.Scanner;
class Solution4{
    public static void main(String[] args){
        Scanner ad = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n= ad.nextInt();
        int i = 1;
        while(i < n+1){
            if (i%3 == 0 && i%5 == 0){
                System.out.println(i);
            }           
            i++;
        }
    }
}