 class Solution {
public:
    vector<int> vec;
    void inorder(TreeNode* root)
    {
        if(!root) return;

        inorder(root->left);
        vec.push_back(root->val);
        inorder(root->right);
    }
    bool XXX(TreeNode* root) {
        inorder(root);
        for(int i = 1;i < vec.size();i++)
        {
            if(vec[i] <= vec[i-1])
                return false;
        }
        return true;
    }
};

