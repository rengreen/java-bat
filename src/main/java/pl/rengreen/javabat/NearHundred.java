package pl.rengreen.javabat;

/*
Given an int n,
return true if it is less than 10 away from 100 or 200.
*/

class NearHundred {

    boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }
}
