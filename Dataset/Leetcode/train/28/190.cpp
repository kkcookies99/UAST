 class Solution {
public:
    vector<int> getNext(string pattern){
        vector<int> next(pattern.size(), -1);
        int j = -1, i = 0;
        while(i < (int)pattern.size()-1){
            if(j == -1 || pattern[i] == pattern[j]){
                next[++i] = ++j; 
            }else{
                j = next[j];
            }
        }
        return next;
    }

    int kmp(string text, string pattern){
        vector<int> next = getNext(pattern);
        int i = 0, j = 0, lenText = text.size(), lenPattern = pattern.size();
        while(i < lenText && j < lenPattern){
            if(j == -1 || text[i] == pattern[j]){
                ++i, ++j;
            }else{
                j = next[j];
            }
        }
        return j >= pattern.size() ? i - pattern.size() : -1;
    }

    int XXX(string haystack, string needle) {
        return kmp(haystack, needle);
    }
};

