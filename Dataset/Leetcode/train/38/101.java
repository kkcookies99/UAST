class Solution {
    public String XXX(int n) {
        StringBuilder b1 = new StringBuilder("1");
        if(n <= 1) return b1.toString();
        for(int i = 1; i < n; ++i){
            b1.append("A");
            StringBuilder sb = new StringBuilder();
            for(int j = 1, len = 1; j < b1.length(); ++j){
                if(b1.charAt(j) != b1.charAt(j - 1)){
                    sb.append(len);
                    sb.append(b1.charAt(j - 1));
                    len = 1;
                }
                else len++;
            }
            b1 = sb;
        }
        return b1.toString();
    }
}

