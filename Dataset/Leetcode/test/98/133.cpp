 class Solution {
public:
    bool XXX(TreeNode* root) {
        
        if(root == nullptr)
            return true;
        
        TreeNode* tleft = root->left;
        while(tleft != nullptr && tleft->right!=nullptr)
            tleft = tleft->right;
        if(root->left != nullptr && root->val <= tleft->val)
            return false;
           
        TreeNode* tright = root->right;
        while(tright != nullptr && tright->left!=nullptr)
            tright = tright->left;
        if(root->right != nullptr && root->val >= tright->val)
            return false;
            
        return XXX(root->left) && XXX(root->right);
    }
};

