 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(!root) return false;//空树返回false
        //若遍历到叶子节点，且值等于sum，直接返回true
        if(root->val == sum && !root->left && !root->right){
            return true;
        }else{
            //否则继续递归左右子树，第一个参数为子树根节点，第二个参数为sum减去根节点值
            return XXX(root->left,sum - root->val) || XXX(root->right,sum - root->val);
        }
    }
};

