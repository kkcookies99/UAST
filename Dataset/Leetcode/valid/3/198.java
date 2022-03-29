 class Solution {
    public int XXX(String s) {
        // 准备
        // map 存储下标，初始化为 -1
        int[] map = new int[128];
        char[] strs = s.toCharArray();
        for (int i = 0; i < 128; i++) {
            map[i] = -1;
        }
        // 
        int maxLen = 0;
        int left = 0;
        for(int right = 0;right<strs.length;right++){
            char c = strs[right];
            if(map[c] != -1){
                // 2.如果坐标变动了
                // 2.1.left 小于 map 存储的坐标，left 变成 char 后一位；
                // 2，2.left 大于 map 存储的坐标，不用改变；
                left = Math.max(map[c]+1,left);
            }
            // 1.map 始终存储最新的下标
            map[c] = right;
            maxLen = Math.max(right-left+1,maxLen);
        }
        return maxLen;
    }
}

