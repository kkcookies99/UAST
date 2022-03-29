class Solution {
public:
    int XXX(string s) {
        int count = 0;
        for (int i = s.size() - 1; i >= 0; i--)
        {
            if (s[i] != ' ') count += 1;
            else if (count == 0) continue;
            else return count;
        }
        return count;
    }
};

