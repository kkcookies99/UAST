class Solution {
public:
    bool XXX(TreeNode* root) {
        return height(root)>=0;
    }
    int height(TreeNode* root){
        if(root==nullptr)return 0;
        int leftheight=height(root->left);
        if(leftheight<0)return -1;
        int rightheight=height(root->right);
        if(rightheight<0)return -1;
        if(abs(leftheight-rightheight)>1)return -1;
        return max(leftheight,rightheight)+1;
    }
};

