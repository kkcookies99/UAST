class Solution {
    public int XXX(int x) {
        for (int  i=1;i<=x;i++){
            if(i*i==x) return i;
            if(i*i>x) return i-1;

        }
        return 0;
    }
}

