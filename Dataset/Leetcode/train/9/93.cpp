class Solution {
public:
    bool XXX(int x) {
        if(x<0) return false;
        string ss=to_string(x);
        for(int i=0;i<ss.length()/2;i++)
        {
            if(ss[i]!=ss[ss.length()-i-1])
             return false;
        }
        return true;

    }
};

