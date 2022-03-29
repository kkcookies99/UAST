class Solution {
public:
    string XXX(string a, string b) {
        int len1 = a.length();
        int len2 = b.length();
        int i = len1-1;
        int j = len2-1;
        int num = max(i,j);
        i<j?a.insert(a.begin(),j-i,'0'):b.insert(b.begin(),i-j,'0');//用0补齐

        int carry = 0;//进位符
        string res = {""};
        while(num>=0)
        {
            int sum = a[num]+b[num]-'0'-'0'+carry;
            if(sum>1)
            {
                res.append(to_string(sum-2));
                carry=1;
            }
            else
            {
                res.append(to_string(sum));
                carry=0;
            }
            num--;
        }
        if(carry==1)res.append(to_string(1));
        reverse(res.begin(),res.end());//反转
        return res;

    }
};

