 class Solution {
public:
    bool XXX(string s) {
                std::stack<char> p;
        for(auto pchar : s)
        {
            if(pchar == '(' || pchar == '{' || pchar== '[')
                p.push(pchar);


            else if(pchar == ')' || pchar == '}' || pchar== ']')
            {
                if(p.empty())
                    return  false;
                auto top = p.top();


                if(  (pchar == ')' && top == '(') || (pchar == '}' && top == '{') || (pchar == ']' && top == '[') )
                {
                    p.pop();
                } else 
                    return false;

            }
            else continue;
        }
        return p.empty() ? true: false;
    }
};

