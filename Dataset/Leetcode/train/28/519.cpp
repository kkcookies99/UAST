 class Solution {
public:
    int XXX(string haystack, string needle) {
        int length = 0;
        int a = -1;
        if (needle == haystack || needle.length() == 0) {
                return 0;
        }
        if(needle.length()>haystack.length()){
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            int j = 0;
            if (haystack[i] == needle[0]) {
                for (j = 0; j < needle.length(); j++) {
                    if (haystack[i + j] != needle[j]) {
                        break;
                    }
                    length++;
                }
                if (length < needle.length()) {
                    length = 0;
                }
                else {
                    a = i;
                    return a;
                }
            }
        }
        return -1;
    }
};

