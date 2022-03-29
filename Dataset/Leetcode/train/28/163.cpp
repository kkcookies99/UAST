 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(haystack=="" && needle==""){
            return 0;
        }
        int index=haystack.find(needle);
        if(index>haystack.length()){
            return -1;
        }
        return index;
    }
};

