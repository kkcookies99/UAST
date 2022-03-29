 class Solution {
public:
    bool isMirror(TreeNode* root1, TreeNode* root2) {
        if (root1 == NULL && root2 == NULL) {
            return true;
        }
        if (root1 == NULL || root2 == NULL) {
            return false;
        }
        return (root1->val == root2->val) && isMirror(root1->left, root2->right) && isMirror(root1->right, root2->left);
    }
    bool XXX(TreeNode* root) {
        return isMirror(root, root);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


