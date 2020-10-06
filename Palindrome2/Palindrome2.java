package Palindrome2;

public class Palindrome2 {
    public static void main(String[] args){
        for (int i=0;i< args.length;i++){
            String s=args[i];
            System.out.println(s+isPalindrome1(s));
        }
    }

    public static String reserveString1(String s){
        String str=new String();
        for (int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }
        return str;
    }

    public static boolean isPalindrome1(String s){
        String reserved1 =reserveString1(s);
        return s.equals(reserved1);
    }
}
