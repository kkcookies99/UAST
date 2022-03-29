class Solution {
public:
    string XXX(string a, string b) {
        string res;
        int carray = 0, i = a.size() - 1, j = b.size() - 1;
        while(i >= 0 || j >= 0 || carray != 0)
        {
            if(i >= 0)  carray += a[i--] - '0';
            if(j >= 0)  carray += b[j--] - '0';
            res += carray % 2 + '0';
            carray /= 2;
        }

        reverse(res.begin(), res.end());
        return res;
    }
};

