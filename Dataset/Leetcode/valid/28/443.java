 class Solution {
    public int XXX(String haystack, String needle) {
       
        int n1 = haystack.length();
        int n2 = needle.length();
        int i = 0;  //记录haystack中遍历的次数
        int j = 0;  //记录needle中遍历的次数

        //考虑特殊情况，子串匹配长度为0
        if(needle.length() == 0){
            return 0;
        }
        
        while(i <n1-n2+1){//确定i的范围
            while(j <n2 && haystack.charAt(i)==needle.charAt(j)){
                //在没有超出范围的情况下，若对应位置相同则比较下一元素
                //只有全部执行完改循环，才能说明匹配成功
                j++;
                i++;
            }
            if(j == n2){//判断是匹配到字符串最后
                return i-j;  //若是，则返回相应的位置
            }
            else{
                i = i-j+1;   //如果没有匹配成功，则需i回到原来的位置+1，j=0
                j = 0;
            }
        }
        return -1;
    }
}

