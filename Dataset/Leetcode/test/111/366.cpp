class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root){
            return 0;
        }
        int left = XXX(root->left);
        int right = XXX(root->right);
        if(!left && !right){
            return 1;
        }
        if(!left){
            return right+1;
        }
        if(!right){
            return left+1;
        }
        return left>right?right+1:left+1;
    }

};

