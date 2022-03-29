 class Solution {
public:
    string XXX(int num) {
        static vector<pair<int, string>> vec = {make_pair(1, "I"), make_pair(4, "IV"), make_pair(5, "V"), make_pair(9, "IX"), make_pair(10, "X"), make_pair(40, "XL"),
            make_pair(50, "L"), make_pair(90, "XC"), make_pair(100, "C"), make_pair(400, "CD"), make_pair(500, "D"), make_pair(900, "CM"), make_pair(1000, "M")};
        string res = "";
        for (int i = vec.size() - 1; i >= 0; i--) {
            if (num < vec[i].first) {
                continue;
            }
            int k = num/vec[i].first;
            while (k-- != 0) {
                res += vec[i].second;
            }
            num = num % vec[i].first;
        }
        
        return res;
    }
};

