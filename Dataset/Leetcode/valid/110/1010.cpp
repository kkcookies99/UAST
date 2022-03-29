 class Solution {
public:
    int height(TreeNode* node, bool& ans)
    {
        if (!ans) return 0;  //剪枝
        if (!node) return 0;
        int left,right;
        left=height(node->left, ans);
        right=height(node->right, ans);
        if (abs(left-right)>1) ans=false;
        return max(left, right)+1;
    }
    bool XXX(TreeNode* root) {
        bool ans=true;
        height(root, ans);
        return ans;
    }
};

