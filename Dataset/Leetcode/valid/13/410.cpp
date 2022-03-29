 class Solution {
public:
    int XXX(string s) {
        //vector<pair<string, int>> arr = { {"M", 1000}, {"CM", 900}, {"D", 500}, { "CD", 400 },{"C", 100}, {"XC", 90}, {"L", 50}, {"XL", 40}, {"X", 10}, {"IX", 9}, {"V", 5}, {"IV", 4}, {"I", 1}};     
        //array<pair<string, int>, 13> arr = { make_pair("M", 1000), make_pair("CM", 900), make_pair("D", 500), make_pair("CD", 400), make_pair("C", 100), make_pair("XC", 90), make_pair("L", 50), make_pair("XL", 40), make_pair("X", 10), make_pair("IX", 9), make_pair("V", 5), make_pair("IV", 4), make_pair("I", 1)};
        pair<string, int> arr[13] =  { {"M", 1000}, {"CM", 900}, {"D", 500}, { "CD", 400 },{"C", 100}, {"XC", 90}, {"L", 50}, {"XL", 40}, {"X", 10}, {"IX", 9}, {"V", 5}, {"IV", 4}, {"I", 1}};  
        int ret = 0;
        for (int i = 0, j = 0; i < s.size(); ) {
            while (s.compare(i, arr[j].first.size(), arr[j].first) != 0) {
                ++j;
            }
            ret += arr[j].second;
            i += arr[j].first.size();
        }
        return ret;
    }
};

