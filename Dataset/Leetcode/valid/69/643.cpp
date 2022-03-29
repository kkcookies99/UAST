class Solution {
public:
    int XXX(int x) {
        //二分查找：若把if判断条件中的除法改为乘法会溢出
    	if(x <= 1) {
    		return x;
		}
        int i = 0, j = x;
        int res = 0;
		while(i <= j) {
			int mid = (i + j) >> 1;
			if((mid <= (x / mid)) && ((mid + 1)  > (x / (mid + 1)))) {
				res = mid;
				break;
			} 
			if(mid > (x / mid)) {
				j = mid - 1;
			} else if(mid < (x / mid)) {
				i = mid + 1;
			}
		} 
		return res;
    }
};

