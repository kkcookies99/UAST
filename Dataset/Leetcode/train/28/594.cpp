 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle.empty() && haystack.empty())
            return 0;

        if(haystack.empty())
            return -1;

        return haystack.find(needle, 0);

    }
};

