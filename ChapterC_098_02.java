/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapterc_098_02;

public class ChapterC_098_02 {

    public static void main(String[] args) {
        System.out.println("Main method starts");
        ExecutionOrder obj = new ExecutionOrder();
        obj.localBlock();
        System.out.println("Main method ends");
    }
}

class ExecutionOrder {
    static {
        System.out.println("1. Static block");
    }

    {
        System.out.println("2. Instance block");
    }

    ExecutionOrder() {
        System.out.println("3. Constructor");
    }

    void localBlock() {
        {
            System.out.println("4. Local block inside method");
        }
    }
}