 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> res;
        stack<char> stack;
        search(res,n,stack,"",'(');
        return res;
    }
    void search(vector<string> &res,int n,stack<char> stack,string str,char c){
        if(str.length() >= 2*n){
            if(stack.empty() && c == ')')
                res.push_back(str);
            return ;
        }
        if(c == '('){
            stack.push(c);
            str+=c;
        }
        else{
            if(stack.empty())
                return;
            stack.pop();
            str+=c;
        }
        search(res,n,stack,str,'(');
        search(res,n,stack,str,')');
    }
};

