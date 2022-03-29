 class Solution {
    public int XXX(String s) {
        int flag = 0;
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; ++i){
            if(chars[i] == ' ' && sb.length() == 0 && flag == 0){
                continue;
            }else if("+".equals(sb.toString()) || "-".equals(sb.toString()) || sb.length() == 0){
                if(chars[i] == '0'){
                    flag++;
                    continue;
                }else if(chars[i] >= 48 && chars[i] <= 57 || (sb.length() == 0 && (chars[i] == '+' || chars[i] == '-') && flag == 0)){
                    sb.append(chars[i]);
                }else{
                    break;
                }
            }else if(sb.length() == 0 && (chars[i] == '+' || chars[i] == '-') && flag == 0){
                sb.append(chars[i]);
            }else if(chars[i] >= 48 && chars[i] <= 57){
                sb.append(chars[i]);
            }else{
                break;
            }
        }
        if("+".equals(sb.toString()) || "-".equals(sb.toString()) || sb.length() == 0) return 0;
        String str = sb.toString();
        if(str.contains("+")){
            if(str.length() >= 20){
                return Integer.MAX_VALUE;
            }
        }else if(str.contains("-")){
            if(sb.length() >= 20)
                return Integer.MIN_VALUE;
        }else{
            if(str.length() >= 19){
                return Integer.MAX_VALUE;
            }
        }
        long i = Long.parseLong(str);
        if(i > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(i < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }else{
            return (int)i;
        }
    }
}

