class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root == nullptr) return true;
        else if(abs(treeHeight(root->left) - treeHeight(root->right)) >= 2) return false;
        else return XXX(root->left) && XXX(root->right);
    }
    int treeHeight(TreeNode* root){
        if(root == nullptr) return 0;
        else return max(treeHeight(root->left), treeHeight(root->right)) + 1;
    }
};

