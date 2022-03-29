class Solution {
    public String XXX(int n) {
        if(n == 1) return "1";
        char[] pre = XXX(n-1).toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char cur = pre[0];
        for(int i = 1,l = pre.length; i < l; i++){
            if(pre[i]==cur){
                count++;
                continue;
            }else{
                sb.append(count);
                sb.append(cur);
                count = 1;
                cur = pre[i];
            }
        }
        sb.append(count);
        sb.append(cur);
        return sb.toString();
    }
}

