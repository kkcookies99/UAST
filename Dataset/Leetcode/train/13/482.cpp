 class Solution {
public:
    int XXX(string s) {
        map <char, int> mp;
        mp['I'] = 1;
        mp['V'] = 5;
        mp['X'] = 10;
        mp['L'] = 50;
        mp['C'] = 100;
        mp['D'] = 500;
        mp['M'] = 1000;
        
        int ret = 0;
        int len = s.length();
        for(int i = 0; i < len; i++)
            if(i + 1 < len && mp[s[i]] < mp[s[i +1]])
            {
                ret -= mp[s[i]];
                ret += mp[s[i + 1]];
                i ++;
            }
            else
                ret += mp[s[i]];
        return ret;
    }
};

