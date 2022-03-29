 class Solution {
    public int XXX(String s) {
        int m = 0;
        int result = 0;
        while (m == 0  && !s.equals("")){
            int start = 0;
            String res = "";
            for (int i = start; i < s.length(); i++) {
                String s1 = String.valueOf(s.charAt(i));
                if (res != null && res.contains(s1)){
                    start = i;
                    if(res.length() > result){
                        result = res.length();
                        res = s1;
                    }
                }else {
                    res += s1;
                    start ++;
                }
                if (i == s.length()-1){
                    m = 1;
                }
            }
        }
        return result;
    }
}

