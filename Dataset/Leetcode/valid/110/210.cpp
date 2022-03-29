class Solution {
public:
    int helper(TreeNode *root){
        if(root == nullptr){
            return 0;
        }
        int lf = helper(root->left);
        int rt = helper(root->right);
        if(lf==-1 || rt==-1 || abs(lf-rt)>1){
            return -1;
        }
        return max(lf, rt) + 1;
    }
    bool XXX(TreeNode* root) {
        if(root == nullptr){
            return true;
        }
        return helper(root) != -1;
    }
};

