class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root) return true;
        if(abs(getHeight(root->left)-getHeight(root->right))<=1){
            return XXX(root->left)&&XXX(root->right);
        }
        else return false;
    }

    int getHeight(TreeNode* root){
        if(!root) return 0;
        return max(getHeight(root->left),getHeight(root->right))+1;
    }
};

