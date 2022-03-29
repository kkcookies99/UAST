class Solution {
public:
    string XXX(string a, string b) {
        string res;
        int A = a.size();
        int B = b.size();
        int N = max(A,B);
        reverse(a.begin(),a.end());
        reverse(b.begin(),b.end());
        int over = 0;//进位
        for(int i = 0 ;i<N;i++) {
            int val = over;
            val += i < A ? a[i]-'0' : 0;
            val += i < B ? b[i]-'0' : 0;  
            res += (val & 1) + '0';
            over = val / 2;
        }
        if(over) res += over+'0';
        reverse(res.begin(),res.end());
        return res;
    }
};

