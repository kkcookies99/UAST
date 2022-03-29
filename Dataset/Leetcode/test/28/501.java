  public int XXX(String haystack, String needle) {
        if (haystack == null || needle == null ||
                (haystack.length() == 0 && needle.length() == 0))
            return 0;
        int i = index_KMP(haystack, needle);
        return i;
    }

    /**
     * KMP匹配算法
     *
     * @param S 主串
     * @param T 子串/模式串
     * @return 成功就返回子串第一次出现的位置，失败返回-1
     */
    public int index_KMP(String S, String T) {
        int i = 1, j = 1;
        int next[] = get_next(T);
        if (next==null)
            return 0;
        while (i <= S.length() && j <= T.length()) {
            if (j == 0 || S.charAt(i - 1) == T.charAt(j - 1)) {//charAt是从下标0开始的
                ++i;
                ++j;
            } else
                j = next[j];//j回溯
        }
        if (j > T.length())
            return i - T.length() - 1;//本题中字符串是从0开始存储的
        else
            return -1;
    }


    //求模式串T的next数组
    public int[] get_next(String T) {
        int i = 1, j = 0;
        //数组下标0处不存储数据，从1开始存储第一个字符的next值
        int next[] = new int[T.length() + 1];
        if (T.length()==0)
            return null;
        next[1] = 0;
        while (i < T.length()) {
            if (j == 0 || T.charAt(i-1) == T.charAt(j-1)) {
                ++i;
                ++j;
                next[i] = j;
            } else
                j = next[j];
        }
        return next;
    }


