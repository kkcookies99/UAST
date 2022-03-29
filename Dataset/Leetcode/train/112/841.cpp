 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root != NULL){
        if(root->left != NULL && root->right != NULL)
        return XXX(root->left, sum-root->val)||XXX(root->right, sum-root->val);
        if(root->right == NULL && root->left != NULL)
        return XXX(root->left, sum-root->val);
        if(root->left == NULL && root->right != NULL)
        return XXX(root->right, sum-root->val);
        return root->val==sum;
        }
        return false;        
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


