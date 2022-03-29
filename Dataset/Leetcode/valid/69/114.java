class Solution {
    public int XXX(int x) {
        if(x==0){
            return 0;
        }
        long left=1;
        long right=x;
        while(right>=left){
            long mid=(left+right)/2;
            if(mid*mid<=x&&(mid+1)*(mid+1)>x){
                return (int)mid;
            }else  if(mid*mid<x){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}

