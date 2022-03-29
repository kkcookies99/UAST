 class Solution {
    public String XXX(String[] strs) {
        StringBuilder str = new StringBuilder();
        long minLen = 0;
        if (strs.length == 0){
            return "";
        }else {
            minLen = strs[0].length();
        }
        if (minLen == 0){
            return "";
        }
        for (String string : strs){
            if (string.length() < minLen){
                minLen = string.length();
            }
        }
        for (int i = 0;i <minLen;i++){
            char tmp = strs[0].charAt(i);
            boolean flag = true;
            for (int j = 0;j<strs.length;j++){
                if (strs[j].charAt(i) != tmp){
                    flag = false;
                    break;
                }
            }
            if (flag)
                str.append(tmp);
            else
                break;
        }
        return str.toString();
    }
}

