class Solution {
public:
    bool XXX(int x) {
        stringstream ss;
        ss << x;
        string res = ss.str();
        int n = res.length();
        int i = 0, j = n - 1;
        while (i != n){
            if(res[i++] != res[j--])
                return false;
        }
        return true;
    }
};

