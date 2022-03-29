class Solution {
public:
    int deep_func(TreeNode* root, int &deep)
    {
        if(!root)
            return 1;
        int left_deep = 0;
        int right_deep = 0;
        if(!deep_func(root->left, left_deep) || !deep_func(root->right, right_deep))
            return 0;
        if(abs(left_deep - right_deep) > 1)
            return 0;
        deep = 1+max(left_deep, right_deep);
        
        return 1;
    }
    bool XXX(TreeNode* root) {
        int deep = 0;
        return deep_func(root, deep);
    }
};

