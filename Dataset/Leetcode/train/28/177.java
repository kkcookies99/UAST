 public int XXX(String haystack, String needle) {
        int nLen = needle.length(), hLen = haystack.length();
        if (nLen == 0) {
            return 0;
        }
        if (hLen < nLen) {
            return -1;
        }
        int prime = 524287, np = 0, hp = 0;
        int[] map = new int[26];
        for (int i = 0; i < 26; i++) {
            map[i] = i;
        }
        for (int i = 0; i < nLen; i++) {
            np = (np * 26 + needle.charAt(i) - 'a') % prime;
            hp = (hp * 26 + haystack.charAt(i) - 'a') % prime;
            if (i > 0) {
                for (int j = 0; j < 26; j++) {
                    map[j] = map[j] * 26 % prime;
                }
            }
        }
        for (int i = 0; i <= hLen - nLen; i++) {
            if (np == hp && needle.equals(haystack.substring(i, i + nLen))) {
                return i;
            }
            if (i != hLen - nLen) {
                hp -= map[haystack.charAt(i) - 'a'];
                if (hp < 0) {
                    hp += prime;
                }
                hp = (26 * hp + haystack.charAt(i + nLen) - 'a') % prime;
            }
        }
        return -1;
    }

