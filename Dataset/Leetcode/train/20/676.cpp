 class Solution {
public:
    bool XXX(string s) {
        int n=s.size();
        if( n%2==1 ) return false;
        stack<char>stk;
        for(char &i:s)
            if(!stk.empty() && cmp(stk.top(),i))stk.pop();
            else stk.push(i);   
        return stk.empty();
    }
    bool cmp(char x,char y)
    {
        if(x=='(' && y==')' ) return true;
        if(x=='[' && y==']' ) return true;
        if(x=='{' && y=='}' ) return true;
        return false;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


