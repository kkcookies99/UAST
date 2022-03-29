 class Solution {
    public String XXX(String[] strs) {
        String getStr="";
        for(int i=1;i<strs.length;i++){
            getStr=strs[0].substring(0,i);
            for(String strInfo:strs){
                if(!getStr.substring(0,i).equals(strInfo.substring(0,i))){
                    return getStr;
                }
            }

        }
        return getStr;
    }
}

