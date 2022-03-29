 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==NULL)return true;
        int left=func(root->left);
        int right=func(root->right);
        if(right-left>1||left-right>1){return false;}
        else {
            return XXX(root->left)&&XXX(root->right);
        }
    }
    int func(TreeNode* root){
        if(root==NULL)return 0;
        return max(func(root->left),func(root->right))+1;
    }
};

