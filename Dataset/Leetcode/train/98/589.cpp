 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==nullptr)return true;
        bool isleft=XXX(root->left),//判断左子树是不是
             isright=XXX(root->right),//判断柚子树是不是
             ismaxleft=ismax(root->val,root->left),//判断根节点大于左子树所有值不
             isminright=ismin(root->val,root->right);//判断根节点小于柚子树所有值不
        return(ismaxleft&&isminright&&isleft&&isright);
    }
//判断大于左子树
bool ismax(int val,TreeNode*root)
{
    if(root==nullptr)return true;
    return (ismax(val,root->left)&&(val>root->val)&&ismax(val,root->right));
}
//判断小于柚子树
bool ismin(int val,TreeNode*root)
{
    if(root==nullptr)return true;
    return (ismin(val,root->left)&&(val<root->val)&&ismin(val,root->right));
}
};

