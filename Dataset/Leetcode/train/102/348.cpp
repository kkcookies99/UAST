class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> ans;

        if(root == nullptr) 
            return ans;

        queue<TreeNode*> store;
        vector<int> cur;

        store.push(root);
        while(!store.empty())
        {
            cur.clear();

            int n = store.size();
            for(int i = 0; i < n; i++)
            {
                TreeNode* node = store.front(); 
                store.pop();

                cur.push_back(node->val);
                if(node->left != nullptr)
                    store.push(node->left);
                if(node->right != nullptr)
                    store.push(node->right);
            }
            ans.push_back(cur);
        }
        return ans;
    }
};

