class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root) {
            return true;
        }
         int dep = abs(getHeight(root->left) - getHeight(root->right));
         if(dep > 1) {
             return false;
         }
         return XXX(root->left) && XXX(root->right);
    }
    
    int getHeight(TreeNode *root) {
        if(root == nullptr) {
            return 0;
        }
        return max(getHeight(root->left), getHeight(root->right)) + 1;
    }
};

