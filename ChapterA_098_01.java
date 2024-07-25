/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chaptera_098_01;
import java.util.Scanner;
class OddEven {
    int n;
    
    void setN(int k) {
        n = k;
    }
    
    void checkOddEven() {
        if (n%2==0) {
            System.out.println(n + " is an EVEN number");
        } else {
            System.out.println(n + " is an ODD number");
        }
    }
}
public class ChapterA_098_01 {

    public static void main(String[] args) {
        Scanner gc = new Scanner(System.in);
        OddEven obj = new OddEven();
        System.out.println("Enter n : ");
        int num = gc.nextInt();
        obj.setN(num);
        obj.checkOddEven();
    }
}
