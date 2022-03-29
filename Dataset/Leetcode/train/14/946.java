 class Solution {
    public String XXX(String[] strs) {
       // 默认前缀
        String prefix = strs[0];
        String pubPrefix = "";
        // 按前缀顺序匹配
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            boolean flag = false;
            for (int j = 0; j < strs.length; j++) {
                // 如果当前的词出现不相等，结束内循环并标记结束外循环
                if (i>strs[j].length()-1 ||  c != strs[j].charAt(i)) {
                    flag = true;
                    break;
                }
            }
            // 结束外循环
            if (flag) {
                break;
            }
            pubPrefix = pubPrefix + new String(new char[]{c});
        }
        return pubPrefix;
    }
}

