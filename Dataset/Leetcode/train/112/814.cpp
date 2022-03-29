 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(!root)
            return false;
        if(!root->left && !root->right){
            if(sum == root->val)
                return true;
            return false;
        }
        return XXX(root->left, sum - root->val) || XXX(root->right, sum - root->val);
    }
};

