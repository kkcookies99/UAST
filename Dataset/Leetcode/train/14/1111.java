 class Solution {
    public String XXX(String[] strs) {
        int minStrLength=201;
        String minStr="";
        for(int i=0;i<strs.length;i++)
        {
            if(strs[i].length()<minStrLength)
            {
                minStrLength=strs[i].length();
                minStr=strs[i];
            }
        }
        for (String string : strs) {
            while(!string.startsWith(minStr)){
                if(minStr.length()==0)return "";
                minStr=minStr.substring(0,minStr.length()-1);
            }
        }
        return minStr;  
    }
}

