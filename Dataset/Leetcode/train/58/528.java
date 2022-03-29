class Solution {
    public int XXX(String s) {
        if(s == null || s.length() == 0) return 0;
        //去除字符串的前后部分的全角和半角的空格。
         String str = s.trim();
         int lastEnd = str.length()-1;
         int le = 0;
         while(lastEnd>=0){
             if(str.charAt(lastEnd) == ' ') break;
             le++;
             lastEnd--;
         }
         return le;
         }
    }


