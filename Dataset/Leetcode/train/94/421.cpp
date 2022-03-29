 class Solution {
public:

    void find(vector<int> & res, TreeNode* root)
    {
        if(root)
        {
            find(res, root->left);
            res.push_back(root->val);
            find(res, root->right);
        }
        else
            return;      
        
    }

    vector<int> XXX(TreeNode* root) {
        vector<int> res;
        find(res, root);
        return res;
    }
};

