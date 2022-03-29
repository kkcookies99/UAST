class Solution {
    public int XXX(int x) {
        if(x<2) return x;
        int l=1,r=x,m=1;
        while(l<=r){
            m=l+(r-l)/2;
            if(m>x/m) r=m-1;//先截取上界
            else if((m+1)>x/(m+1)) return m;//如果m^2<x，但是m+1^2＞x,则平方根就定下来了
            else {
                l=m+1;
            }
        }
        return l;
    }
}

