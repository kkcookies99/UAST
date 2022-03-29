class Solution {
public:
    int XXX(string s) {
        map<string, int> table = {
            {"M", 1000}, {"CM", 900}, {"D", 500}, {"CD", 400}, {"C", 100}, {"XC", 90}, {"L", 50}, {"XL", 40}, {"X", 10}, {"IX", 9},
            {"V", 5}, {"IV", 4}, {"I", 1}
        };
        vector<string> key = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int len_key = key.size(), i = 0;
        int result = 0;
        
        while(s.length() && i < len_key)
        {
            if(!s.compare(0, key[i].length(), key[i]))
            {
                result += table[key[i]];
                s.erase(0, key[i].length());
            }
            else
            {
                ++i;
            }
        }

        return result;
    }
};

