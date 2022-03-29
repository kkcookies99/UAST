 class Solution {
public:
    int XXX(string haystack, string needle) {
        if (needle.empty() || haystack == needle) {
            return 0;
        }
        if (needle.size() > haystack.size()) {
            return -1;
        }
        int haySize = haystack.length();
        int needSize = needle.length();

        for (int i = 0; i <= haySize - needSize; i++) {
            for (int j = 0; j < needSize; j++) {
                if (haystack[i + j] == needle[j]) {
                    if (j == needSize - 1) {
                        return i;
                    }
                } else {
                    break;
                }
            }
        }
        return -1;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

