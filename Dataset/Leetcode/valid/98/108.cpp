 class Solution {
public:
    bool XXX(TreeNode* root) {
        bool flag = true;
        helper(root, NULL, NULL, flag);
        return flag;
    }
    void helper(TreeNode* root, TreeNode* min, TreeNode* max, bool& flag)
    {
        if (root == NULL)
            return;
        if ((min != NULL && root->val <= min->val) || (max != NULL && root->val >= max->val))
        {
            flag = false;
            return;
        }
        helper(root->left, min, root, flag);
        helper(root->right, root, max, flag);
       
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


