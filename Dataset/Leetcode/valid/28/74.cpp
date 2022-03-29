 class Solution {
public:
    int XXX(string haystack, string needle) {
        int haysize=haystack.size();
        int nedsize=needle.size();
        int index=0;
        if(nedsize==0 && haysize==0)
        {
            return 0;
        }
        if(haysize==0 && nedsize!=0)
        {
            return -1;
        }
        if(nedsize>haysize)
        {
            return -1;
        }
        size_t n=haystack.find(needle);
        index=(n!=string::npos)?n:-1;
        return index;   
    }
};

