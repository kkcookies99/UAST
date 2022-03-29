 class Solution {
public:
    int p[50005];
    void getNext(string needle){
        p[0] = 0;
        int len = 0;
        int i = 1;
        while(i < needle.length()){
            if(needle[i] == needle[len]){
                len ++;
                p[i] = len;
                i ++;
            }else{
                if(len > 0){
                    len = p[len - 1];
                }else{
                    p[i] = len;
                    i ++;
                }
            }
        }
    }
    int kmp(string haystack, string needle){
        int i = 0;
        int j = 0;
        while(i < haystack.length()){
            if(j == needle.length()){
                return i - j;
            }
            if(haystack[i] == needle[j]){
                i ++;
                j ++;
            }else{
                if(j > 0){
                    j = p[j - 1];
                }else{
                    j = 0;
                    i ++;
                }
            }
        }

        if(j == needle.length()){
            return i - j;
        }
        return -1;
    }
    int XXX(string haystack, string needle) {
        if(haystack == needle)
            return 0;
        getNext(needle);
        return kmp(haystack, needle);
    }
};

