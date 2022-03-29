 public String XXX(String s) {
        int len = s.length();
        if(len <= 1)
            return s;
        String longest = s.substring(0,1);
        // 定义窗口,i为窗口长度,初始为2
        for(int i = 2; i < len+1; i++) {
            // 从坐标j = 0开始滑动
            for(int j = 0; j < len-i+1; j++) {
                if(isPalindromic(s.substring(j, j+i))) {
                    longest = s.substring(j, j+i);
                    break;
                }
            }
        }
        return longest;
    }
    
    private boolean isPalindromic(String substr) {
        int len = substr.length();
        for(int i = 0; i < len/2; i++) {
            if(substr.charAt(i) != substr.charAt(len - i -1))
                return false;
        }
        return true;
    }

