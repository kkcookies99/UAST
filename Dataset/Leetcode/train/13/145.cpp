class Solution {
public:
    int XXX(string s) {
        unordered_map<char,int> mp{{'M',1000},{'D',500},{'C',100},{'L',50},{'X',10},{'V',5},{'I',1}};
        int num = 0;
        for(int i = 0; i < s.size(); i++ )
        {
            if( i != s.size()-1 )
                num += ((mp.find(s[i]))->second < (mp.find(s[i+1]))->second ? -mp.find(s[i])->second : mp.find(s[i])->second);
            else
            num += (mp.find(s[i]))->second;
        }
        return num;
    }
};

