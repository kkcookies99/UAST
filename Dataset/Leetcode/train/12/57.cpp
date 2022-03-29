 class Solution {
public:
    string XXX(int num) {
        string res = "";
        for(auto it = up.begin();it != up.end();++it)
        {
            while(num >= it->second)
            {
                res += it->first;
                num -= it->second;
            }
            if(num == 0)
                break;
        }
        return res;
    }
private:
    vector<pair<string, int>> up = {{"M", 1000}, {"CM", 900}, {"D", 500}, {"CD", 400}, 
        {"C", 100}, {"XC", 90}, {"L", 50}, {"XL", 40}, 
        {"X", 10}, {"IX", 9}, {"V", 5}, {"IV", 4}, {"I", 1}};
};

