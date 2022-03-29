 class Solution {
    public String XXX(String s) {
        int len = s.length();
        double site = 0;
        int spread = 0, remain = 0;
        for (double i = 0; i < len; i = i + 0.5) {
            remain = (int)(i + 0.5) < len - (int)i -1 ? (int)(i + 0.5) : len - (int)i -1;
            for (int j = 1; j <= remain; j++) {
                if (s.charAt((int)(i - j + 0.5)) != s.charAt((int)(i + j))) {
                    break;
                } else if (j > spread || (j == spread && (int)i == i )) {
                    spread = j;
                    site = i;
                }
            }
        }
        return s.substring((int)(site + 0.5) - spread, (int)site + spread + 1);
    }
}

