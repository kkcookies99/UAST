 class Solution {
    public String XXX(String[] strs) {

        String res = strs[0];

        // 维护最长公共前缀的终点位置
        int end = res.length();

        // 后边的字符串挨个比较
        for(int i = 1; i < strs.length; i++){
            String curStr = strs[i];
            int tempLen = Math.min(end, curStr.length());
            int j;
            for(j = 0; j < tempLen;j++){
                if(res.charAt(j) == curStr.charAt(j)){
                    continue;
                }else{
                    break;
                }
            }
            end = j;
            if(end == 0){
                break;
            }
        }

        return res.substring(0, end);
    }
}

