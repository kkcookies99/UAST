 class Solution {
    public String XXX(String[] strs) {
        if(strs.length==0) return "";
        String str =strs[0];
        if(str.length()>1&&strs[1].length()>1&&str.charAt(0)!=strs[1].charAt(0))return "";
        for(int i=1;i<strs.length;i++){
            int k =0;
            while(k<str.length()&&k<strs[i].length()&&str.charAt(k)==strs[i].charAt(k)){
                k++;
            }
            str = str.substring(0,k);
        }
        return str;
        
    }
}


