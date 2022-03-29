class Solution {
public:
    int XXX(string s) {
        map<char,int> dic={
            {'M',1000},
            {'D',500},
            {'C',100},
            {'L',50},
            {'X',10},
            {'V',5},
            {'I',1}
        };
        int pre=0;
        int res=0;
        for(int i=s.size()-1;i>-1;--i)
        {
            if(dic[s[i]]>=pre)
            {
                res+=dic[s[i]];
            }
            else
            {
                res-=dic[s[i]];
            }
            pre=dic[s[i]];
        }
        return res;
    }
};

