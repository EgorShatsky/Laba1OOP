package Palindrome;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

      isPalindrome("noon");

    }
    public static String reserveString(){

        Scanner s=new Scanner(System.in);// Создание нового объекта класса Scanner
        System.out.println("Введите слово"); // Вывод надписи
        String string=s.nextLine();// Присвоение переменной string слова введенного на данной строчке

        String res=""; //Присвоение переменной пустого значения
        for (int i=0;i<string.length();i++){ // Цикл от 0 индекса до последнего
            res=string.charAt(i) + res; // Составление слова задом наперед
        }

        System.out.println(res);
        return string;
    }
    /*
    Следующий метод переворачивает слово s, а затем сравнивает его с первоначальными данными
     */
    public static boolean isPalindrome(String s){
        String s1="";
        boolean result=false;
        for (int i=0;i<s.length();i++){
            s1=s.charAt(i) + s1;
        }
        System.out.println("Обратный порядок букв в слове - "+s1);
        System.out.println("Является ли данное слово палиндромом - "+s.equals(s1));

        return false;

    }
}

