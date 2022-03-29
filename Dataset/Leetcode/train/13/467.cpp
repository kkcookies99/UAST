 class Solution {
public:
    int XXX(string s) {
        unordered_map<char,int> um;
        um['I'] = 1;
        um['V'] = 5;
        um['X'] = 10;
        um['L'] = 50;
        um['C'] = 100;
        um['D'] = 500;
        um['M'] = 1000;
        int n = s.size();
        int ret = um[s[0]];
        for(int i =1;i<n;++i){
            if(um[s[i]]>um[s[i-1]]){
                ret -= um[s[i-1]] << 1;
            }
            ret += um[s[i]];
        }
        return ret;
    }
};

