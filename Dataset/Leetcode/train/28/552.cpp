 class Solution {
public:
    int XXX(string haystack, string needle) {
        int n = haystack.size(), m = needle.size();
        int j;
        for(int i = 0; i < n - m + 1; i++){
            j = 0;
            while(j < m && haystack[i+j] == needle[j]){
                j++;
            }
            if(j == m){
                return i;
            }
        }
        return -1;
    }
};

