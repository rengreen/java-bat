package pl.rengreen.javabat;

/*
Given two int values, return their sum.
Unless the two values are the same, then return double their sum.
*/

class SumDouble {
    int sumDouble(int a, int b) {
        return (a==b) ? 2*(a+b) : a+b;
    }
}
