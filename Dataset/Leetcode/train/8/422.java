 class Solution {
    private int seek(String s, int i, boolean negative){
        int ans = 0;
        while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            int digit = s.charAt(i++) - '0';
            if(ans > (Integer.MAX_VALUE - digit) / 10)
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            ans = ans * 10 + digit;
        }
        return  negative ? -ans : ans;
    }
    public int XXX(String s) {
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ')
                continue;
            if(s.charAt(i) == '+')
                return seek(s, i + 1, false);
            if(s.charAt(i) == '-')
                return seek(s, i + 1, true);
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
                return seek(s, i, false);
            break;
        }return 0;
    }
}


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


