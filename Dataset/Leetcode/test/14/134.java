 class Solution {
    public String XXX(String[] strs) {
        String res = "";
        int len = strs.length;
        if(len==0||strs[0].length()==0){
            return res;
        }
        if(len==1){
            return strs[0];
        }
        String[] temp = new String[strs[0].length()];
        int end = strs[0].length()-1;
        for(int i=0;i<strs[0].length();i++){
            temp[i] = String.valueOf(strs[0].charAt(i));
        }
        for(int i=1;i<len;i++){
            if(strs[i].length()==0){
                return res;
            }
            end = Math.min(end,strs[i].length()-1);
            for(int j=0;j<=end;){
                if(temp[j].equals(String.valueOf(strs[i].charAt(j)))){
                    j++;
                    continue;
                }
                end = Math.min(end,j-1);
                break;
            }
        }
        for(int i=0;i<=end;i++){
            res = res+temp[i];
        }
        return res;
    }
}

