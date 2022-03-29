 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(!root) return false;
        if (!root->right && !root->left)  return root->val == sum;
       //if (!root->right && !root->left && root->val != sum)  return false;

        return (XXX(root->right,sum-root->val) || XXX(root->left,sum-root->val));
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


