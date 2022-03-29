 class Solution {
public:
    bool XXX(string s) {
        if(s.size() % 2) return false;
        stack<char> stk;
        //遍历字串s
        for(int i = 0; i < s.size(); i++) {  
            //3种左括号则一律入栈
            if(s[i] == '(' || s[i] == '[' || s[i] == '{') {  
                stk.push(s[i]);
            }
            //右括号则分别处理
            else {  
                //栈不为空
                if(!stk.empty()) {  
                    //若当前字符s[i]和栈顶元素stk.top()不能组成有效的括号对
                    if((s[i] == ')' && stk.top() != '(') || (s[i] == ']' && stk.top() != '[') || 
                    (s[i] == '}' && stk.top() != '{')) {
                        return false;
                    }
                    //反之能组成有效括号对，则栈顶元素出栈，继续判断下一个字符
                    else stk.pop();
                }
                //栈为空，则将对应字符入栈
                else stk.push(s[i]);  
            }
        }
        //遍历结束后栈为空则说明括号匹配，否则不匹配
        if(stk.empty()) return true;
        return false;
    }
};

