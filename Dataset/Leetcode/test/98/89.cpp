 class Solution {
public:
    long preVal = LONG_MIN;
    bool flag = true;
    bool XXX(TreeNode* root) {
        inOrderTravel(root);
        return flag;
    }
    void inOrderTravel(TreeNode* root){
        if(!root)
            return;
        inOrderTravel(root->left);
        if(root->val <= preVal){
            flag = false;
            return;
        }    
        preVal = root->val;
        inOrderTravel(root->right);
    }
};

