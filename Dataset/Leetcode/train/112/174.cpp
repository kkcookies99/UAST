class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(!root) return false;
        if(root->val == targetSum && root->left == nullptr && root->right == nullptr)
            return true;
        
        
            return XXX(root->left,targetSum-root->val) || XXX(root->right,targetSum-root->val);
        
        
        
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


