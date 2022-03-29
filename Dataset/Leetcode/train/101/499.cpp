 class Solution {
public:
    bool XXXHelper(TreeNode* ltree, TreeNode* rtree){
        if(ltree == NULL && rtree == NULL)
            return true;
        else if(ltree == NULL || rtree == NULL)
            return false;
        else{
            if(ltree->val != rtree->val)
                return false;
            else
                return XXXHelper(ltree->left, rtree->right) && XXXHelper(ltree->right, rtree->left);
        }
    }
    bool XXX(TreeNode* root) {
        if(root == NULL || (root->left == NULL && root->right == NULL))
            return true;
        else if(root->left == NULL || root->right == NULL)
            return false;
        else
            return XXXHelper(root->left, root->right);
    }
};

