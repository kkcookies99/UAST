 class Solution {
    public String XXX(String[] strs) {
        if(strs.length<1)return "";
        if(strs.length==1)return strs[0];
        StringBuilder result=new StringBuilder();
        Arrays.sort(strs);
        String first=strs[0];
        String end=strs[strs.length-1];
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)==end.charAt(i))
                result.append(first.charAt(i));
            else break;
        }
        return result.toString();
    }
}

