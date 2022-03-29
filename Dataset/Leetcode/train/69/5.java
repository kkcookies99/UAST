class Solution {
    public int XXX(int x) {
        if(x == 0) return 0;
        if(x < 4) return 1;
		
        // 使用二分查找
        int left = 0;
        int right = x;
        int mod = x / 2;

        while (left < right){
            if (left == right - 1){
                return left;
            }
            if ( (long)mod * mod == x){
                return mod;
            } else if ((long)mod * mod > x){
                right = mod;
                mod = (left + right ) / 2;
            } else {
                left = mod;
                mod = (left + right ) / 2;
            }
        }
        return mod;
    }
}

