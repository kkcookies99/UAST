 class Solution {
public:
    bool XXX(string s) {
        stack<char> s1;
        for(auto&i:s){
            if(s1.empty()){
                s1.push(i);
                continue;
            }
            if(Ispair(s1.top(),i)){
                s1.pop();
            }else{
                s1.push(i);
            }
        }
        return (s1.empty()) ? true : false;

    }
    bool Ispair(char a, char b){
        if((a == '{' && b == '}') || (a == '(' && b == ')') || (a == '[' && b == ']')) return true;
        return false;
    }
};

