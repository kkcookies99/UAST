 class Solution {
public:
    bool isMatch(char c1,char c2){
        if((c1=='('&&c2==')')||(c1=='['&&c2==']')||(c1=='{'&&c2=='}'))
            return true;
        else
            return false;
    }
    bool XXX(string s) {
        stack<char> stack;char tmp='0';
        for(int i=0;i<s.length();i++) {
            if(stack.empty()||!isMatch(stack.top(),s[i]))
                stack.push(s[i]);
            else{
                stack.pop();
            }
        }
        return stack.empty();
    }
};```

