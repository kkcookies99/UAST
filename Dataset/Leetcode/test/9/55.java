class Solution {
    public boolean XXX(int x) {
        if (x < 0)
            return false;
        int nums = 0;        
        int temp = x;
        int left, right;
        while (temp != 0) {
            temp /= 10;
            nums++;
        }
        left = nums - 1;
        right = 0;
        while (left > right) {
            if (getDigit(x, left--) != getDigit(x, right++))
                return false;            
        }
        return true;
    }
    
    private int getDigit(int x, int i) {
        x = x / (int)Math.pow(10, i);
        return x % 10;
    }
}

