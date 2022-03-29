 class Solution {
public:
    string XXX(string a, string b) {
        int la = a.length();
        int lb = b.length();
        
        if(la < lb)
        {
            string temp = a;
            a = b;
            b = temp;
            
            int tmp = la;
            la = lb;
            lb = tmp;
        }
        
        //第一个比第二个大
        
        int i;
        int diff = la - lb;
        int of = 0;
        int temp;
        for(i = lb - 1; i >= 0; i--)
        {
            temp = of + (b[i] - '0') + a[i+diff] - '0';
            
            a[i+diff] = temp % 2 + '0';
            of = temp / 2;
            
        }
        
        if(of)
        {
            for(i = diff - 1; i >= 0; i--)
            {
                if(a[i] == '0')
                {
                    a[i] = '1';
                    of = 0;
                    break;
                }
                
                a[i] = '0';
            }
        }
        
        if(of)
        {
            a.insert(0, "1");
        }
        
        return a;   
    }
};

