 class Solution {
public:
    TreeNode* prev = nullptr;
    bool XXX(TreeNode* root) {
        if (!root)  return true;
        if (!XXX(root->left))    return false;
        if (prev && root->val <= prev->val)     return false;
        prev = root;
        return XXX(root->right);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


