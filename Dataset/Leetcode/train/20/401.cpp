 class Solution {
public:
    bool isTwin(char s1,char s2){
        if(s1 == '('&&s2 == ')') return true;
        if(s1 == '['&&s2 == ']') return true;
        if(s1 == '{'&&s2 == '}') return true;
        return false;


    }
    bool isLeft(char s){
        if(s == '('||s == '['||s == '{') return true;
        else return false;
    }
    bool XXX(string s) {
        vector<char> lefts;
        bool flag = true;
        int n = s.size();
        for(int i = 0;i<n;i++){
            flag = isLeft(s[i]);
            if(lefts.empty()&&flag == false) return false;
            if(flag == true) lefts.push_back(s[i]);
            else if(isTwin(lefts.back(),s[i]) == false) return false;
            else lefts.pop_back();
        }
        if(lefts.empty()) return true;
        return false;
    }
};

