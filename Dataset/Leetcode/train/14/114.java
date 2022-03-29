 class Solution {
    public String XXX(String[] strs) {
        if(strs.length==1) return strs[0];
        StringBuilder sb=new StringBuilder();
        int minlen=1000;
        for(int i=0;i<strs.length;i++){
            minlen=Math.min(minlen,strs[i].length());
        }
        for(int j=0;j<minlen;j++){
            for(int i=1;i<strs.length;i++){
                if(strs[i].charAt(j)!=strs[i-1].charAt(j)){
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(j));
        }
        return sb.toString();
    }
}

