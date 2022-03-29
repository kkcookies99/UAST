class Solution {
    public int XXX(int x) {
        int low = 0;
        int high = x;
        while(low <= high){
            long mid = (low + high) / 2;
            long temp = mid * mid;
            if(temp == (long)x){
                return (int)mid;
            }else if(temp > x){
                if((mid - 1) * (mid - 1) < (long)x){
                    return (int)(mid - 1);
                }else{
                    high = (int)mid - 1;
                }
            }else{
                if((mid + 1) * (mid + 1) > (long)x){
                    return (int)mid;
                }else{
                    low = (int)mid + 1;
                }
            }
        }
        return low;
    }
}

