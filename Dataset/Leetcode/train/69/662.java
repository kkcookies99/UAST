class Solution {
    public int XXX(int x) {
        if(x==0) return 0;
        int i = 1, j = x/2;
        while(i<j){
            int mid = (i+j)/2;
            if(mid<=x/mid && mid+1>x/(mid+1)){
                return mid;
            }
            if(mid<x/mid){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return i;
    }
}

