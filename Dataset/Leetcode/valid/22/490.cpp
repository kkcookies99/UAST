 class Solution {
public:
    int total;
    vector<string> XXX(int n) {
        vector<string> res;
        string tmp;
        total = n;
        backtrace(res, n, n, tmp);
        return res;
    }
    void backtrace(vector<string> &res, int left, int right, string &tmp){

        if(left < 0 || right  < left ){ // left <0 代表左括号大于n了 right< left 代表右括号个数大于左括号了
            return;
        }
        if(tmp.length() == total*2){
            res.push_back(tmp);
            return;
        }
        tmp.append(1, '(');
        backtrace(res, left-1, right, tmp);
        tmp.erase(tmp.length()-1, 1);
        tmp.append(1, ')');
        backtrace(res, left, right-1, tmp);
        tmp.erase(tmp.length()-1, 1);
    }
};

