 class Solution {
public:
    TreeNode* mirrorTree(TreeNode* root){
        if(!root) return root;
        TreeNode* temp = root->left;
        root->left = mirrorTree(root->right);
        root->right = mirrorTree(temp);
        return root;
    }
    bool isSameTree(TreeNode* p, TreeNode* q){
        if(!p&&!q) return true;
        if(!p&&q) return false;
        if(p&&!q) return false;
        if(p->val != q->val) return false;
        return isSameTree(p->left, q->left)&&isSameTree(p->right, q->right);
    }
    bool XXX(TreeNode* root) {
        if(!root) return true;
        return isSameTree(root->left, mirrorTree(root->right));
    }
};

