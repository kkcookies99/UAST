 class Solution {
public:
    
    bool _XXX(TreeNode* root, const int* minVal, const int* maxVal)
    {
        if (root == NULL)
            return true;

        if (maxVal != NULL && root->val >= *maxVal)
            return false;

        if (minVal != NULL && root->val <= *minVal)
            return false;

        return _XXX(root->left, minVal, &root->val)
            && _XXX(root->right, &root->val, maxVal);

    }

    bool XXX(TreeNode* root) 
    {
        if (root == NULL)
            return true;

        return _XXX(root->left, NULL, &root->val)
            && _XXX(root->right, &root->val, NULL);
    }
};

