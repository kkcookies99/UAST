 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle.size()==0)
            return 0;
        bitset<50001> S[SIZE];
        for(int i = 0;i<SIZE;i++)
            S[i] = ~0;
        bitset<50001> n(0);
        bitset<50001> j(1);
        for(int i = 0;i<needle.size();i++,j<<=1)
        {
            S[needle[i]]&=~j;
            n = ~(n>>1);
        }
        n = ~n;
        n = n>>1;
        bitset<50001> state = ~0;

        for(int i = 0;i<haystack.size();i++)
        {
            state = (state<<1)|S[haystack[i]];
            if(state[needle.length()-1]==0)
            {
                int ret = i - needle.size() +1;
                return ret<0?-1:ret;
            }
        }
        return -1;
    }
private:
    const int SIZE = 256;
};

