 class Solution {
public:
    bool XXX(TreeNode* root){
        DFS(root);//将每个节点的左右子树高度差存储在自己的val字段中
        return XXX1(root);//判断平衡
    }
    bool XXX1(TreeNode* root) {
        if(NULL == root)
            return true;
        if(root->val > 1)
            return false;
        return XXX1(root->left) && XXX1(root->right);
    }

    int DFS(TreeNode* root){
        if(NULL == root)
            return 0;
        int left_h = DFS(root->left);
        int right_h = DFS(root->right);
        root->val = abs(left_h - right_h);
        return max(left_h, right_h) + 1;
    }
};

