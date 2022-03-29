 class Solution {
public:
    int XXX(int x) {
        string s;
        while (x)
        {
            s += char('0' + x % 10);
            x /= 10;
        }

        long long ans = 0, high = pow(2, 31) - 1, low = -1 * pow(2, 31);
        for (int i = 0; i < s.length(); ++i)
        {
            ans = ans * 10 + s[i] - '0';
        }

        if (ans > high - 1 || ans < low) return 0;
        return ans;
    }
};

