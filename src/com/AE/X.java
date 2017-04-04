package com.AE;

import java.util.Scanner;

/**
 * Created by Angel on 1/11/17.
 */
public class X {

    private int x;

    public X(Scanner x)
    {
        this.x = x.nextInt();
    }

    public void x(){
        for(int x = 0;x<=12;x++){
            System.out.println(x + " times " + this.x + " equals " + x * this.x);
        }
    }
}
