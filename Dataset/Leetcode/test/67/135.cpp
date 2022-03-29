 class Solution {
public:
    
    string add(string& a, string& b){
        int alen = a.size();
        int blen = b.size();
        
        for (int i = alen-1, j = blen - 1; i >= 0; --i, --j)
        {
            if (j >= 0)
                a[i] = a[i]-48 + b[j];

            if (a[i] > '1' && i > 0)
            {
                a[i] -= 2;
                a[i-1] += 1;
            }
        }

        
        if (a[0] > '1')
        {
            a[0] -= 2;
            return '1' + a;
        }
              
        return a;
    }
    
    string XXX(string a, string b) {
        if (a.size() > b.size())
            return add(a, b);
        else
            return add(b, a);
    }
};

