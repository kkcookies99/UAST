 class Solution {
public:
    bool XXX(int x) {
        //转成字符串
        string num_str = std::to_string(x);

        //记录原本字符
        string old_str = num_str;

        //翻转字符
        std::reverse(num_str.begin(), num_str.end());

        //判断
        if(num_str == old_str)
            return true;
        else
            return false;

    }
};

