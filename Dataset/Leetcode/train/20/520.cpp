 class Solution {
public:
    bool XXX(string str) {
        stack<char> st;
        int n = str.size();
        for(int i = 0;i < n;i++){
            if(str[i] == '(' || str[i] == '[' || str[i] == '{' ) st.push(str[i]);
            /*以下注释掉的写法可以解决括号带有优先级的问题
            {[()]} 合法
            [{}] 不合法
            ([]) 不合法
            [()] 合法
            [()()]{}合法
            */
            // else if(str[i] == '['){
            //     if(st.empty() || st.top() == '{' || st.top() == '['){
            //         st.push(str[i]);
            //     }
            //     else return false;
            // }
            // else if(str[i] == '{'){
            //     if(st.empty() || st.top() == '{') st.push(str[i]);
            //     else return false;
            // }
            else if(str[i] == ')'){
                if(!st.empty() && st.top() == '(') st.pop();
                else return false;
            }
            else if(str[i] == ']'){
                if(!st.empty() && st.top() == '[') st.pop();
                else return false;
            }
            else if(str[i] == '}'){
                if(!st.empty() && st.top() == '{') st.pop();
                else return false;
            }
        }
        if(st.empty()) return true;
        else return false;
    }
};

