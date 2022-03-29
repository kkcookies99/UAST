     public int XXX(String haystack, String needle) {
        if (!haystack.contains(needle)) return -1;
        String replace = haystack.replace(needle, "1");
        char[] chars = replace.toCharArray();
        int tem = 0;
        for (char c : chars) {
            if (c == '1'){
                break;
            }
            tem ++;
        }
        return tem;
    }

