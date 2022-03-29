     public String XXX(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            String str = getPalindrome(s.substring(i));
            ans = str.length() > ans.length() ? str : ans;
        }

        return ans;
    }

    public String getPalindrome(String s) {
        String str = "";
        String ans = "";
        for(int i = 0; i < s.length(); i++) {
            if(str.length() > 0 && str.charAt(0) == s.charAt(i)) {
                str += "" + s.charAt(i);
                if(isPalindrome(str)) {
                    ans = ans.length() < str.length() ? str : ans;
                }
            } else {
                str += "" + s.charAt(i);
                if (i == s.length() - 1) ans = ans.length() < 1 ? str.charAt(0) + "" : ans;
            }
        }

        return ans;
    }

    public boolean isPalindrome(String s) {
        for(int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

