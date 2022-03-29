 class Solution {
public:
    int XXX(string haystack, string needle) {
        int n = haystack.size();
        int m = needle.size();
        if(m == 0) return 0;
        int i = 0, j = 0;
        while(i < n - m + 1){
            int k = 0;
            j = i;
            while(haystack[j] == needle[k]){
                j++;
                k++;
                if(k == m){
                    return i;
                }
            }
            i++;
        }
        return -1;
    }
};

