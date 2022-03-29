class Solution {
    public String XXX(int n) {
        String ans = "1";
        while(--n > 0){
            char[] cs = ans.toCharArray();
            char pre = cs[0];
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int i = 1 ; i < cs.length ; i++){
                if(cs[i] != pre){
                    sb.append(count+""+pre);
                    count = 1;
                    pre = cs[i];
                }else{
                    count++;
                }
            }
            sb.append(count+""+pre);
            ans = sb.toString();
        }
        return ans;
    }
}

