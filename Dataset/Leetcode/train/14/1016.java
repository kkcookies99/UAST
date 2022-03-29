 class Solution {
    public String XXX(String[] strs) {
        int len = strs.length;
        if (len==0){
            return "";
        }
        String first = strs[0];
        int maxLen =0;
        for (int i =0;i<first.length();i++){
            int count =0;
            for (int j =1;j<len;j++){
                if (i>=strs[j].length()){
                    break;
                }
                if (count!=j-1){
                    break;
                }
                if (first.charAt(i)==strs[j].charAt(i)){
                    count++;
                }
            }
            if (count==strs.length-1){
                maxLen++;
            }else {
                break;
            }
        }
        return first.substring(0,maxLen);
    }
}

