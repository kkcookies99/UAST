class Solution {
    public boolean XXX(int x) {
        // 转换成字符串
        String s = x+"";
        // 定义其长度
        int n = s.length();
        // 通过for循环判断
        for(int i=0;i<n;i++){
            // 如果位数为1，则证明为回文数
            if(n == 1){
                return true;
            }
            // 带符号一定不是回文数
            if(s.charAt(i) == '-'){
                return false;
            }
            // 通过判断字符串收尾的值是否相等来返回值
            if(s.charAt(i) != s.charAt(n-(i+1))){
                return false;
            }
        }
        return true;
    }
}

