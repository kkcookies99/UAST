 class Solution {
    public int XXX(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        int m = haystack.length(), n = needle.length();
        int pi[] = new int[n];
        
        // Find prefix table
        for (int i = 0; i < n; ++i) {
            if (i == 0) {
                pi[i] = 0;
            } else {
                int j = pi[i - 1];
                while (needle.charAt(j) != needle.charAt(i) && j > 0) {
                    j = pi[j - 1];
                } 
                
                pi[i] = needle.charAt(j) == needle.charAt(i) ? j + 1 : 0;
            }
        }
        
        // KMP
        int i1 = 0, i2 = 0;
        while (i1 < m) {
            if (haystack.charAt(i1) == needle.charAt(i2)) {
                ++i1;
                ++i2;
            } else {
                if (i2 == 0) {
                    ++i1;
                } else {
                    i2 = pi[i2 - 1];
                }
            }
            
            if (i2 == n) {
                return i1 - n;
            }
        }
        
        return -1;
        
    }
}

