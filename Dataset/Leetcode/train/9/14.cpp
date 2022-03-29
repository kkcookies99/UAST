class Solution {
public:
    bool XXX(int x) {
        string str = to_string(x);
        std::reverse(str.begin(),str.end());
        if(stol(str) == x && stoi(str) == stol(str)){
            return true;
        }else{
            return false;
        }

    }
};

