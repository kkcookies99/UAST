 class Solution {
    public boolean XXX(String s) {
        if(s == null){
            return true;
        }
        
        String lowerWords = s.toLowerCase();
        int begin = 0;
        int end = lowerWords.length() - 1;
        while(begin <= end){
            char c1 = lowerWords.charAt(begin);
            char c2 = lowerWords.charAt(end);

            //两个都是字母
            if(c1 >= 97 && c1 <= 122 && c2 >= 97 && c2 <= 122){
                if(c1 != c2){
                    return false;
                }
                begin++;
                end--;
            }
            //两个都是数字
            else if(c1 >= 48 && c1 <= 57 && c2 >= 48 && c2 <= 57){
                if(c1 != c2){
                    return false;
                }
                begin++;
                end--;
            }
            //c1、c2类型不同
            else if((c1 >= 97 && c1 <= 122) && (c2 >= 48 && c2 <= 57)){
                return false;
            }
            //c1、c2类型不同
            else if((c2 >= 97 && c2 <= 122) && (c1 >= 48 && c1 <= 57)){
                return false;
            }
            //两个其中一个为 无效字符
            else if((c1 >= 97 && c1 <= 122) || (c1>=48 && c1<= 57) ){
                end--;
            }
            else if((c2 >= 97 && c2 <= 122) || (c2>=48 && c2<= 57) ){
                begin++;
            }
            //两者都不是字母、数字
            else{
                begin++;
                end--;
            }
        }
        return true;

    }
}

