 class Solution {
    public int XXX(String s) {
        int INF_MAX = Integer.MAX_VALUE;
        int INF_MIN = Integer.MIN_VALUE;

        int n = s.length();
        char[] ss = s.toCharArray();

        //去掉前导空格
        int i = 0;
        while(i < n && ss[i] == ' '){
            i++;
        } 

        // 记录正负
        int sign = 1;
        if(i < n && ss[i] == '-'){
            sign = -1;
            i++;
        }else if(i < n && ss[i] == '+'){
            i++;
        }

        // 读入字符
        long res = 0;
        while(i < n && ss[i] >= '0' && ss[i] <= '9'){
            // 好恶心，各种溢出
            if(res > (INF_MAX - (ss[i] - '0')) / 10){
                return sign == 1 ? INF_MAX : INF_MIN;
            }

            res = res * 10 + (ss[i] - '0');
            i++;
        }
        res *= sign;
        
        return (int) res;
    }
}

