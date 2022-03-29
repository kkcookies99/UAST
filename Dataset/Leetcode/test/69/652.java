class Solution {
    public int XXX(int x) {
        int left = 0;
        int right = x;
        int max = (int)Math.sqrt(Integer.MAX_VALUE);

        while(left<=right){
            int mid = left+(right-left)/2;
            if(mid>max){
                mid = max;
            }
            int tmp = mid*mid;
            if(tmp ==x){
                return mid;
            }
            if(tmp<x&&(mid+1)>x/(mid+1)){
                return mid;
            }

            if(x<mid*mid){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;

    }
}

