 class Solution {
    public boolean XXX(int x) {
        //不是回文的情况
        if (x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int reverse = 0;
        //从上表可知 当x > 0时 表示reverse还没遍历一半 
        while (x > reverse){
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        //当为奇数时 直接/10 去掉中间部分即可
        return x == reverse || x == reverse / 10;

    }
}

