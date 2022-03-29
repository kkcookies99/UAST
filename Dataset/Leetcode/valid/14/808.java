 class Solution {
    public String XXX(String[] strs) {
        if(strs.length == 0)return "";
        String minStr = strs[0];
        for(int i = 1 ;i < strs.length ;i++){
            if(strs[i].length() < minStr.length())minStr = strs[i];
        }
        int len = minStr.length();
        for(int i = len;i > 0;i--){
            String res = minStr.substring(0,i);
            int idx = 0;
            while(idx < strs.length){
                if(!strs[idx].startsWith(res))break;
                idx++;
            }
            if(idx == strs.length)return res;
        }
        return "";
    }
}

