 class Solution {
    public boolean XXX(int x) {
        //将末尾为0和小于0的数排除
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        //定义后半部分
        int num = 0;
        while(true){
            //最慢循环n/2+1次即可退出
            num = x % 10 + num*10;
            x = x / 10;
            //偶数情况下两数相等
            if(x == num){
                return true;
            }
            //偶数下的两数不等和奇数情况
            if(x < num){
                return x == num/10 ? true : false;
            }
        }
    }
}
 @```

