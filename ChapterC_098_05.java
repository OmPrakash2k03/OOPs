/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapterc_098_05;

/**
 *
 * @author sonum
 */
public class ChapterC_098_05 {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        rectangle1.length = 5f;
        rectangle1.width = 2.5f;
        rectangle2.length = 5f;
        rectangle2.width = 18.9f;

        System.out.println("Rectangle 1:");
        rectangle1.show();
        System.out.println("Perimeter of Rectangle 1 : " + rectangle1.perimeter());
        System.out.println("Area of Rectangle 1 : " + rectangle1.area());

        System.out.println("\nRectangle 2:");
        rectangle2.show();
        System.out.println("Perimeter of Rectangle 2 : " + rectangle2.perimeter());
        System.out.println("Area of Rectangle 2 : " + rectangle2.area());

        // Check whether the two Rectangles have the same area
        if (rectangle1.isSameArea(rectangle2)) {
            System.out.println("\nRectangle 1 and Rectangle 2 have the same area.");
        } else {
            System.out.println("\nRectangle 1 and Rectangle 2 do not have the same area.");
        }

        rectangle1.setLength(15f);
        rectangle1.setWidth(6.3f);

        System.out.println("\nAfter setting new dimensions for Rectangle 1:");
        System.out.println("Rectangle 1:");
        rectangle1.show();
        System.out.println("Perimeter of Rectangle 1: " + rectangle1.perimeter());
        System.out.println("Area of Rectangle 1: " + rectangle1.area());

        System.out.println("\nRectangle 2:");
        rectangle2.show();
        System.out.println("Perimeter of Rectangle 2: " + rectangle2.perimeter());
        System.out.println("Area of Rectangle 2: " + rectangle2.area());

        // Check whether the two Rectangles have the same area again
        if (rectangle1.isSameArea(rectangle2)) {
            System.out.println("\nRectangle 1 and Rectangle 2 have the same area.");
        } else {
            System.out.println("\nRectangle 1 and Rectangle 2 do not have the same area.");
        }
    }
}


class Rectangle {
    float length;
    float width;

    void setLength(float length) {
        this.length = length;
    }

    void setWidth(float width) {
        this.width = width;
    }

    float perimeter() {
        return 2 * (length + width);
    }

    float area() {
        return length * width;
    }

    void show() {
        System.out.println("Length : " + length);
        System.out.println("Width : " + width);
    }

    boolean isSameArea(Rectangle other) {
        return this.area() == other.area();
    }
}
