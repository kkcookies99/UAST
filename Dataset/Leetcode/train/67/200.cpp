 class Solution {
public:
    //首先观察字符串长度最大可达10^4,显然超过了普通数据类型所能存储的范围，因此不能直接转化为数字处理
    //因此还是采用进位法。时间复杂度为O(n), 空间复杂度为O(n)
    string XXX(string a, string b) {
        int m(a.size()-1), n(b.size()-1);
        int carry(0);//维护进位
        string res("");
        for(int i=m,j=n;i>=0||j>=0||carry;i--,j--){
            int op1 = i>=0?(a[i]-'0'):0;
            int op2 = j>=0?(b[j]-'0'):0;
            int temp = op1 + op2+carry;
            carry = temp/2;
            res +=to_string(temp%2);
        }
        reverse(res.begin(),res.end());
        return res;
    }
};

