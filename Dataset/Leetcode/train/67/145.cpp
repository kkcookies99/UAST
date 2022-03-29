 class Solution {
public:
    string XXX(string a, string b) {
        int iA = a.size();
        int iB = b.size();
        while(iA < iB)
        {
            a = '0' + a;
            ++iA;
        }
        while(iA > iB)
        {
            b = '0' + b;
            ++iB;
        }       
        for (iA; iA > 0; --iA)
        {
            a[iA] = a[iA] - '0' + b[iA];
            if (a[iA] >= '2')
            {
                a[iA] = (a[iA] - '0') % 2 + '0';
                a[iA - 1] = a[iA - 1] + 1;
            }
        }
        a[0] = a[0] - '0' + b[0];
        if (a[0] >= '2')
        {
            a[0] = (a[0] - '0') % 2 + '0';
            a = '1' + a;
        }
        return a;
    }
};

