 class Solution {
public:
    bool isCompatible(char c1, char c2){
    return (c1=='('&&c2==')'||c1=='['&&c2==']'||c1=='{'&&c2=='}');
}
    bool XXX(string s){
        if (s.length()%2) return false;
        stack<char> aux;
        while (!s.empty()){
            while (aux.empty()||(!s.empty()&&!isCompatible(s.back(), aux.top()))){
                aux.push(s.back()); s.pop_back();
                if (s.size()<aux.size())
                    return false;
            }
            if (isCompatible(s.back(), aux.top())){
                s.pop_back();
                aux.pop();
            }
        }
        return (aux.empty());
    }
};

