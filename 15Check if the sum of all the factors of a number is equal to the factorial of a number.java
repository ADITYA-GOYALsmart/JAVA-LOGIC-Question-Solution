import java.util.Scanner;
class Sloution15{
    public static void main(String[] args){
         
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num: ");
        int n = sc.nextInt();

        int factor = 0;
        int factorial = 1;

        for(int i =1 ; i<= n ;i++){
            if(n%i == 0){
                factor = factor + i;
            }
            factorial = i * factorial;
        }
        if(factor == factorial){
            System.out.println("Sum of factor and factorial of " + n + " are same");
        }else{
            System.out.println("Factor and factorial are not same");
        }
    }
}