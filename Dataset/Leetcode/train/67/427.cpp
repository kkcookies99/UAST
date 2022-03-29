class Solution {
public:
    string XXX(string a, string b) {
        int la = a.size() - 1, lb = b.size() - 1;
        int carry = 0;
        string ans;
        while(la >= 0 || lb >= 0 || carry){
            if(la >= 0) carry += a[la] - '0';
            if(lb >= 0) carry += b[lb] - '0';
            ans += to_string(carry % 2);
            carry /= 2;
            la--;
            lb--;
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
};

