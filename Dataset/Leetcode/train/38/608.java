 class Solution {
    public String XXX(int n) {
        if( n==1 )
            return "1";
            
        int count = 0, //保存相同数的数目
            left = 0, //左指针
            right = 0; //右指针
        String str = XXX(n-1); //递归，获取前一项字符串
        StringBuffer result = new StringBuffer(); //保存结果字符串
        
        //外循环判断左指针是否遍历完
        while( left < str.length() ){
            //内循环右指针判断从左指针开始，左指针所指字符和右指针所指字符是否相等
            while( str.charAt(left) == str.charAt(right) ){
                //防止右指针索引越界
                if( right+1 < str.length() ){
                    //未越界右指针继续右移
                    right++;
                }else{
                    //越界也右移，但是不再在while判断，直接退出内循环
                    right++;
                    break;
                }
            }
            //计算相同数的个数
            count = right - left;
            //拼接对前一项的字符描述
            result.append(count)
                .append(str.charAt(left));
            //将左指针移至右指针处
            left = right;
        }
        
        return result.toString();
    }
}

