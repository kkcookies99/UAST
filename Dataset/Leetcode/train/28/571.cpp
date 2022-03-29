 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle=="") return 0;
        if(haystack=="") return -1;
        return haystack.find(needle);
    }
};

