 class Solution {
    public String XXX(String[] strs) {
        String ans=strs[0];
        int n=strs.length;
        for (int i=0;i<n;i++) {
            if (!strs[i].startsWith(ans)){//如果不以ans开始,就将ans减少一个;再从头比较i=0
                if (ans.length()==0){
                    return "";
                }
                ans=ans.substring(0,ans.length()-1);
                i=0;
        }
       }
        return ans;
    }
}

