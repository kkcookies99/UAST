class Solution {
    public int XXX(int x) {
        long n = x;
        while(n*n>x){
            n = (n+x/n)/2;
            System.out.println(n);
        }

        return (int)n;

    }
}

