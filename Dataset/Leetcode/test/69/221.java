class Solution {
    public int XXX(int x) {
        if(x==0) return 0;
        if(x==1) return 1;
        int left = 0,right = x;
        while(left<right){
            int mid = left+(right-left)/2;
            //if(mid*mid<=x) left=mid+1; ?
            if(x / mid >= mid) left=mid+1;
            else right=mid;
        } 
        return right-1;
    }
}

