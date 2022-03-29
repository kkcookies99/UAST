class Solution {
public:
    string XXX(string a, string b) {
        if (a.size() < b.size())
            swap(a, b);
        int diff = a.size() - b.size();
        int i = b.size() - 1, j = i + diff;
        int flag = 0;
        for (;i >= 0; i--, j--) {
            int temp = a[j] + b[i] - '0' - '0' + flag;
            flag = temp / 2;
            a[j] = temp % 2 + '0';
        }
        for (;j >= 0; j--) {
            int temp = a[j] - '0' + flag;
            flag = temp / 2;
            a[j] = temp % 2 + '0';
        }
        if (flag)
            a = '1' + a;
        return a;
    }
};

