/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chapterc_098_06;


public class ChapterC_098_06 {

    public static void main(String[] args) {
        DOB dob1 = new DOB();
        dob1.setDOB(06, 9,2004);
        DOB dob2 = new DOB();
        dob2.setDOB(30,07,2024);

        System.out.print("DOB1 : ");
        dob1.show();
        System.out.print("DOB2 : ");
        dob2.show();

        DOB ageDifference = dob1.findAge(dob2);
        System.out.print("Age Difference : ");
        ageDifference.show();
    }
}


class DOB {
    int date, month, year;

    void setDOB(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    void show() {
        System.out.println(date + "/" + month + "/" + year);
    }

    DOB findAge(DOB obj) {
        DOB difference = new DOB();

        if (this.date < obj.date) {
            this.date += 30;
            this.month -= 1;
        }
        difference.date = this.date - obj.date;

        if (this.month < obj.month) {
            this.month += 12;
            this.year -= 1;
        }
        difference.month = this.month - obj.month;

        difference.year = this.year - obj.year;
        
        return difference;
    }
}
