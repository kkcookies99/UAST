class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res;
        queue<TreeNode*> q;
        if(root) q.push(root);
        while(!q.empty()){
            vector<int> v;
            int size = q.size();
            while(size--){
                TreeNode* node = q.front();
                q.pop();
                v.emplace_back(node->val);
                if(node->left) q.push(node->left);
                if(node->right) q.push(node->right);
            }
            res.emplace_back(v);
        }
        return res;
    }
};

