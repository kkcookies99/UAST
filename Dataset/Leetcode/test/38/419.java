 class Solution {
   public static String XXX(int n) {
        String str = "1";
        for(int i = 1; i < n; i++){
            StringBuffer sb = new StringBuffer();
            int p1 = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) != str.charAt(p1)){
                    sb.append(j - p1);
                    sb.append(str.charAt(p1));
                    p1 = j;
                }
                // 走到最后的时候必须要处理
                if(j == str.length() - 1){
                    sb.append(j - p1 + 1);
                    sb.append(str.charAt(p1));
                }
            }
            str = sb.toString();
        }
        return str;
    }
}

