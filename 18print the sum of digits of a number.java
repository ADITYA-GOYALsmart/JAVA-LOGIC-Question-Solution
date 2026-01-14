import java .util.Scanner;
class Solution18{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num: ");
        int n = sc.nextInt();
        
        int sum = 0;

        // there is one more way without conversion ot string by
        // sum = (n%10) +sum
        // n = n/10
        
        String s = Integer.toString(n);
        for (int i = 0; i< s.length() ; i++){
           sum = (s.charAt(i) -'0')+ sum;
        }
        System.out.println(sum);
    }
}