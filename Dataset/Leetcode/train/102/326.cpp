class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) 
    {  
        set(root, 0);
        return V;
    }
    void set(TreeNode* root,int deep)
    {
        if(!root)
        {
            MAX = max(MAX, deep);
            V.resize(MAX);
            return;
        }  
        set(root->left, deep+1);
        set(root->right, deep+1);    
        V[deep].push_back(root->val);
    }
    int MAX = 0;
    vector<vector<int>> V;
};

