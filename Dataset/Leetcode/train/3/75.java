     public int XXX(String s) {
        if (s == null || s.length() == 0) return 0;
        int max = 1;
        for (int start = 0, end = 0; end < s.length() - 1; end++) {
            //获得当前窗口
            String window = s.substring(start, end + 1);
            //下一个字符索引
            int nextIndex = end + 1;
            //获取当前窗口的下一个字符
            char c = s.charAt(nextIndex);
            int index = window.indexOf(c);
            //如果当前窗口的下一个字符c在当前窗口中
            if (index != -1) {
                start = index + 1 + start;
            }
            max = Math.max(max, nextIndex - start + 1);
        }
        return max;
    }

