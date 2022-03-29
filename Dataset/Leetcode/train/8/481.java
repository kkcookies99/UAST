 class Solution {
    public int XXX(String s) {

        char sign = '+';
        int count = 0;
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        // 1.找到第一个非空格字符
        while(i < s.length()){
            if (s.charAt(i) == ' '){
                i++;
            }else{
                break;
            }
        }
        // 2.找到第一个非正负号字符
        while(i < s.length()){
            if (s.charAt(i) == '+' || s.charAt(i) == '-'){
                sign = s.charAt(i);
                count++;
                i++;
            }else{
                break;
            }
        }

        // 列表添加正负号字符
        sb.append(sign);

        // 3.添加数字字符
        int flag = 0;
        while(i< s.length()){
            // 多个+,-号
            if(count > 1){
                break;
            }
            if(flag == 0){
                // 找到第一个非0的数字
                if (s.charAt(i) > '0' && s.charAt(i) <= '9'){
                    flag = 1;
                    sb.append(s.charAt(i));
                    i++;
                }else if((int) s.charAt(i) == (int) '0'){
                    i++;
                    continue;
                }else{
                    break; // 非数字字符
                }
            }else if(flag == 1){
                // 继续寻找数字
                if (s.charAt(i) >= (int) '0' && s.charAt(i) <= (int) '9'){
                    sb.append(s.charAt(i));
                    i++;
                }else{
                    break; 
                }
            }
        }
        
        String str = sb.toString();
        if(str.length() == 1){
            return 0;
        }else{
            // 判断字符长度，加上符号的字符长度大于11，已经超出32位的范围。
            if(str.length() > 11){
                return sign == '+' ? (1 << 31) - 1 : -(1 << 31);
            }else{
                long result = Long.parseLong(str);
                if ((int) result == result){
                    return (int)result;
                }else{
                    return sign == '+' ? (1 << 31) - 1 : -(1 << 31);
                }
            }
        }
    }

}

