 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if (!root)
        return false;
        if ((root->val==sum)&&!(root->left||root->right))
        return true;
        if (!(root->left||root->right))
        return false;
        else if (XXX(root->left,sum-root->val))
        return true;
        else if (XXX(root->right,sum-root->val))
        return true;
        return false;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


