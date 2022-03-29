 class Solution {
public:
    vector<string> XXX(int n) {
        backTrack("", n, n);
        return res;
    }

    void backTrack(string str, int left, int right){
        if(left == 0 && right == 0){
            res.push_back(str);
            return;
        }

        if(right < left)//去除无效括号，同时进行剪枝
            return;
        if(left > 0){
            left--;
            backTrack(str + '(', left, right);
            left++;
        }

        if(right > 0){
            right--;
            backTrack(str + ')', left, right);
            right++;
        }
    }

private:
    vector<string> res;
};

