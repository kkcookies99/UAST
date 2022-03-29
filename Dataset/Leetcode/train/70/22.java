class Solution {
    public int XXX(int n) {

        if(n==0||n==1)
            return n;
        int bp[] = new int[n];
        bp[0]=1;
        bp[1]=2;
        for(int i=2;i<n;i++)
        {
            bp[i]=bp[i-1]+bp[i-2];
        }
        return bp[n-1];
    }
}

