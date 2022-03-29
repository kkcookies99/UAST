class Solution {
public:
    int height(TreeNode* root){
        if(root==nullptr) return 0;
        return max(height(root->left),height(root->right))+1;
    }
    bool XXX(TreeNode* root) {
        if(root==nullptr) return true;
        int left=height(root->left);
        int right=height(root->right);
        if(abs(left-right)>1){
            return false;
        }
        return XXX(root->left) and XXX(root->right);
    }
};

