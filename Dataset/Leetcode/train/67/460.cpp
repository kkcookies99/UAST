class Solution {
public:
    // '0' :0011 0000; '1': 0011 0001
    string XXX(string a, string b) {
        if(a.size() < b.size()) swap(a, b);
        int i = 1, c = 0;
        for(; i <= b.size(); ++i)
        {
            char& _a = a[a.size()-i];
            if(c)
            {
                c = _a & 1;
                _a = _a ^ 1;
            }
            c = _a & b[b.size()-i] & 1;
            _a = (_a ^ b[b.size()-i]) + '0';
        }
        if(c == 0) return a;
        // 递归开销有、大
        // b = string(i, '0');
        // b[0] = '1';
        // return XXX(a, b);
        while(i <= a.size() && a[a.size()-i] != '0')
            a[a.size()-i++] = '0';
        if(i > a.size()) return string("1")+a;
        a[a.size()-i] = '1';
        return a;
    }
};

