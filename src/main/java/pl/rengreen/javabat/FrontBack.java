package pl.rengreen.javabat;

/*
Given a string, return a new string
where the first and last chars have been exchanged.
*/

class FrontBack {
    String frontBack(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }
        char[] array = str.toCharArray();
        int lastIndex=array.length -1;

        char first = array[0];
        array[0] = array[lastIndex];
        array[lastIndex] = first;
        return new String(array);
    }
}
