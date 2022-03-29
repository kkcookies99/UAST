class Solution {
public:
    string XXX(string a, string b) {
        //反转便于竖式计算
        reverse(a.begin(), a.end());
        reverse(b.begin(), b.end());
        //输出结果
        string out;
        int n = max(a.size(), b.size());
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            //帮a,b中长度较短的补齐
            if(i>a.size()-1)
            a.push_back('0');
            if(i>b.size()-1)
            b.push_back('0');
            //3种情况，模拟运算2进1，注意count进位的取值该如何修改
            if(a[i] == '0' && b[i] == '0')
            {
                if(count == 1)
                {
                    out.push_back('1');
                    count = 0;
                }
                else
                {
                    out.push_back('0');
                }
            }
            else if(a[i] != '0' && b[i] == '0'||a[i] == '0' && b[i] != '0')
            {
                if(count == 1)
                {
                    out.push_back('0');
                }
                else
                {
                    out.push_back('1');
                }
            }
            else
            {
                if(count == 1)
                {
                    out.push_back('1');
                }
                else
                {
                    out.push_back('0');
                    count = 1;
                }
            }
        }
        //最后如还有进位则需要再补齐
        if(count == 1)
        out.push_back('1');
        //由于得到的是反转结果，所以最后还需要将结果反转
        reverse(out.begin(), out.end());
        return out;
    }
};

