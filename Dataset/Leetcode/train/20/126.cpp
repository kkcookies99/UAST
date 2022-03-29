 class Solution {
public:
    bool XXX(string s) {
        if (s.length()%2 == 1)
        {
            return false;
        }
        stack<char> st; 
        for (char& c:s)
        {
            if (c == '(' || c == '[' || c == '{')
            {
                st.push(c);
                continue;
            }
            if (c == ')' || c == ']' || c == '}')
            {
                if (st.empty())
                {
                    return false;
                }
                else  
                {           
                    if( (c ==')' && st.top() == '(' ) || ( c == ']' && st.top() == '[' ) || ( c == '}' && st.top()== '{' ) )
                    {
                        st.pop();
                    }
                    else return false;
                }
            }
        }
      return st.empty();
    }
};```

