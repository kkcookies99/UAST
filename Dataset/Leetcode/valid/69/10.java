class Solution {
    public int XXX(int x) {
        long i;
        for(i=0;i<x/2+1;i++)
            if(i*i<=x&&(i+1)*(i+1)>x) break;
        return (int)i;
    }
}

