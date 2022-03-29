class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==NULL) return true;
        else if(root->left==NULL&&root->right==NULL) return true;
        else if(abs(height(root->left)-height(root->right))>1) return false;
        else{
            return XXX(root->left)&&XXX(root->right);
        }
    }
    int height(TreeNode* root)
    {
        if(root==NULL) return 0;
        return max(height(root->left),height(root->right))+1;

    }
};

