class Solution {
    public String XXX(int n) {
        String ans = "1";
        for(int i=2;i<=n;i++){
            StringBuffer sb = new StringBuffer();
            int end = 0;
            int start = 0;
            while(end<ans.length()){
                while(end<ans.length() && ans.charAt(end) == ans.charAt(start)){
                    end++;
                }
                sb.append(String.valueOf(end-start)).append(ans.charAt(start));
                start = end;
            }
            ans = sb.toString();
        }
        return ans;
    }
}

