class Solution {
public:
    //时间复杂度O(N)
    //XXX(root)简称为f(u)，u的左子树简称为a,u的右子树简称为b,类似动态规划的思想分析问题
    //分类讨论
    //1.如果u为叶子结点，那么返回1
    //2.如果u不是叶子结点：
    //2.1 如果a,b都非空 那么f(u)=min(f(a),f(b))+1
    //2.2 如果a非空,b为空那么f(u)=f(a)+1
    //2.3 如果a为空,b非空那么f(u)=f(b)+1
    int XXX(TreeNode* root) {
        if(!root) return 0;
        //如果结点为叶子结点，返回1
        if(!root->left&&!root->right) return 1;
        //如果左右子树都不空
        if(root->left&&root->right) return min(XXX(root->left),XXX(root->right))+1;
        //如果左子树非空，右子树空
        if(root->left)  return XXX(root->left)+1;
        return XXX(root->right)+1;
    }
};

