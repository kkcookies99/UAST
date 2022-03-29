 class Solution {
public:
    int XXX(string s) {
        const size_t str_sz = s.size();
        if (!str_sz) return 0;
        int m[512]={0},l=0,r=0,sta=0,sz=0;
        m[s[0]]++;
        while (1) {
            if (!sta) {
                sz = max(sz, r-l+1); 
                if (!(r-str_sz+1)) break;
                ++r; m[s[r]]++;
                if (m[s[r]]>1) sta = 1;
            } else {
                m[s[l]]--;
                if (m[s[l]]==1) sta = 0;
                ++l;
            }
        }
        return sz;
    }
};

