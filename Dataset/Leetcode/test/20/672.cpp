 class Solution {
public:
    bool XXX(string s) {
        int n=s.size();
        if(n%2==1){
            return false;
        }
        stack<char> sta;
        for(auto ch:s){
            if(ch=='('||ch=='['||ch=='{'){
                sta.push(ch);
            }
            else if(ch==')'&&!sta.empty()&&sta.top()=='('){
                sta.pop();
            }else if(ch==']'&&!sta.empty()&&sta.top()=='['){
                sta.pop();
            }else if(ch=='}'&&!sta.empty()&&sta.top()=='{'){
                sta.pop();
            }else{
                return false;
            }
        }
        if(!sta.empty()){
            return false;
        }
        return true;
    }
};

