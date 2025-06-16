import java.util.Scanner;
class Soluton3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = sc.nextInt();
        int i;
        for(i = 1; i<=n ; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
            else{
                continue;
            }
        }
    }
}