 class Solution {
public:
    string XXX(string a, string b) {
        int len_a = a.size();
        int len_b = b.size();
        string c;
        stack<char> s_a;
        stack<char> s_b;
        stack<char> s_c;
        for(char ch : a)
        {
            s_a.push(ch);
        }
        for(char ch : b)
        {
            s_b.push(ch);
        }
        int carry = 0;
        while(s_a.size()!=0 || s_b.size()!=0)
        {
            char ch1;
            char ch2;
            if(!s_a.empty())
            {
                ch1 = s_a.top();
                s_a.pop();
            }
            else
            {
                ch1 = '0';
            }
            if(!s_b.empty())
            {
                ch2 = s_b.top();
                s_b.pop();
            }
            else
            {
                ch2 = '0';
            }

            int num1 = ch1 - '0';
            int num2 = ch2 - '0';

            int num3 = num1^num2^carry;
            carry = (carry&(num1^num2))|(num1&num2);
            char ch3 = num3 + 48;
            s_c.push(ch3);
        }
        if(carry == 1)
        {
            s_c.push('1');
        }
        while(!s_c.empty())
        {
            char ch = s_c.top();
            s_c.pop();
            c.push_back(ch);
        }
        return c;
    }
};

