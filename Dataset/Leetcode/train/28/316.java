 public int XXX(String haystack, String needle) {
        if (("").equals(needle)) return 0;
        if (haystack.length() < needle.length()) return -1;
        //定义Next数组
        int[] next = new int[haystack.length() + 1];
        //加上空格，下标从1开始处理起来方便
        String newHaystack = " " + haystack;
        String newNeedle = " " + needle;
        //求Next数组的过程
        for (int i = 2, j = 0; i <= needle.length(); i++) {
            while (j != 0 && newNeedle.charAt(i) != newNeedle.charAt(j + 1)) j = next[j];
            if (newNeedle.charAt(i) == newNeedle.charAt(j + 1)) j++;
            next[i] = j;
        }
        //KMP匹配过程
        for (int i = 1, j = 0; i <= haystack.length(); i++) {
            while (j != 0 && newHaystack.charAt(i) != newNeedle.charAt(j + 1)) j = next[j];
            if (newHaystack.charAt(i) == newNeedle.charAt(j + 1)) j++;
            //匹配成功直接return 本题只要求找第一次出现的位置
            if (j == needle.length()) {
                return i - needle.length();
            }
        }
        return -1;
    }

