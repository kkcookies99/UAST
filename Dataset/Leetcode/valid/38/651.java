 class Solution {
    public String XXX(int n) {
        if(n==1){
            return "1";
        }
        String spre = XXX(n-1);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i<spre.length()){
            int start =i;
            char c = spre.charAt(i);
            while(i<spre.length()&&c==spre.charAt(i)){
                i++;
            }
            sb.append(i-start).append(c-'0');
        }
        return sb.toString();
    }
}

