class Solution {
    public int XXX(int n) {
        int[] a = new int[n+1];
        if(n==0){return 0;}
        if(n==1){return 1;}
        if(n==2){return 2;}
        else{
            a[0] = 0;
            a[1] = 1;
            a[2] = 2;
            for(int b = 3;b<=n;b++){
            a[b]= a[b-1]+a[b-2];
            }
        }
        return a[n];
    }
}

