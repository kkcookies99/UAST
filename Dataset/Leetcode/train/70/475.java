class Solution {
    public int XXX(int n) {
        int a=1;
        int b=2;
        int sum=0;
        if(n<=2){
            return n;
        }
        if(n>2){
           sum= XXX(n-1)+XXX(n-2);
        }
        return sum;
    }
}

