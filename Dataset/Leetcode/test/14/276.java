 class Solution {
    public String XXX(String[] strs) {
        if(strs == null || strs.length < 1){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        // 获取字符串数组中字符串长度最小的的字符串的长度
        int length = strs[0].length();
        for(String str : strs){
            length = length < str.length() ? length : str.length();
        }
        
        for(int i = 0; i < length; i++){
            Character temp = null;
            boolean flag = true;
            for(String str : strs){
                if(temp == null){
                    temp = str.charAt(i);
                } else {
                    flag = temp == str.charAt(i);
                }
                // 如果相同位置的char字符不相同，跳出循环
                if(!flag){
                    break;
                }
            }
            if(flag) {
                sb.append(temp);
            } else {
                break;
            }
        }
        return sb.toString();
    }
}

