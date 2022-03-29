 class Solution {
    public String XXX(int n) {
        
        if(n == 1) {
            return "1";
        }else {
            String res = XXX(n-1);
            char[] c = res.toCharArray();
            int count = 1;
            StringBuilder sb = new StringBuilder();
            for(int i=1; i<c.length; i++) {
                if(c[i-1] == c[i]) {
                    count++;
                }else {
                    sb.append(count);
                    sb.append(c[i-1]);
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(c[c.length-1]);
            return sb.toString();
        }

    }
}

