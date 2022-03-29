 class Solution {
public:
    int XXX(string haystack, string needle) {
        int hs = haystack.size() , ns = needle.size();
        if (!ns) return 0;
        for (int i = 0 , limit = hs - ns; i <= limit; ++i) {
            if (haystack[i] == needle[0] && haystack.substr(i , ns) == needle) 
                return i;
        }
        return -1;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


