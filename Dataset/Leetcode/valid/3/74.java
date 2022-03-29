 class Solution {
    public int XXX(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        // 利用数组来记录字符的最大索引值，初始都为-1
        int[] context = new int[128];
        Arrays.fill(context, -1);
        int max = 0, lg = s.length(), start = 0, end = 0;
        while(end < lg) {
            // 判断该字符是否已经存在，当存在时，进行滑动，直接将开始置为重复字符的后一位
            final char c = s.charAt(end);
            if(context[c] > -1) {
                start = Math.max(context[c] + 1, start);
            }
            max = Math.max(max, end - start + 1);
            // 更新/设置 字符的新索引位
            context[c] = end++;
        }
        return max;
    }
}

