 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root && root->left == NULL && root->right == NULL){
            return root->val == sum;
        }else if(root){
            return XXX(root->left,sum-root->val) || XXX(root->right,sum-root->val);
        }
        return false;
    }
};

