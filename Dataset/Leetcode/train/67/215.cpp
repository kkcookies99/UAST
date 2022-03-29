 class Solution {
public:
    string XXX(string a, string b) {
        int sizeBias = a.size() > b.size() ? a.size() - b.size() : b.size() - a.size();
        string zero = "";

        while(sizeBias--) zero.append("0");

        // 给短的补几个0
        if(a.size() > b.size()) {
            b = zero + b;
        }
        if(a.size() < b.size()) {
            a = zero + a;
        }

        int carry = 0;
        for(int i = a.size() - 1; i >= 0; --i) {
            auto sum = (a[i] - '0') + (b[i] - '0') + carry;
            carry = sum >= 2 ? 1 : 0;
            // cout<<sum<<" "<<carry<<endl;
            if(sum > 1) sum -= 2;
            
            a[i] = sum + '0';
        }
        // 加完了有进位要补一位
        if(carry) a = "1" + a;
        return a;
    }
};

