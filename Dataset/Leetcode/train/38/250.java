class Solution {
    public String XXX(int n) {
        if(n == 1) return "1";
        String pre = XXX(n-1);
        StringBuilder sb = new StringBuilder();
        int left = 0, right = 0;
        while(right<pre.length()){
            while(right < pre.length() && pre.charAt(right)==pre.charAt(left)) right++;
            sb.append(right - left);
            sb.append(pre.charAt(left));
            left = right;
        }
        return sb.toString();
    }
}

