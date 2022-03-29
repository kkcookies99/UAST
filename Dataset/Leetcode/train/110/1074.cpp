 class Solution {
public:
    bool XXX(TreeNode* root) {
        return getHeight(root) >= 0;
    }
    
    int getHeight(TreeNode* root){
        if(!root){
            return 0;
        }
        int leftHeight = getHeight(root -> left);
        int rightHeight = getHeight(root -> right);
        if(abs(leftHeight - rightHeight) <= 1){
            return max(leftHeight, rightHeight) + 1;
        }
        return -100;
    }
};

