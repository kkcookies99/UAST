 class Solution {
    public String XXX(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";
        if(strs.length == 1)
            return strs[0];
        Arrays.sort(strs);
        return longest(strs[0],strs[strs.length - 1]);
    }
    private String longest(String str1,String str2){
        int end = Math.min(str1.length(),str2.length());
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<end;i++){
            if(str1.charAt(i) != str2.charAt(i)){
                break;
            }
            builder.append(str1.charAt(i));
        }
        return builder.toString();
    }
}

