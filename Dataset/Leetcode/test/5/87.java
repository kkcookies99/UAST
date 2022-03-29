 public String XXX(String s) {
            if (s == null || s.length() == 0)
                return "";
            if (s.length() == 1)
                return s;

            int size = s.length();
            // 最大长度
            int maxLen = 1;
            // 开始截取的位置
            int start = 0;

            int[][] memo = new int[size][size];
            char[] chars = s.toCharArray();
            for (int i = 0; i < size; i++) {
                memo[i][i] = 1;
                if (i < size - 1 && chars[i] == chars[i + 1]) {
                    memo[i][i + 1] = 1;
                    start = i;
                    maxLen = 2;
                }
            }

            for (int l = 3; l <= size; l++) {
                for (int i = 0; i + l - 1 < size; i++) {
                    int j = l + i - 1;
                    if (chars[i] == chars[j] && memo[i + 1][j - 1] == 1) {
                        memo[i][j] = 1;
                        start = i;
                        maxLen = l;
                    }
                }
            }

            return s.substring(start, start + maxLen);
        }

