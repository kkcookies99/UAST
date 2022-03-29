 class Solution {
public:
    int XXX(string s1, string s2) {
        int len1 = s1.size();
        int len2 = s2.size();
        if (!len2) return 0;
        
        for (int i = 0; s1[i]; i++) {
            int k = i, j = 0;
            for (; s2[j]; k++, j++) {
                if (s1[k] != s2[j]) break;
            }
            if (s2[j] == 0) return i;
        }
        return -1;
    }
};

