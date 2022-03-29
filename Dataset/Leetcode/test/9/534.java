 class Solution {
    public boolean XXX(int x) {
        int result = 0;
        int num = x;
        if (x < 0) {
            return false;
        } else {
            while (x != 0) {
                result = (result * 10) + (x % 10);
                x /= 10;
            }
            if(result == num){
                return true;
            }
        }
        return false;
    }
}

