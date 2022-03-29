 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root==nullptr) return false;//空树
        sum-=root->val;
        if(root->left==nullptr&&root->right==nullptr) //叶节点
            return sum==0;
        return XXX(root->left,sum)||XXX(root->right,sum);
    }
};

