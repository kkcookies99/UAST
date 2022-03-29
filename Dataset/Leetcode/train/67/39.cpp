 class Solution {
public:
    string XXX(string a, string b) {
        int i = a.size() - 1;
        int j = b.size() - 1;
        if(i != j)
        {
            if(i > j)
            {
                int num = i - j;
                while(num)
                {
                    b.insert(0,"0");
                    num--;
                }
            }else
            {
                int num = j - i;
                while(num)
                {
                    a.insert(0,"0");
                    num--;
                }
            }
        }
        i = a.size() - 1;
		j = b.size() - 1;
        int add = 0;
        string res;
        while(i >=0 && j >=0)
        {
            if(add == 0)
            {
                if(a[i] == '0' && b[j] == '0')
                {
                    res+='0';
                    add = 0;
                }
                if(a[i] == '0' && b[j] == '1')
                {
                    res+='1';
                    add = 0;
                }
                if(a[i] == '1' && b[j] == '0')
                {
                    res+='1';
                    add = 0;
                }
                if(a[i] == '1' && b[j] == '1')
                {
                    res+='0';
                    add = 1;
                }

            }
            else
            {
                if(a[i] == '0' && b[j] == '0')
                {
                    res+='1';
                    add = 0;
                }
                if(a[i] == '0' && b[j] == '1')
                {
                    res+='0';
                    add = 1;
                }
                if(a[i] == '1' && b[j] == '0')
                {
                    res+='0';
                    add = 1;
                }
                if(a[i] == '1' && b[j] == '1')
                {
                    res+='1';
                    add = 1;
                }
            }
            i--;
            j--;
        }
        if(add == 1)
            res += '1';
        reverse(res.begin(),res.end());
        return res;
    }
        
};


