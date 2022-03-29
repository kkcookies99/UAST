class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root) return 0;
        int res = max(XXX(root->left), XXX(root->right)) + 1;
        return res;
    }
}; 

