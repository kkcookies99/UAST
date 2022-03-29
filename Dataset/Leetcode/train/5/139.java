 class Solution {
    public String XXX(String s) {
        char[] chars = s.toCharArray();
        if (s.length() == 0 || s.length() ==1){
            return s;
        }
        String str = "";
        for (int i = 0 ; i < chars.length; i++){
            int time = 0;
            int n = 0;
            while (i+n+1 < chars.length && chars[i+n] == chars[i+n+1]){
                n++;
            }
            if (n+1 > str.length()){
                str = s.substring(i,i+n+1);
            }

            while (i-time >= 0 && i+n+time < s.length()){
                if (chars[i-time] == chars[i+n+time]){
                    if (time*2+n+1 > str.length()) {
                        str = s.substring(i-time,i+n+time+1);
                    }
                    time++;
                }else{
                    if ((time-1)*2+n+1 > str.length()){
                        str = s.substring(i-time+1,i+n+time);
                    }
                    break;
                }
            }
        }
        return str;
    }   
}

