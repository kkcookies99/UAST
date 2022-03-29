class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == NULL){
            return 0;
        }
        if(root->left == NULL && root->right == NULL){
            return 1;
        }else if(root->left == NULL){
            return 1 + XXX(root->right);
        }else if(root->right == NULL){
            return 1 + XXX(root->left);
        }else{
            return 1 + min(XXX(root->left), XXX(root->right));
        }
    }
};

