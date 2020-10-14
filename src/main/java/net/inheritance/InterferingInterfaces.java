package net.inheritance;

public class InterferingInterfaces {
    public static void main(String[] args) {
        WhatOnEarth woe = new WhatOnEarth();
        woe.m1();
        woe.m1(100);
    }
}

interface T1{
}
interface T2{
    int VALUE = 10;
    void m1();
}

interface T3 extends T1, T2{
    public void m1();
    public void m1(int x);
}

class WhatOnEarth implements T3{

    @Override
    public void m1() {
        System.out.println(VALUE);
    }

    @Override
    public void m1(int x) {
        System.out.println(VALUE+x);
    }
}



class Basey{
    private float f = 1.0f;
    void setF(float f1){ this.f = f1; }
}
class BasedUp extends Basey{
    private float f = 2.0f;
    //1
//    protected void setF(float f1){ this.f = 2*f1; }
//    public void setF(double f1){ this.f = (float) 2*f1; }
    public void setF(float f1){ this.f = 2*f1; }
//    private void setF(float f1){ this.f = 2*f1; }
//    float setF(float f1){ this.f = 2*f1; return f;}
}