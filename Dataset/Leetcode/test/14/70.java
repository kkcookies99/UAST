 class Solution {
    public String XXX(String[] strs) {
        // 如果strs没有数据则返回""
        if (strs.length == 0) {
            return "";
        }

        // 获取最短字符串的长度值
        int minLength = strs[0].length();
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }

        // 二维数组的遍历，调整内外循环先后顺序即可得到不同的效果
        for (int j = 0; j < minLength; j++) {
            for (String str : strs) {
                // 遍历，只需要和第一个字符串strs[0]的比较即可,不用一一对比
                if (strs[0].charAt(j) != str.charAt(j)) {
                    return strs[0].substring(0, j);
                }

            }
        }
        // 如果遍历过后没有找到遍历结束出口，则表示最短的字符串就是公共前缀
        return strs[0].substring(0, minLength);
    }
}

