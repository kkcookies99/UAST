class Solution {
    public int XXX(int n) {
        int[] a = new int[n+1];
            a[0] = 1;
            a[1] = 1;
        for(int b = 2;b<=n;b++){
        a[b]= a[b-1]+a[b-2];
        }
        return a[n];
    }
}

