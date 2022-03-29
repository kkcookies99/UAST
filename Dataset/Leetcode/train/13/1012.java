 public int XXX(String s) {
        int res = 0, len = s.length(), tmpLen = 0;
        int[] albo = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] luoma = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        for (int i = 12, idx = 0; i >= 0 && idx < len; i--) {
            tmpLen = luoma[i].length();
            while (idx + tmpLen <= len && luoma[i].equals(s.substring(idx, idx + tmpLen))) {
                res += albo[i];
                idx += tmpLen;
            }
        }
        return res;
    }

