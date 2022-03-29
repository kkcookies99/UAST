 class Solution {
    public String XXX(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";
        String s = strs[0];
        int k = 0;

        while(k < s.length()){
            int i;
            for(i=1;i<strs.length;i++){
                if(k >= strs[i].length() || s.charAt(k) != strs[i].charAt(k))
                    break;
        }
        if(i != strs.length )
            break;
        k++;
        }

        return s.substring(0,k);
        
    }
}


