 class Solution {
public:
    bool XXX(string s) {
        stack<char> sk;
        for(char &c:s){
            if(!sk.empty()&&(sk.top()+1==c||sk.top()+2==c))
                sk.pop();
            else
                sk.push(c);
            
        }
        return sk.empty();
    }
};

