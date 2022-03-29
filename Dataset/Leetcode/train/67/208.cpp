 class Solution {
public:
    string XXX(string a, string b) {
        int lenA = a.size();
        int lenB = b.size();
        string temp;
        char carry = 0;
        temp = (lenA < lenB) ? a : b;
        a = (lenA >= lenB) ? a : b;
        b = temp;
        int i;
        for(i = 0; i < b.size(); ++i)
        {
            if(b[b.size() - 1 - i]  == '1' && carry)
                carry = 1;
            else if(b[b.size() - 1 - i] == '0' && !carry)
                carry = 0;
            else
            {
                carry = a[a.size() - 1 - i] == '1' ? 1 : 0;
                a[a.size() -1 - i] = (carry == 0) ? '1' : '0';
            }
        }
        if(carry)
        {
            while(a.size() != i)
            {
                if(a[a.size() - 1 - i] == '1')
                {
                    a[a.size() - 1 - i] = '0';
                    ++i;
                }
                else
                {
                    a[a.size() - 1 - i] = '1';
                    carry = 0;
                    break;
                }
            }
        }
        if(carry)
            a.insert(0, 1, '1');
        return a;
    }
};

