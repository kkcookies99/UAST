 class Solution {
    public String XXX(String[] strs) {
        if(strs.length==1) return strs[0];
        
        if(strs.length==0) return "";
        
        for(int i=1;i<strs.length;i++){
            int p=0;
            while(p<strs[i].length()&&p<strs[0].length()
                  &&strs[i].charAt(p)==strs[0].charAt(p))
                p++;
            
            if(p==0) return "";
            strs[0]=strs[0].substring(0,p);
        }
        return strs[0];
    }
}

