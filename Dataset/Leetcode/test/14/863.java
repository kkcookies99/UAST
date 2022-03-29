 class Solution {
    public String XXX(String[] strs) {
        int end=strs[0].length();
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()==0)
            return "";
            for(int j=0;j<strs[0].length()&&j<strs[i].length();){
                if(strs[i].charAt(j)==strs[0].charAt(j)){
                    if(j==Math.min(strs[0].length(),strs[i].length())-1)
                    end=Math.min(end,j+1);
                    j++;

                }else{
                    end=Math.min(end,j);
                    break;
                }

            }
            if(end == 0)
                break;
        }
        return strs[0].substring(0, end);
    }
}

