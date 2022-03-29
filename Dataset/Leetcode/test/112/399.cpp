 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(!root){
            return !(targetSum);
        }
        if(root->left == NULL && root->right == NULL){
            if(targetSum == root->val){
                return true;
            }else{
                return false;
            }
        }else{
            bool l = false, r = false;
            if(root->left){
                l = XXX(root->left, targetSum - root->val);
            }
            if(root->right){
                r = XXX(root->right, targetSum - root->val);
            }

            return l || r;
        }
    }
};

