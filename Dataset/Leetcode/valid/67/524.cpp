class Solution {
public:
    string XXX(string a, string b) {
        if(a.size()==0)
        return b;
        if (b.size()==0)
        return a;
        int digit = 0;//进位标志
        string res;
        int left = a.size()-1;
        int right = b.size()-1;
        while(left>=0&&right>=0)
        {
            int tmp = digit+a[left]-'0'+b[right]-'0';
             digit=0;
            if(tmp>1)//超过1则进位
                digit = 1;
            res.push_back('0'+tmp%2);
            left--;
            right--;
        }
        //一个长度结束，计算进位标志和另外未结束的
        while(left>=0)
        {
             int tmp = digit+a[left]-'0';
              digit=0;
            if(tmp>1)
            {
                digit = 1;
            }
            res.push_back('0'+tmp%2);
            left--;
        }
          while(right>=0)
        {
             int tmp = digit+b[right]-'0';
              digit=0;
            if(tmp>1)
            {
                digit = 1;
            }
            res.push_back('0'+tmp%2);
            right--;
        }
        //最终标志
        if(digit==1)
        {
            res.push_back('1');
        }
        Swap(res);
        return res;
    }

    //手动反转
    void Swap(string &s)
    {
        int left = 0;
        int right = s.size()-1;
        while(left<right)
        {
             swap(s[left],s[right]);
             left++;
             right--;
        }    
    }
};

