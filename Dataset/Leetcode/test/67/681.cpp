class Solution {
public:
    string XXX(string a, string b) {
        string out = "";
        reverse(a.begin(),a.end());
        reverse(b.begin(),b.end());
        int m = a.size(), n = b.size();
        int len = max(m, n);
        int carry = 0;
        for(int i = 0; i<len; ++i)
        {
            int x = i<m? a[i]-'0': 0;
            int y = i<n? b[i]-'0': 0;
            int now =  !x&!y&carry | !x&y&!carry | x&y&carry | x&!y&!carry; 
            out += now+'0';
            carry = x&y|x&carry|y&carry;         
        }
        if(carry) out+=carry+'0';
        reverse(out.begin(),out.end());
        return out;
    }
};

