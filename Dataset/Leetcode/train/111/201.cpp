class Solution {
public:
    int XXX(TreeNode* root)
     {
        if(root==nullptr) return 0;
        int left=1;
        int right=1;
         left = left+XXX(root->left);
         right = right+XXX(root->right);

        if(root->left==nullptr)return right;
         if(root->right==nullptr)return left;
         
         return left>right? right : left ;

    }
};

