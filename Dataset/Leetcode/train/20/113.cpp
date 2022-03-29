 class Solution {
public:
    bool XXX(string s) {
if(s.size()%2==1)
{
    return false;
}
unordered_map<char,char>pair{
    {')','('},
    {']','['},
    {'}','{'}
};
stack<char>stk;
for(char ch:s)
{
    if(pair.count(ch))
    {
        if(stk.top()!=pair[ch]||stk.empty())
        {
            return false;
        }
        stk.pop();
    }
    else
    {
        stk.push(ch);
    }
}
return stk.empty();
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

