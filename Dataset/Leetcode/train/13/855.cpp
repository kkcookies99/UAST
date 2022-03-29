 class Solution {
public:
    int XXX(string s) {
        unordered_map<string, int>  dic{{"I", 1}, {"IV", 4}, {"V", 5}, {"IX", 9}, {"X", 10}, {"XL", 40}, {"L", 50}, {"XC", 90}, {"C", 100}, {"CD", 400}, {"D", 500}, {"CM", 900}, {"M", 1000}};
        int len = s.length() - 1;
        int out = 0;
        for(int i = 0; i <= len; ++i)
        {
            unordered_map<string, int>::iterator itr;
            if(i < len)
            {
                itr = dic.find(s.substr(i,2));
                if(itr == dic.end())
                    itr = dic.find(s.substr(i,1));
                else
                    ++i;
            }
            else
                itr = dic.find(s.substr(i,1));
            out += itr->second;
        }
        return out;
    }
};

