class Solution {
public:
    int XXX(TreeNode* root) {
        //如果该节点为空则返回 0 
        //if(root == NULL) return 0;
        //算出左子树深度
        //int ld = XXX(root->left);
        //算出右子树深度
        //int rd = XXX(root->right);
        //返回两个深度取最大值+1
        return root == NULL ? 0 : max(XXX(root->left),XXX(root->right))+1;
    }
};

