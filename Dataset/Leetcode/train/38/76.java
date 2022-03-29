class Solution {
    public String XXX(int n) {
        if(n == 1){
            return "1";
        }
        String s = "1";
        int i = 1;
        while(i < n){
            s = getStr(s);
            i++;
        }
        return s;
    }
    
    private String getStr(String str){
        char c = 0;
        int temp = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char tempc = str.charAt(i);
            if (c == 0) {
                temp++;
                c = tempc;
                if (i == str.length() - 1) {
                    sb.append(temp + "" + tempc);
                }
            } else {
                if (c == tempc) {
                    temp++;
                    if (i == str.length() - 1) {
                        sb.append(temp + "" + tempc);
                    }
                } else {
                    c = 0;
                    --i;
                    sb.append(temp + "" + str.charAt(i));
                    temp = 0;
                }
            }
        }
        return sb.toString();
    }
}