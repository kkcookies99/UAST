 class Solution {
    public int XXX(String s) {
        // 1. 忽略前导零和空格
        // 2. 确定正负
        // 3. 字符串中间出现除了数字之外的非法字符则break
        long num = 0;
        int count = 0;
        boolean isNegative = false;
        //只能有一个符号
        int sign = 0;
        for(int i=0;i<s.length();++i){
            char c = s.charAt(i);
            //前导符号，只能有一个
            if((c=='-' || c=='+')&&count==0&&sign==0){
                isNegative = c=='-';
                sign++;
            //前导空格
            }else if(c==' '&&count==0&&sign==0){
                continue;
            }else if(c>='0'&&c<='9'){
                num=num*10+(c-'0');
                count++;
                if(num>Integer.MAX_VALUE || num<Integer.MIN_VALUE){
                    break;
                }
            //其余情况都是非法的，直接返回
            }else {
                break;
            }
        }
        if(count==0){
            return 0;
        }
        if(isNegative){
            return (int)num==num ? -(int)num : Integer.MIN_VALUE;
        }else{
            return (int)num==num ? (int)num : Integer.MAX_VALUE;
        }
    }
}

