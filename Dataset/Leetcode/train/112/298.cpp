 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(!root)return false;
        if(root->val==targetSum){
           if(root->left==NULL&&root->right==NULL)return true;
        }
        return helper(root->left,root->val,targetSum)||helper(root->right,root->val,targetSum);
    }
    bool helper(TreeNode*p,int tmp,int goal){
        if(!p)return false;
        int a=p->val+tmp;
        if(a==goal){
            if(p->left==NULL&&p->right==NULL)return true;          
        }
        return helper(p->left,a,goal)||helper(p->right,a,goal);
    }
};

