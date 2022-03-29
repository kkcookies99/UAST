class Solution {
    public int XXX(String s) {
        if(s == null || s.length() == 0) return 0;
        s = s.trim();
        if(s.length() == 0) return 0;
        boolean isMinus = false;
        char ch = s.charAt(0);
        int ans = 0;
        if(ch == '-'){
            isMinus = true;
        } else if(ch == '+'){
            isMinus = false;
        } else if(Character.isDigit(ch)){
            isMinus = false;
            ans = ch - '0';
        } else {
            return 0;
        }
        int index = 1;
        if(isMinus){
            if(index < s.length() && Character.isDigit(s.charAt(index))){
                ans = '0' - s.charAt(index);
                index++;
            } else {
                return 0;
            }
        }
        for(int i = index; i < s.length(); i++){
            ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int temp = ch - '0';
                if(ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && temp > 7)) return Integer.MAX_VALUE;
                if(ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && temp > 8)) return Integer.MIN_VALUE;
                if(isMinus){
                    ans = ans * 10 - temp;
                } else {
                    ans = ans * 10 + temp;
                }
                
            } else {
                return ans;
            }
        }
        return ans;
    }
}

