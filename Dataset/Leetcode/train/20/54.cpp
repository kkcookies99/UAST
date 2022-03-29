 class Solution {
public:
    bool XXX(string s) {
        stack<char> m_stack;
        for(const auto& v :s)
        {
            if(m_stack.empty())
                m_stack.push(v);
            else if(compare(m_stack.top(),v))
                m_stack.pop();
            else
                m_stack.push(v);
        }
        return m_stack.size() == 0 ? true : false;
    }
private:
    bool compare(const char& c1,const char& c2)
    {
        return (c1 == '[' && c2 == ']') || (c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}');
    }
};

