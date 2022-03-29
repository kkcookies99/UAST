class Solution {
public:
    int XXX(TreeNode* root) {
        if(root==NULL)
        return 0;
        if(root->left==NULL&&root->right==NULL)
        return 1;
        // if(root->left==NULL)
        // return 1+XXX(root->right);
        // if(root->right==NULL)
        // return 1+XXX(root->left);
        if(root->left==NULL||root->right==NULL)
        return 1+max(XXX(root->left),XXX(root->right));
        return 1+min(XXX(root->left),XXX(root->right));
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


