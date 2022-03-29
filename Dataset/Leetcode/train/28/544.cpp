 class Solution {
public:
    int XXX(string haystack, string needle) {
        int n = needle.size();
        int j, i;
        if(n > haystack.size()) return -1;
        for(i = 0; i <= haystack.size() - n; i++){
            for(j = 0; j < n;j++){
                if(haystack[i + j] != needle[j]){
                    break;
                }
            }
            if(j == n) return i;
        }
        if(i > haystack.size() - n) return -1;
        return 0;
    }
};

