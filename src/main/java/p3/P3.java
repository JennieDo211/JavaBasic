package p3;

import p1.P;

public class P3 extends P {

    private void test() {
        P thirdObject = new P();
        thirdObject.a = 18;
        thirdObject.b = 18;
        super.c = 18; // protected
        thirdObject.d = 18;
    }


    public static void main(String[] args) {

    }
}
