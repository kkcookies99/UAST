 class Solution {
public:
    bool XXX(string s) {
        //定义一个栈，把第一个符号入栈。
        stack<char> sta;
        sta.push(s[0]);
        //循环string s，判断push（）和top（）可以形成闭合，就pop（），否则return 0。
        for (int i = 1; i < s.length(); i++) {
            switch (s[i])
            {
            case ')':
                if (!sta.empty() && sta.top() == '(')
                    sta.pop();
                else
                    return 0;
                break;
            
            case ']':
                if (!sta.empty() && sta.top() == '[')
                    sta.pop();
                else
                    return 0;
                break;
            
            case '}':
                if (!sta.empty() && sta.top() == '{')
                    sta.pop();
                else
                    return 0;
                break;
            
            default:
                sta.push(s[i]);
                break;
            }   
        }
        //判断栈空了则满足题意
        return sta.empty();
    }
};

