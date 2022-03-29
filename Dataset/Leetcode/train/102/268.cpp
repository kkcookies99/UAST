class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> Res;
        queue<TreeNode*> dp;
        if(root==nullptr)
        return Res;
        dp.push(root);
        while(!dp.empty())
        {
            int curlen = dp.size();
            vector<int> res;
            for(int i=0;i<curlen;i++)
            {
                TreeNode* tmpNode = dp.front();
                res.push_back(tmpNode->val);
                if(tmpNode->left != nullptr)
                dp.push(tmpNode->left);
                if(tmpNode->right != nullptr)
                dp.push(tmpNode->right);
                dp.pop();
            }
            Res.push_back(res);
        }
        return Res;
    }
};

