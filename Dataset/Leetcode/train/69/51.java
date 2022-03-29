class Solution {
    public int XXX(int x) {
        int left = 0;
        int right = x;
        if(x == 1 || x == 0){
            return x;
        }
        while(right - left > 1){
           int midlle = (right - left) / 2 + left;//防止溢出
            if(x / midlle  <midlle){    //用除法是因为只保留整数部分
                right = midlle;
            }else{
                left = midlle;
            }
        }
        return left;
    }
}

