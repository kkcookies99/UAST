class Solution {
    public boolean XXX(int x) {
        if(x < 0) return false; // 小于0直接返回false
        if(x >= 0 && x < 10) return true; // 10以内的正整数直接返回true
        int result = 0, temp = x;
        while(temp != 0){
            result = result * 10 + temp % 10;
            temp = temp / 10;
        }
        if(result == x) return true;
        else return false;
    }
}

