 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root == NULL) return false; // 空节点一定假的
        if(root->left == NULL && root->right == NULL && root->val == sum) return true;//剩下一个节点的情况
        return XXX(root->left,sum - root->val) || XXX(root->right,sum - root->val);//本级递归判断子节点是否符合条件
    }
};

