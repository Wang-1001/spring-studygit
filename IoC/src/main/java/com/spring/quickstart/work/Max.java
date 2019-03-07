package com.spring.quickstart.work;

/*待測程序，
* */
public class Max {
    private  int a;
    private  int b;

    public Max(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getMax(){
        return a > b ? a : b;
    }
}
