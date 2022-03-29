 class Solution {
public:
    int XXX(string s) {
        string::reverse_iterator it=s.rbegin();
        while(*it==' ' && it!=s.rend())
            it++;
        int i=0;
        for(;*it!=' ' && it!=s.rend();it++)
            i++;            
        return i;        
    }
};

