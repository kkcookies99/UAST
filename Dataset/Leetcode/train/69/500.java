class Solution {
    public int XXX(int x) {
        if(x==0 || x==0) return x;
        int left = 1,right = x,ans=-1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if((long)mid*mid>x){
                //你太大  搞小点
                right = mid-1;
            }
            else{
                ans = mid;
                left = mid+1;
            }
        }
        return ans;
    }
}

