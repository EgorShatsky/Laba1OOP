package Primes;

import java.time.chrono.IsoChronology;

public class Primes {
    public static void main(String[] args) {
        for (int i=2;i<100;i++){ // Цикл от 2 до 100
            if (IsPrime(i)){ // Если простое число, то оно выводится
                System.out.println(i);
            }
        }
    }
    /*
    Функция IsPrime определяет, является ли аргумент простым числом или нет. Будем предполагать, что входное значения n
    всегда будет больше 2. Данный метод будет реализовываться с помощью цикла for. Цикл будет перебирать числа, начиная
    с 2 до n (не включая n), проверяя существует ли какое-либо значение, делящееся на n без остатка. Для этого будет ис
    пользован оператор остатка %. Если какая-либо переменная полностью делится на аругмент с остатком, то срабатывает оператор
    return false. Если же значение не делится на аргумент без остатка, то это простое число и сработает оператор return
    true.
     */

    public static boolean IsPrime(int n){
        for (int i=2;i<n;i++){ //Цикл от 2 до n
            if (n%i==0){ // Если n делится нацело на i
                return false;
            }
        }
        return true;
    }
}