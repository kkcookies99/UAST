 class Solution {
public:
    void preorder(TreeNode* bt1,TreeNode* bt2,bool &flag)
    {
        if(flag==false)
        return;
        if(bt1==NULL&&bt2!=NULL||bt1!=NULL&&bt2==NULL)
        flag=false;
        if(bt2==NULL||bt1==NULL)
        return;
        if(bt1->val!=bt2->val)
        flag=false;
        preorder(bt1->left,bt2->right,flag);
        preorder(bt1->right,bt2->left,flag);
    }
    bool XXX(TreeNode* root) {
        bool flag=true;
        if(root->left==NULL&&root->right==NULL)
        return true;
        if(root->left==NULL&&root->right!=NULL||root->left!=NULL&&root->right==NULL)
        return false;
        if(root->left->val!=root->right->val)
        return false;
        preorder(root->left,root->right,flag);
        return flag;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


