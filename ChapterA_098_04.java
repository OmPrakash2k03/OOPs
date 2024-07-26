/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chaptera_098_04;

class IsPrimeGenerate
{
    private int count;
    private int i,j;
    public void getloop()
    {
        for(i=1;i<=100;i++)
        {
            count=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count=count+1;
                }
            }
            if(count==2)
            {
                System.out.print(i+" ");
            }
        }
    }
}
public class ChapterA_098_04 {

    public static void main(String[] args) {
        IsPrimeGenerate ob=new IsPrimeGenerate();
        ob.getloop();
    }
}
