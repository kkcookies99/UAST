 class Solution {
public:
    bool XXX(string s) {
        int l = 0, r = s.size() - 1;
        while(l < r)
        {
            #define lower(a) ((a)>='A'&&(a)<='Z'?(a)-'A'+'a':(a))
            #define is_ch_num(a) (((a)>='a'&&(a)<'z')||((a)>='0'&&(a)<='9'))
            while(l < r && !is_ch_num(lower(s[l])))l++;
            while(l < r && !is_ch_num(lower(s[r])))r--;
            if(lower(s[l]) != lower(s[r]))
                return false;
            l++;
            r--;
        }
        return true;
    }
};

