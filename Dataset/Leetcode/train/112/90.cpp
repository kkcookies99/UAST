class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(!root){
            return false;
        }
        if (root->val == targetSum && !root->left && !root->right){
            return true;
        }
        bool leftResult = XXX(root->left, targetSum-root->val);
        bool rightResult = XXX(root->right, targetSum-root->val);
        
        return leftResult || rightResult;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


