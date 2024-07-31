/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapterc_098_03;


public class ChapterC_098_03 {

    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3;

        c1.set(1.2f, -3.4f);
        c2.set(-5.6f, 7.8f);

        System.out.println("Complex number 1: ");
        c1.disp();

        System.out.println("Complex number 2: ");
        c2.disp();

        c3 = c1.sum(c2);
        System.out.println("Sum of complex numbers: ");
        c3.disp();
    }
}

class Complex {
    float real, imaginary;

    void set(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void disp() {
        if (real < 0 && imaginary < 0) {
            System.out.println(real + " " + imaginary + "i");
        } else if (real < 0){
            System.out.println(real + " + " + imaginary + "i");
        } else if (imaginary < 0){
            System.out.println(real + " " + imaginary + "i");
        } else {
        System.out.println(real + " + " + imaginary + "i");
        }
    }

    Complex sum(Complex c) {
        Complex result = new Complex();
        result.real = this.real + c.real;
        result.imaginary = this.imaginary + c.imaginary;
        return result;
    }
}
