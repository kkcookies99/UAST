class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == nullptr){
            return 0;
        }
        return max(1 + XXX(root->left), 1 + XXX(root->right));
    }
};

