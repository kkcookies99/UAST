 class Solution {
    public boolean XXX(int x) {
        //如果x小于0 必定不是回文数 直接返回false
        if(x < 0){
            return false;
        }
        int a = x;
        int res = 0;
        //反转整数x
        while(x != 0){
            int temp = x % 10;
            res = res * 10 + temp;
            x = x /10;
        }
        //比较反转后的整数是否等于输入参数
        if(res != a){
            return false;
        }else{
            return true;
        }
    }
}

