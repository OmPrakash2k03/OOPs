/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chaptera_098_02;

class OddNumbers {
    int start;
    int end;
    
    void setRange(int a, int b) {
        start = a;
        end = b;
    }
    
    void printOddInRange() {
        for (int i = start; i <= end; i++){
            if (i%2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
public class ChapterA_098_02 {

    public static void main(String[] args) {
        OddNumbers obj = new OddNumbers();
        obj.setRange(1, 100);
        obj.printOddInRange();
    }
}
