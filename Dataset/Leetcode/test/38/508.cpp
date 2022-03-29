 class Solution {
public:
    string XXX(int n) {
        if(n==1)return "1";
        string t = XXX(n-1);
        string res;
        int index=0;
        while(index<t.size())
        {
            char constance = t[index++];
            int cnt=1;
            while( index<t.size()&& constance == t[index]) {
                ++index;
                ++cnt;
            }
            res+=cnt+'0';
            res+=constance;
        }
        return res;
    }
};

