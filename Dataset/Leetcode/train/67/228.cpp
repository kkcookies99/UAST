 class Solution {
public:
    string XXX(string a, string b) {
        string res;
        int l1=a.size()-1,l2=b.size()-1,carry=0;
        while(l1>=0 || l2>=0 || carry){
            if(l1>=0) carry+=a[l1--]-'0';
            if(l2>=0) carry+=b[l2--]-'0';
            res=to_string(carry%2)+res;
            carry/=2;
        }
        return res;
    }
};

