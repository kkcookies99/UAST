 class Solution {
    public boolean XXX(int x) {
        //将整数类型的数字转成字符串
        String str=String.valueOf(x);
        //头指针
        int lowIndex=0;
        //尾指针
        int hightIndex=str.length()-1;
        while(lowIndex < hightIndex){
            if(str.charAt(lowIndex)!=str.charAt(hightIndex)){
                return false;
            }
            lowIndex++;//头指针向后移一位
            hightIndex--;//尾指针向前移一位
        }
        return true;
    }
}

