 class Solution {
    public int XXX(String str) {
          if (str == null) {
            return 0;
        }
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        int bol = 1;
        int ans = 0;
        char[] cdhr = str.toCharArray();
        int i = 0;
        if (cdhr[0] == '-') {
            bol = -1;
            i = i + 1;
        }else if(cdhr[0] == '+'){
            i = i + 1;
        }
        for (; i < str.length(); i++) {
            if (48 > str.charAt(i) || str.charAt(i) >57) {
                break;
            }

            if(ans*bol > Integer.MAX_VALUE/10||ans*bol == Integer.MAX_VALUE / 10 && (cdhr[i] - 48) > 7 ){
                return Integer.MAX_VALUE;
            }
            if(ans*bol < Integer.MIN_VALUE/10||ans*bol == Integer.MIN_VALUE / 10 && (cdhr[i] - 48) > 8 ){
                return Integer.MIN_VALUE;
            }
            ans = ans * 10 + (cdhr[i] - 48);

        }
        ans=ans*bol;

        return  ans;
  
    }
}`

