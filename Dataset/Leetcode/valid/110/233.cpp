class Solution {
public:
    bool XXX(TreeNode* root) {
        int dep;
        return helper(root,dep);
    }
    bool helper(TreeNode*p,int&dep){
        if(p==NULL)return true;
        int dep1=0,dep2=0;
        if(!helper(p->left,dep1))return false;
        if(!helper(p->right,dep2))return false;
        if(abs(dep1-dep2)>1)return false;
        dep=max(dep1,dep2)+1;
        return true;
    }
};

