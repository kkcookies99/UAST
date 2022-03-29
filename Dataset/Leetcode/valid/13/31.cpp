class Solution {
public:
    int XXX(string s) {
        int value[200];
        value['I'] = 1;
        value['V'] = 5;
        value['X'] = 10;
        value['L'] = 50;
        value['C'] = 100;
        value['D'] = 500;
        value['M'] = 1000;

        int ans = 0;
        for (int i = 0; i < s.length(); ++i)
        {
            ans += value[s[i]];
            if (i + 1 < s.length() && s[i] == 'I' && (s[i + 1] == 'V' || s[i + 1] == 'X')) ans -= 2 * value[s[i]];
            if (i + 1 < s.length() && s[i] == 'X' && (s[i + 1] == 'L' || s[i + 1] == 'C')) ans -= 2 * value[s[i]];
            if (i + 1 < s.length() && s[i] == 'C' && (s[i + 1] == 'D' || s[i + 1] == 'M')) ans -= 2 * value[s[i]];
        }
        return ans;
    }
};

