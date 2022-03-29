 class Solution {
    public String XXX(String[] strs) {
        // 排除边界情况
        if(strs == null || strs.length < 0)
            return "";
        
        // 默认第一个字符串为最长公共前缀
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++) {
            // 从左往右扫描，总是假定当前prefix为最长公共子串，求前缀的交集
            prefix = toCharAndCompare(prefix,strs[i]);
            if(prefix == "")
                return "";
        }
        return prefix;
    }

    private String toCharAndCompare(String prefix,String target) {
        // 测试用例里面有 ["",""] 需要考虑这种情况,否则直接charAt()会报错
        if(prefix.equals("") || target.equals(""))
    		return "";
        if(prefix.charAt(0) - target.charAt(0) != 0)
            return "";
        StringBuilder builder = new StringBuilder();
        builder.append("");
        // i -> prefix 的下标 j -> target 的下标
        for(int i = 0,j = 0; i < prefix.length() & j < target.length(); i++,j++) {
            if(prefix.charAt(i) - target.charAt(i) == 0)
                builder.append(prefix.charAt(i));
            else break;
        }
        return builder.toString();
    }
}

