/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapterc_098_04;


public class ChapterC_098_04 {

    public static void main(String[] args) {
        Example n1 = new Example();
        Example n2 = new Example();
        System.out.println("Before passing by value : " + n1.a);
        n1.call1(20);
        System.out.println("After passing by value : " + n1.a);
        System.out.println("Before passing by reference : " + n2.a);
        n2.call2(n2);
        System.out.println("After passing by reference : " + n2.a);
    }
}


class Example {
    int a = 10;

    void call1(int a) {
        a = a + 10;
    }

    void call2(Example ex) {
        ex.a = ex.a + 10;
    }
}