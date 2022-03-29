 class Solution {
public:
    bool XXX(string s) {
        vector<char>stack;
        for(auto x : s)
            switch(x){
                case '(': case '[': case '{':
                    stack.push_back(x);
                    break;
                default:
                    if(stack.size()==0 || !(stack.back()==x-1 || stack.back()==x-2))
                        return false;
                    stack.pop_back();
            }
        return !stack.size();
    }
};

