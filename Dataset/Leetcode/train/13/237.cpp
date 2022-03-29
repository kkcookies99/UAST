class Solution {
public:
    int XXX(string s) {
        int sum = 0;
        int size = s.size();
        unordered_map<char, int> mp;
        
        mp['I'] = 1;
        mp['V'] = 5;
        mp['X'] = 10;
        mp['L'] = 50;
        mp['C'] = 100;
        mp['D'] = 500;
        mp['M'] = 1000;
        
    
        for(int i = 0; i < size - 1; ++i) {
            if(mp[s[i]] >= mp[s[i + 1]])
                sum = sum + mp[s[i]];
            else
                sum = sum - mp[s[i]];
            }
        sum += mp[s[size - 1]];
        
        return sum;
    }
};

