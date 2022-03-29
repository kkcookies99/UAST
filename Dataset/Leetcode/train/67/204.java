 class Solution {
    public String XXX(String a, String b) {
        StringBuilder sb = new StringBuilder();
        // a和b长度不一,缺少的部分前边补0
        int length = a.length()>b.length()?a.length()-b.length():b.length()-a.length();
        for(int i=0;i<length;i++){
            sb.append(0);
        }
        a = a.length()<b.length()?sb.toString()+a:a;
        b = b.length()<a.length()?sb.toString()+b:b;
        // 字符串转char数组
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        sb.delete(0,sb.length());
        // 是否进位
        boolean isGo = false;
        for(int i= a1.length-1;i>=0;i--){
            // 计算和
            int t = a1[i]-48+b1[i]-48;
            // 如果上一个需要进位，则再加1
            if(isGo){
                t += 1;
            }
            // 不够进位，直接添加
            if(t<2){
                sb.append(t);
                isGo = false;
            }else{ //进位
                sb.append(t-2);
                isGo = true;
            }
        }
        // 首位也需要进位
        if(isGo){
            sb.append(1);
        }
        // 倒置
        sb.reverse();
        return sb.toString();
    }
}

