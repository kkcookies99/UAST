 class Solution {

        public String XXX(String s) {
            int[] w = new int[s.length()];
            Arrays.fill(w, 0);
            w[0] = 1;
            char[] chars = s.toCharArray();
            int n; // 记录以指定元素为结尾的回文子串长度
            char t;
            for (int i = 1; i < chars.length; i++) {
                n = w[i - 1];

                // 重新计算回文
                if (i - n - 1 < 0 || chars[i - n - 1] != chars[i]) {
                    w[i] = findPalindrome(chars, i - n, i);
                    continue;
                }
                // 找到了后一个元素，且和当前元素相等
                if (chars[i - n - 1] == chars[i]) {
                    w[i] = w[i - 1] + 2;
                }
            }
            int index = 0;
            n = 1;

            // 遍历w找出以某个元素为结尾的最长回文子串
            for (int i = 0; i < w.length; i++) {
                if (w[i] > n) {
                    n = w[i];
                    index = i;
                }
            }

            return s.substring(index - n + 1, index + 1);
        }

        public int findPalindrome(char[] chars, int p, int q) {
            for (int i = p; i < q; i++) {
                if (chars[i] == chars[q]) {
                    int a = i, b = q, n = 0;
                    while (a < b && chars[a] == chars[b]) {
                        n++;
                        a++;
                        b--;
                    }
                    if (a == b) {
                        return n * 2 + 1;
                    }
                    if (a > b) {
                        return 2 * n;
                    }
                }
            }
            return 1;
        }
    }

