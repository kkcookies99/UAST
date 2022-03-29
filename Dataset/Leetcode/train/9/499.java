 class Solution {
    public boolean XXX(int x) {
        // 分析：首先负数不是回文数列
        // 其次，回文数列正过来翻过来是一样的，那就将它翻过来，进行比较
        if(x < 0) return false;
        int temp = x, y = 0;
        while(temp != 0){
            y = y * 10 + temp % 10;
            temp = temp / 10;
        }
        return y == x;
    }
}

