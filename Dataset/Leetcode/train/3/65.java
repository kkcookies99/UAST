 public int XXX(String s) {
        if (s.length() == 0 ){
            return 0;
        }
        char[] windows = new char[128];   //用于记录每个字符
        int left = 0 , right = 0 ;        //双指针控制窗口大小
        int maxlength = 0 ;               //记录窗口最大长度

        while(right< s.length()){
            char ch = s.charAt(right);     
            windows[ch]++; 

            //如果有重复字符则左边窗口一直加，直到剔除重复字符
            while (windows[ch] > 1){      
                char ch1 = s.charAt(left);
                windows[ch1]--;
                left++;
            }
            maxlength = Math.max(right - left+1 , maxlength);
            right++;
        }
        return maxlength;
    }

