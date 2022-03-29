 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(nullptr==root) return false;     //单空根节点
        if(nullptr==root->left && nullptr==root->right) //左右空到节点了
            return sum==root->val;
        bool a = XXX(root->left, sum - root->val);    //递归左
        bool b = XXX(root->right, sum - root->val);   //递归右
        return a||b;    //左右 有一个true都行
    }
};

