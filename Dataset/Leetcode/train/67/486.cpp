class Solution {
public:
    string XXX(string a, string b) {
        int carry = 0 , i = a.size() - 1 , j = b.size() - 1;
        string s;
        while(i>=0 || j>=0 || carry!=0){
            if(i>=0) carry = carry + a[i--] - '0' ;
            if(j>=0) carry = carry + b[j--] - '0' ;
            s += to_string(carry % 2);
            carry /= 2;
        }
        reverse(s.begin() , s.end());
        return s;
    }
};

