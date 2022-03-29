 class Solution {
public:
    bool judge(TreeNode* p,long min,long max){
        if(p==NULL)
            return true;
        if(p->val >=max || p->val<=min)
            return false;
        else{
            return judge(p->left,min,p->val) && judge(p->right,p->val,max); 
        }
    }
    bool XXX(TreeNode* root) {
        return judge(root,LONG_MIN,LONG_MAX);
    }
};

