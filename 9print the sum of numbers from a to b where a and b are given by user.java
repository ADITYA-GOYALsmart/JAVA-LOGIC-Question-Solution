import java.util.Scanner;
class Soluttion9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num: ");
        int a =sc.nextInt();

        System.out.println("Enter a number: ");
        int b = sc.nextInt();
        int sum =0;

        while(a<=b){
            sum = sum+a;
            a++;
        }
        System.out.println(sum);
    }
}
    

