 class Solution {
public:
    int XXX(string s) {
        int start = 0;
        int end = 0;
        int max = 0;
        int ascii[256] = {0};
        ascii[(int)s[start]] = 1;
        while(s[end] != 0){
            max = max>(end-start+1)?max:end-start+1;
            end++;
            while(ascii[(int)s[end]]==1){
                ascii[(int)s[start]]=0;
                start++;
            }
            ascii[(int)s[end]]=1;
        }
        return max;
    }
};

