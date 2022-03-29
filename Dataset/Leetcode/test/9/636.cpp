 class Solution {
public:
    bool XXX(int x) {
        if(x<0)
            return false;
        string str=to_string(x);
        string str1=to_string(x);
        reverse(str.begin(),str.end());
        if(str1.compare(str)==0)
            return true;
        else 
            return false;  
    }
};

