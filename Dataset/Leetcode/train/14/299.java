 class Solution {
    public String XXX(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int i = 0;
        for(;i < str1.length();i++){
            if(str1.charAt(i) != str2.charAt(i)){
                break;
            }
        }
        return str1.substring(0,i);

    }
}

