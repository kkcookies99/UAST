class Solution {
public:
    int XXX(string s) {
        char prev;
        std::unordered_map<char, int> records = {
            {'I', 1}, {'V', 5}, {'X', 10},
            {'L', 50}, {'C', 100}, {'D', 500},
            {'M', 1000}
        };

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i >0) {
                if ((s[i] == 'V' || s[i] == 'X') && prev == 'I')
                    result -= 2;
                else if ((s[i] == 'L' || s[i] == 'C') && prev == 'X')
                        result -= 20;
                else if ((s[i] == 'D' || s[i] == 'M') && prev == 'C')
                    result -= 200;
            }
            result += records[s[i]];
            prev = s[i];
        }
        return result;
    }
};

