class Solution {
    public String XXX(int n) {
        String res = "1";
        for(int i=1;i<n;i++){
            res = helper(res);
        }
        return res;
    }
    public String helper(String s){
        int len = s.length();
        if(len==1) return "11";
        //count计数，计算当前字符出现次数
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            //判断字符边界
            if(i+1 == len || c != s.charAt(i+1)){
                sb.append(count);
                sb.append(c);
                count = 1;
            }else{
                count++;
            }
        }
        return sb.toString();
    }
}

