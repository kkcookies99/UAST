 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root==NULL){//特殊情况 空数
            return false;
        }
        if(root->left==NULL && root->right==NULL){//递归出口 叶子节点
            return root->val == sum;
        }
        //递归
        return XXX(root->left, sum - root->val) ||  XXX(root->right, sum - root->val); 
    }
   
};

