/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapterc_098_01;


public class ChapterC_098_01 {

    public static void main(String[] args) {
        Difference obj = new Difference();
        obj.set(98, "Om Prakash");
        obj.display();
    }
}

class Difference {
    int roll = 100;
    String name = "Rahul";

    void set(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll No. : " + roll);
    }
}