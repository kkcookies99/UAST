class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> result;
        queue<TreeNode*> Level;
        Level.push(root);
        while(Level.size())
        {
            int n=Level.size();
            vector<int> temp;
            while(n--)
            {
                TreeNode* F=Level.front();
                if(F)
                {
                    temp.push_back(F->val);
                    Level.push(F->left);
                    Level.push(F->right);
                }
                Level.pop();
            }
            if(temp.size()) result.push_back(temp);
        }
        return result;
    }
};

