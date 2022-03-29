 class Solution {
    public String XXX(String[] strs) {

        if (strs == null) return "";
        if (strs.length == 1) return strs[0];

        // 直接使用第一个字符串作为基准字符串
        String tempStr = strs[0];

        StringBuilder sb = new StringBuilder();
        
        // 从基准字符串中依次取出
        for (int i = 0; i < tempStr.length(); i++) {
            sb.append(tempStr.charAt(i));
            // 遍历字符串数组
            for (String str : strs) {
                // 如果字符串不包含当前查找的字符
                if (!(str.startsWith(sb.toString()))) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }

        return sb.toString();
    }
}


