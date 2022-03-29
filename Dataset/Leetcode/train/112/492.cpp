 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if (!root) return false;
        if (!root->left && !root->right && sum == root->val) return true;
        return root->left && XXX(root->left, sum - root->val) || 
                root->right && XXX(root->right, sum - root->val);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


