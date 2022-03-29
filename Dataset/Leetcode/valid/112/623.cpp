 class Solution {
public:
     bool Func(TreeNode *root,int target,int sum){
        sum=(root==0?sum+0:sum+root->val);
        if(root==0) return false;
        if((sum==target)&&(root->right==0)&&(root->left==0)) return true;
        bool a=Func(root->left,target,sum);
        bool b=Func(root->right,target,sum);
        return a||b;
    }
    bool XXX(TreeNode* root, int sum) {
        //递归解法
        if(root==0) return false;
        return Func(root,sum,0);
    }
};

