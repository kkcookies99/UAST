 class Solution {
public:
    static const int N = 5e4 + 10,P = 131;
    unsigned long long h[N];    
    
    int XXX(string s1, string s2) {
        if(s2.size() == 0) return 0;
        
        for(int i = 0;i < s1.size();i ++) h[i + 1] = h[i] * P + s1[i];
        
        unsigned long long t = 0;
        unsigned long long p = 1;
        for(int i = 0;i < s2.size();i ++)
        {
            p *= P;
            t = t * P + s2[i];    
        } 
        for(int i = s2.size() - 1;i < s1.size();i ++)
        {
            if(h[i + 1] - h[i - s2.size() + 1] * p == t) return i - s2.size() + 1; 
        }
        
        return -1;
    }
};

