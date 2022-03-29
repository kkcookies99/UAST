 class Solution {
    public boolean XXX(int x) {
        //将整数转字符串数组
        String str=String.valueOf(x);
        int length=str.length();
        for(int index=0;index < length/2;index++){
            //如果前面的值与后面的值不相等
            if(str.charAt(index)!=str.charAt(length-index-1)){
                return false;
            }
        }
        return true;
    }
}

