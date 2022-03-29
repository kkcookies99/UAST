 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root){//因为 [] 0 返回false  所以递归退出条件只能计算到根节点，不能到根节点之后
            sum=sum-root->val;
            if(root->left==NULL && root->right==NULL && sum==0) return true;
            return XXX(root->left,sum) || XXX(root->right,sum);
        } 
        return false;
    }

};

