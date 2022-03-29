 class Solution {
public:
    vector<string> res;
    // 什么时候选左括号： 左括号的的数量 > 0
    // 什么时候选右括号： 右括号的数量>0 &&右括号的数量！=左括号的数量
    vector<string> XXX(int n) {
        string Path;
        XXXHelper(Path,n,n);
        return res;
    }

    void XXXHelper(string& Path, int left,int right){
        // 括号选完了 直接放入结果数组中 返回
        if(left == 0 && right == 0){
            res.push_back(Path);
            return;
        }
        // 括号没选完，但是剩下的左括号和右括号数量相同，只能选择左括号
        if(left == right){
            Path.push_back('(');
            XXXHelper(Path,left - 1,right);
            Path.pop_back();
        } 
        // 左右不相等且都还没选完 则两个都有可能选
        else if(left > 0 && right > 0){
            Path.push_back('(');
            XXXHelper(Path,left - 1,right);
            Path.pop_back();
            Path.push_back(')');
            XXXHelper(Path,left,right - 1);
            Path.pop_back();
        }
        // 右边选完了
        else if(left > 0){
            Path.push_back('(');
            XXXHelper(Path,left - 1,right);
            Path.pop_back();
        }
        // 左边选完了
        else{
            Path.push_back(')');
            XXXHelper(Path,left,right -1);
            Path.pop_back();
        }
    }
};

