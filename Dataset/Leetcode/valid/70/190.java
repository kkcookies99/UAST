class Solution {
    public int XXX(int n) {
        int a = 1,b = 2;
        if (n<=2) return n==2?b:a;
        while (n-->2){
            b = a+b;
            a = b-a;
        }
        return b;
    }
}

