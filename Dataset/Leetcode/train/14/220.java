 public String XXX(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = "", firstStr = strs[0];
        int index = -1, i = 0;
        boolean allStartWithPrefix = true;
        while (i < firstStr.length() && allStartWithPrefix) {
            prefix = prefix + firstStr.charAt(i);
            allStartWithPrefix = isAllStartWithPrefix(strs, prefix);
            index = allStartWithPrefix ? i++ : index;
        }
        return index != -1 ? firstStr.substring(0, index+1) : "";
    }

    private boolean isAllStartWithPrefix(String[] strs, String prefix) {
        for (String s : strs) {
            if (!s.startsWith(prefix)) {
                return false;
            }
        }
        return true;
    }

