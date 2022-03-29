class Solution {
public:
    string XXX(string a, string b) {
        string ans;
        int len =  max(a.size(),b.size()),t,carry = 0;
        reverse(a.begin(),a.end());
        reverse(b.begin(),b.end());
        for(int i = 0;i<len;i++){
            if(i<a.size() && i<b.size()){
                t = (a[i]-'0') + (b[i]-'0') + carry;
            }else if(i<a.size()){
                t = (a[i]-'0')  + carry;
            }else if(i<b.size()){
                t = (b[i]-'0')  + carry;
            }
            ans += ((t%2)+'0');
            carry = (t/2);
        }
        if(carry)ans+="1";
        reverse(ans.begin(),ans.end());
        return ans;
    }
};

