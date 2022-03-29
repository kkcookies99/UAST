 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle.size() == 0) return 0;
        int hl = haystack.size(), nl = needle.size();
        for(int i = 0; i <= hl - nl; i++){
            int j = 0;
            while(haystack[i + j] == needle[j]){
                j++;
                if(j == nl) return i;
            }
        }
        return -1;
    }
};

