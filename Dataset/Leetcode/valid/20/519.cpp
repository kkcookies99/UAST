 class Solution {
public:
    bool XXX(string s) {
        stack<char>temp;
        char other_half;
        for (int i = 0; i < s.size(); i++)
        {
            if (s.at(i) == '(' || s.at(i) == '[' || s.at(i) == '{')
                temp.push(s.at(i));
            if (s.at(i) == ')'||s.at(i)==']'||s.at(i)=='}')
            {
                if (s.at(i) == ')')other_half = '(';
                if (s.at(i) == ']')other_half = '[';
                if (s.at(i) == '}')other_half = '{';

                if (temp.empty())
                    return false;
                else
                {
                    if (temp.top() != other_half)
                        return false;
                    else
                        temp.pop();
                }
            }
        }
        if (temp.empty())return true;
        else return false;
    }
};

