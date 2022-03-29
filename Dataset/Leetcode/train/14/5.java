 class Solution {
    public String XXX(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        // 字典排序
        Arrays.sort(strs);
        // 取排序后第一个串
        String startStr = strs[0];
        // 取最后一个串与第一个串进行比较，取他们两个都有的公共前缀为最终结果
        while (!strs[strs.length - 1].startsWith(startStr)) {
            startStr = startStr.substring(0, startStr.length() - 1);
        }

        return startStr;
    }
}

