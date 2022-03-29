 class Solution {
public:
    vector<string> result;

    void abc(string s, int i, int j, int n){  //i,j为已使用的左、右括号数量
        if(i < n){
            abc(s + "(", i + 1, j, n);
        }
        if(i > j){
            abc(s + ")", i, j + 1, n);
        }
        if(i == n && j == n){
            result.push_back(s);
        }
    }

    vector<string> XXX(int n) {
        abc("", 0, 0, n);
        return result;
    }
};

