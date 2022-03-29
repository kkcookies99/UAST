class Solution {
    public boolean XXX(int x) {
        if(x < 0) return false;
        int result = 0;
        int temp = x;
        while(temp != 0){
            int num = temp%10;
            result = result*10 +num;
            temp = temp/10;
        }
        return result == x;
    }
}

