class Solution {
    public int XXX(int x) {
	//特殊值特殊处理
        if(x == 1 || x == 0){
            return x;
        }
        int left = 0;
        int right = x;
        int mid = 0;
	//经典二分—注意等值处理
        while(left <= right){
            mid = left + (right - left) / 2;
            if(mid > x / mid){
                right = mid - 1;
            }else if(mid < x / mid){
                left = mid + 1;
            }else{
		//相等毫无疑问返回mid
                return mid;
            }
        }
	//否则，则一定是right
        return right;
    }
}

