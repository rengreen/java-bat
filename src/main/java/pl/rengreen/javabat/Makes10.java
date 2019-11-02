package pl.rengreen.javabat;

/*
Given 2 ints, a and b,
return true if one of them is 10 or if their sum is 10.
*/

class Makes10 {

    boolean makes10(int a, int b) {
        return a==10 || b==10 || (a+b==10);
    }
}
