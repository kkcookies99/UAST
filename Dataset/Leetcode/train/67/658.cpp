class Solution {
public:
    string XXX(string a, string b) {
        string res;
        int carry = 0;
        for(int i = a.length()-1, j = b.length()-1; i >= 0 || j >= 0; i--, j--){
            int x = 0, y = 0;
            if(i >= 0 && a[i] == '1') x = 1;
            if(j >= 0 && b[j] == '1') y = 1;
            
            int sum = x + y + carry;
            carry = sum/2;
            res += sum & 1 ? '1' : '0';
        }

        if(carry == 1) res += '1';
        
        reverse(res.begin(), res.end());
        return res;
    }
};

