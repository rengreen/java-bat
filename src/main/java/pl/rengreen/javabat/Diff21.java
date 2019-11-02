package pl.rengreen.javabat;

/*
Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.
*/

class Diff21 {
    int diff21(int n) {
        return (n>21) ? 2*Math.abs(n-21) : Math.abs(n-21);
    }
}
