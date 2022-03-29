 class Solution {
public:
int N = 0;//括号的对数
string tmp_s;//暂时保存字符串
vector<string> res;
    vector<string> XXX(int n) {
        N = n;
        backTrack(0, 0);
        return res;
    }
    void backTrack(int left, int right){//left、right为左右括号的个数
        if (left == N && right == N){//构成一个合法的字符串，保存
            res.push_back(tmp_s);
            return;
        }
        if(left < N){//左括号数还不到N，继续放左括号
            tmp_s.push_back('(');
            backTrack(left + 1, right);
            tmp_s.pop_back();
        }
        if(left > right){//左括号数>右括号数，只能放右括号
            tmp_s.push_back(')');
            backTrack(left, right + 1);
            tmp_s.pop_back();
        }
    }
};```

