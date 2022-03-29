 public String XXX(String s) {
        //判空和空串
        if(s == null || s.length() == 0 ){
            return "";
        }
        
        int length = s.length();
        int start = 0;
        int end = 0;
        
        for (int i = 0 ; i < length ; i ++){
            int len1 = center(s ,i , i);
            int len2 = center(s ,i , i+1);
            int len = Math.max(len1,len2);
            //赋值比当前长的数值
            if(len > end - start + 1){
                start = i - (len - 1) / 2;
                end = i + len / 2 ;
            }
        }

        return s.substring(start , end + 1);
    }
    
    public int center(String s , int i , int j){
        int left = i;
        int right = j ;
        int length = s.length();
        while (left >= 0 && right < length && s.charAt(left) == s.charAt(right)){
            //从中心开始两边宽展
            left --;
            right ++;
        }
        //返回最大长度
        return right - left - 1;
    }

