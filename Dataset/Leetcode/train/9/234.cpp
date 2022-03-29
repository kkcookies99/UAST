class Solution {
public:
    bool XXX(int x) {
        if(x<0)
            return false;
        
        ostringstream stream;
        stream<<x;
        string str=stream.str();
        string copy=str;
        reverse(str.begin(),str.end());
        return str==copy;
    }
};

