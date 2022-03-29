 class Solution {
public:
    int XXX(string s) {
        int res = 0;;
        unordered_map<string, int> dict{{"I", 1}, {"V", 5}, {"X", 10}, {"L", 50}, {"C", 100}, {"D", 500}, {"M", 1000}, {"IV", 4}, {"IX", 9}, {"XL", 40}, {"XC", 90},  {"CD", 400}, {"CM", 900}};

        for(int i = 0; i < s.size(); i++) {
            string word = s.substr(i, 2);
            if(dict.find(word) != dict.end()) {
                res+= dict[word];
                i++;
            }
            else {
                word = s.substr(i,1);
                res+= dict[word];
            }
        }
        return res;
    }
};

