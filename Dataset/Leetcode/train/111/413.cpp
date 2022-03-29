class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root) return 0;

        //递归获取左右子树最小高度
        int left = XXX(root->left);
        int right = XXX(root->right);

        //若左右子树高度都大于0,则返回较小的
        if(left!=0 && right!=0)
            return min(left,right)+1;
        
        //否则返回左右子树最大高度
        return max(left,right)+1;
    }
};

