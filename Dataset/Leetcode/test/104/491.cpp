class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == NULL){
            return 0;
        }
        return 1 + max(XXX(root->left), XXX(root->right));
    }
};

