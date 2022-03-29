class Solution {
public:
    void carry_func(string &res, int num, bool &carry){
        if(num==0)res.push_back('0'),carry =false;
        if(num==1)res.push_back('1'),carry =false;
        if(num==2)res.push_back('0'),carry =true;
        if(num==3)res.push_back('1'),carry=true;
    }
    string XXX(string a, string b) {
        string res;
        reverse(a.begin(),a.end());
        reverse(b.begin(),b.end());
        int i =0, j = 0;
        bool carry = false;
        while (i < a.size() && j<b.size()){
            int num = 0;
            if(a[i++]=='1')num++;
            if(b[j++]=='1')num++;
            if(carry)num++;
            carry_func(res, num, carry);
        }
        while(i<a.size()){
            int num =0;
            if(a[i++]=='1')num++;
            if(carry)num++;
            carry_func(res, num, carry);
        }
        while(j<b.size()){
            int num =0;
            if(b[j++]=='1')num++;
            if(carry)num++;
            carry_func(res, num, carry);
        }
        if (carry)res.push_back('1');
        reverse(res.begin(),res.end());
        return res;
    }
};

