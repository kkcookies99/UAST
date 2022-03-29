 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(!root) return false;
        if((!root->left && !root->right) && root->val==sum) return true; 
        return XXX(root->left,sum-root->val) || XXX(root->right,sum-root->val);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


