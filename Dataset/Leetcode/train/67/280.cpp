 class Solution {
public:
    string XXX(string a, string b) {
        int add = 0;
        int aIndex = a.size() - 1;
        int bIndex = b.size() - 1;
        string ans = "";
        while (aIndex >= 0 || bIndex >= 0 || add != 0) {
            int numA = aIndex < 0 ? 0 : a[aIndex--] - '0';
            int numB = bIndex < 0 ? 0 : b[bIndex--] - '0';
            int sum = numA + numB + add;
            int digit = sum % 2;
            add = sum / 2;
            ans.push_back('0' + digit);
        }
        reverse(ans.begin(), ans.end());
        return ans;
    }
};

