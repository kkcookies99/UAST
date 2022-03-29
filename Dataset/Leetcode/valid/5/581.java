 public String XXX(String s) {
        int Maxlength = 0;
        int tempLength = 0;
        String res = s.charAt(0) +"";
        String temp = "";
        int left = 0;
        int right = 0;

        //偶数回文的判断方法 + 中心扩展
        for (int i = 0; i < s.length(); i++) {
            left = i;
            right = i+1;
            tempLength = 0;

            while (left >=0 && right <= s.length()-1){
                if(s.charAt(left) == s.charAt(right)){
                    temp = s.substring(left, right+1);
                    tempLength += 2;
                }else {
                    break;
                }

                if(tempLength > Maxlength){
                    Maxlength = tempLength;
                    res = temp;
                }
                left--;
                right++;
            }
        }

        //奇数回文的判断方法 + 中心扩展
        for (int i = 1; i < s.length()-1; i++) {
            left = i-1;
            right = i+1;
            tempLength = 1;

            while (left >=0 && right <= s.length()-1){
                if(s.charAt(left) == s.charAt(right)){
                    temp = s.substring(left, right+1);
                    tempLength += 2;
                }else {
                    break;
                }

                if(tempLength > Maxlength){
                    Maxlength = tempLength;
                    res = temp;
                }

                left--;
                right++;
            }
        }
        //最大长度的判断方法
        return res;
    }

