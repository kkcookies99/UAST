class Solution {
public:
    int tree_height(TreeNode* root){
        if(!root){
            return 0;
        }
        if(!(root->left)&&!(root->right)){
            return 1;
        }
        int a=1+tree_height(root->left);
        int b=1+tree_height(root->right);
        return a>b?a:b;
    }
    bool XXX(TreeNode* root) {
        if(!root)return true;
        int a=tree_height(root->left);
        int b=tree_height(root->right);
        return XXX(root->left)&&XXX(root->right)&&abs(a-b)<=1;
    }
};

