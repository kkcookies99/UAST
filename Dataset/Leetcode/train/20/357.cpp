 class Solution {
public:
    bool XXX(string str) {
        //使用ASCII码结合栈进行括号匹配，{},[],()之间的ASCII值差值都不超过2
        stack<char>stk;
        for(auto c:str){
            if(c=='('||c=='{'||c=='[') stk.push(c);
            else{
                //栈不为空并且ASCII码差值不超过2，说明括号是匹配的,否则是不匹配的
                if(stk.size()&&abs(c-stk.top())<=2) stk.pop();
                else return false;
            }
        }
        //判断stk是否为空，如果为空则匹配成功
        return stk.empty();
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

