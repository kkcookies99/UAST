 class Solution {
    public boolean XXX(int x) {
        int num = x;
        long result = 0;
        while (x>0){
            result = result*10 + x%10;
            x /= 10;
        }
        return (int) result == num;
    }
}

