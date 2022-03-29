class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root)
            return true;

        bool flag = true;
        function<int(TreeNode*,TreeNode*)> maxDepth = [&](TreeNode* right,TreeNode* left){
            if(!flag)
                return 0;
            
            int rightDepth = right ? maxDepth(right->right, right->left) : 0;
            int leftDepth = left ? maxDepth(left->right, left->left) : 0;

            if(abs(rightDepth-leftDepth) > 1)
                flag = false;
            return max(rightDepth, leftDepth) + 1;
        };

        maxDepth(root->right, root->left);
        return flag;
    }
};

