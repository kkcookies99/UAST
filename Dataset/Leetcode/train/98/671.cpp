 class Solution {
public:
    bool isValid(TreeNode* root)
    {
        if (!root) return true;
        return (root->left ? isValid(root->left) : true) && 
                (m_cur < root->val ? (m_cur = root->val, true) : false) && 
                (root->right ? isValid(root->right) : true);
    }

    bool XXX(TreeNode* root) 
    {
        m_cur = LONG_MIN;
        return isValid(root);
    }
private:
    long m_cur = LONG_MIN;
};

