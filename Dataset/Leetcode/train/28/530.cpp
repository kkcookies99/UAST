 class Solution {
public:
    int XXX(string haystack, string needle) {
    if (haystack.size() == 0&&needle.size() == 0) {
        return 0;
    }
    else if(needle.size() == 0){
        return 0;
    }
    int len = haystack.size();
    int nlen = needle.size();
    int flag = 1;
    for (int i = 0; i < len; i++) {
        flag = 1;
        while (haystack[i] == needle[0]&&flag==1) {
            flag = 1;
            for (int j = 0; j < nlen; j++) {
                if (haystack[i + j] != needle[j]) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1) {
                return i;
            }
        }
    }
    return -1;
    }
};

