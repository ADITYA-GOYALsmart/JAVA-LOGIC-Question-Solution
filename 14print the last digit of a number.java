// import java.util.Scanner;
class Solution14{
    public static void main(String[]args){

        int num = 2345;

        // int ans = num % 10;
        //System.out.println(ans);

        String s = Integer.toString(num);
         
        for (int i = 0; i < s.length() ; i++){
            if(i == s.length() - 1){
                System.out.println("num is " + s.charAt(i));
            }
        }

       

    }
}