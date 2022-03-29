class Solution {
public:

    string XXX(string a, string b) {    
        if(a.length() < b.length())
            return func(b, a);
        else
            return func(a, b);
    }

    string func(string a, string b){
        int temp = 0;
        int a_len = a.length();
        int b_len = b.length();
        for(int i = 0; i < a_len; i++)
        {
            if(i < b_len)
            {   
                int ans = a[a_len - 1 - i] - '0' + b[b_len - 1 - i] - '0' + temp;
                a[a_len - 1 - i] = ans % 2 + '0';
                //return to_string(ans);
                temp = ans / 2 ;
            }
            else
            {
                int ans = a[a_len - 1 - i] - '0' + temp;
                a[a_len - 1 - i] = ans % 2 + '0';
                temp = ans / 2 ;
            }
        }
        if(temp == 0)
            return a;
        else
           return ("1" + a);
    }
};

