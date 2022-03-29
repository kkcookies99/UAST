 class Solution {
public:
    string XXX(string a, string b) {
        if(a.empty() && b.empty())
            return ""; 
        int m = a.size(),n = b.size(),carry = 0;
        //先让两个字符串同长(前位补0)
        if(m < n)
            a = string(n-m,'0') + a;
        else
            b = string(m-n,'0') + b;
        
        for(int i = a.size() - 1; i >= 0 ; i--){
            int sum = (a[i] - '0' + b[i] - '0' + carry);
            carry = sum/2;
            a[i] = sum%2 + '0';
        }   
        if(carry > 0)
            a = string(1,'1') + a; 
        return a;
    }
    
};

