 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle.empty()) return 0;
        vector<int> arr(needle.size(), 0);
        for(int i = 1, j = 0; i < needle.size(); i ++){
            while(needle[i] != needle[j] && j != 0) j = arr[j-1];
            if(needle[i] == needle[j]) j ++;
            arr[i] = j;
        }
        for(int i = 0, j = 0; i < haystack.size(); i ++){
            while(haystack[i] != needle[j] && j != 0) j = arr[j-1];  
            if(haystack[i] == needle[j]) j ++;
            if(j == needle.size()) return i - j + 1;
        }
        return -1;
    }
};

