 class Solution {
        public String XXX(String s) {
            if (s == null || s.length() <= 1)
                return s;
            StringBuilder sb = new StringBuilder("$#");

            for (int i = 0; i < s.length(); i++) {
                sb.append(String.valueOf(s.charAt(i)));
                sb.append("#");
            }
            char[] str = sb.toString().toCharArray();
            int[] r = new int[str.length];
            int mx = 0, id = 0, ansR = 0, ansCenter = 0;
            for (int i = 1; i < str.length; i++) {
                r[i] = mx - i > r[i] ? Math.min(r[2 * id - i], mx - i) : 1;
                while (i - r[i] >= 0 && i + r[i]< str.length
                        && str[i - r[i]] == str[i + r[i]])
                    r[i]++;
                if (i + r[i] > mx) {
                    mx = i + r[i];
                    id = i;
                }
                if (ansR < r[i]) {
                    ansR = r[i];
                    ansCenter = i;
                }
            }
            int maxStart = (ansCenter - ansR + 1) / 2;
            return s.substring(maxStart, maxStart + ansR - 1);
        }
    }

