class Solution {
    public int XXX(int x) {
        if(x==1){
            return 1;
        }
        long l=0,r=(long)x/2;
        while(l<r){
            long mid=l+(r-l)/2;
            if(mid*mid<x){
                l=mid+1;
            }else if(mid*mid>x){
                r=mid;
            }else{
                return (int)mid;
            }
        }
        return l*l>x ? (int)l-1:(int)l;
    }
}

