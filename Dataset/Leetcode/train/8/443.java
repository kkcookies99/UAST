 class Solution {
    public int XXX(String s) {
        String s1 = s.trim();
        if(s1.equals("-") || s1.equals("+")) return 0;
        StringBuilder sb = new StringBuilder();
        int i =0;
        boolean small = false; // 负数
        boolean use = false; // +-号出现过
        boolean cha = false; // 开始记录数字
        while(true){
            if(i==s1.length()) break;
            if(s1.charAt(i) == '-' && !use && !cha) {
                small = true;
                use = true;
                i+=1;
            }
            if(s1.charAt(i) == '+' && !use && !cha){
                use = true;
                i+=1;
            }
            if(s1.charAt(i) >= '0' && s1.charAt(i) <= '9'){
                cha = true;
                sb.append(s1.charAt(i));
                i+=1;
            } else{
                 break;
            }
        }
        if(sb.toString().equals("")){
            return 0;
        } 
        try{
            int res_temp = Integer.valueOf(sb.toString());
            return small ? (-1) * res_temp : res_temp;
        } catch(Exception e){
            return small ? -2147483648 : 2147483647;
        }
    }
}

