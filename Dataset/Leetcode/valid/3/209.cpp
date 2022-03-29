 class Solution {
public:
    int XXX(string s) {
        if (0 == s.size())
            return 0;
        int length{ 1 }, maxLength{ 1 }, index{ 0 };
        for (int i = 1; i < s.size(); i++) {
            for (int j = index; j < i; j++)
                if (s[j] == s[i]) {
                    maxLength = maxLength > length ? maxLength : length;
                    length = i - j - 1;
                    index = j + 1;
                    break;
                }
            length++;
        }
        maxLength = maxLength > length ? maxLength : length;
        return maxLength;
    }
};

