 class Solution {
    public String XXX(String s) {
        if (s.equals(""))return "";
        String[] strs = s.split("");
        String result = strs[0],temp;
        for (int i=0;i<strs.length;i++){
            String str1 = strs[i];
            for (int j=strs.length-1;j>i;j--){
                if (str1.equals(strs[j])){
                    temp = s.substring(i,j+1);
                    result = temp.length()>result.length()?temp:result;
                    break;
                }
            }
        }
        return result;
    }
}

