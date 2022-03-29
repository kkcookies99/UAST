 class Solution {
public:
    bool XXX(string s) {
        map<char, char> mp = {{')','('}, {'}','{'}, {']' ,'['}};
        vector<char> vt;
        char next;
        for(int i = 0; i < s.size(); ++i){
            char c = s[i];
            if(mp.count(c)){
                next = mp[c];
                if(vt.empty() || next != vt.back()) return false;
                vt.pop_back();
            }
            else vt.push_back(c);
        }
        if(!vt.empty()) return false;
        return true;
    }
};

