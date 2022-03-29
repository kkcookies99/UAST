 class Solution {
    public String XXX(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = "", firstStr = strs[0];
        int index = 0;
        while (index < firstStr.length()) {
            prefix += firstStr.charAt(index);
            if (isAllStartWithPrefix(strs, prefix))
                index++;
            else
                break;
        }
        return index != 0 ? firstStr.substring(0, index) : "";
    }

    public boolean isAllStartWithPrefix(String[] strs, String prefix) {
        for (String s : strs) {
            if (!s.startsWith(prefix)) {
                return false;
            }
        }
        return true;
    }
}

