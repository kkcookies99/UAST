 class Solution {
    public String XXX(int n) {
        if(n==1) return "1";
        if(n==2) return "11";

        // 递归调用获得前一个字符串
        String pre = XXX(n-1);
        int len = pre.length();

        // 用 res 来保存最终结果
        String res = "";
        // 用 count 来记录相同连续字符的数量
        int count = 1;

        // 遍历第 1 到 n-1 个数，前后相同则 count++，不同则拼接字符串
        for(int i=0; i<len-1; i++){
            if(pre.charAt(i) == pre.charAt(i+1)){
                count += 1;
            } else{
                res = res + count + pre.charAt(i);
                count = 1;
            }
        }

        // 判断最后一个字符串是否和前一个相同
        if(pre.charAt(len-1) == pre.charAt(len-2)){
            res = res + count + pre.charAt(len-1);
        } else{
            res = res + "1" + pre.charAt(len-1);
        }

        return res;
    }
}

