 class Solution {
public:
    bool lres, rres; 
    bool XXX(TreeNode* root, int sum) {
        // bool lres, rres; 
        if(!root) return false;
        if(!root->left && !root->right) return sum == root->val;
        lres = XXX(root->left, sum - root->val);
        rres = XXX(root->right, sum - root->val);
        return lres || rres;
        // return XXX(root->left,sum-root->val)||XXX(root->right,sum-root->val);
    }
};

