class Solution {
    public String XXX(String a, String b) {
        
        char[] as = a.toCharArray();
        char[] bs = b.toCharArray();
        int n = Math.max(a.length(), b.length());
        int[] res = new int[n];
        for(int i=n-1; i>=0; i--) {
            if(n-i <= a.length()) {
                res[i] = as[a.length() - n + i] - '0';
            }
        }
        for(int i=n-1; i>=0; i--) {
            if(n-i <= b.length()) {
                res[i] = res[i] + bs[b.length() - n + i] - '0';
            }
        }
        
        for(int i=res.length-1; i>0; i--) {
            if(res[i] == 2) {
                res[i-1] ++;
                res[i] = 0;
            }
            if(res[i] == 3) {
                res[i-1] ++;
                res[i] = 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        if(res[0]>1) {
            sb.append(1);
        }
        res[0] = res[0] % 2;
 
        for(int i=0; i<res.length; i++) {
            sb.append(res[i]);
        }
        
        return sb.toString();
    
    }
}

