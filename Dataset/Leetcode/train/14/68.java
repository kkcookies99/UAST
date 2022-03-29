 class Solution {
    public String XXX(String[] strs) {
        int m=strs.length;
        int n=strs[0].length();
        int flag=1;
        int loc=0;
        for(int i=0;i<n;i++)
        {
            char cur=strs[0].charAt(i);
            for(int j=1;j<m;j++)
                if(i>=strs[j].length()||strs[j].charAt(i)!=cur)
                    flag=0;
            if(flag==1)
                loc++;
        }  
        return strs[0].substring(0,loc);
    }
}

