/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chaptera_098_03;
import java.util.Scanner;
class PrimeNumbers {
    int n;
    
    void setN(int a) {
        n = a;
    }
    
    void checkPrime() {
        int c = 0;
        for (int i = 2; i <= n/2; i++){
            if (n%i == 0){
                c++;
                System.out.println("Not Prime");
                break;
            }
        }
        if (c == 0) {
            System.out.println("Prime Number");
        }
    }
}
public class ChapterA_098_03 {

    public static void main(String[] args) {
        PrimeNumbers obj = new PrimeNumbers();
        Scanner gc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int num = gc.nextInt();
        obj.setN(num);
        obj.checkPrime();
    }
}
