class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == NULL) return 0;
        if(root->left == NULL && root->right == NULL) return 1;
        if(root->left && root->right) return min(XXX(root->left) + 1 , XXX(root->right) + 1);
        if(root->left) return XXX(root->left) + 1;
         return XXX(root->right) + 1;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


