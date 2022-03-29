 class Solution {
public:
    bool XXX(string s) {
        int size=s.size();
        if(size==1) return false;
        stack<char> brackets;
        brackets.push('#'); //哨兵
        for(int i=0; i<size; i++){
            switch(s[i]){
                case '(' : brackets.push(')'); continue;
                case '{' : brackets.push('}'); continue;
                case '[' : brackets.push(']'); continue;
                default:
                    if(s[i]==brackets.top()) brackets.pop();
                    else return false;
            }
        }
        if(brackets.top()!='#') return false;
        return true;
    }
};

