 class Solution {
public:
    int XXX(string haystack, string needle) {
        if (haystack == needle || needle == "") return 0;
        int left = 0, right = 0, lenH = haystack.length(), lenN = needle.length();
        while (left <= (lenH - lenN)) {
            if (haystack[right] == needle[right - left]) {
                right++;
                if ((right - left) >= lenN) {
                    return left;
                }
            } else {
                left++;
                right = left;
            }
        }
        return -1;
    }
};

