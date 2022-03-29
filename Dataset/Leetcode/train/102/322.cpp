class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res;
        queue<TreeNode*> que;
        if(root)    que.push(root);
        while(!que.empty()){
            vector<int> tmp;        
            int size = que.size();
            for(int i = 0; i < size; i++){
                TreeNode* tree = que.front();
                tmp.push_back(tree->val);
                if(tree->left)  que.push(tree->left);
                if(tree->right)  que.push(tree->right);
                que.pop();
            }
            res.push_back(tmp);
            tmp.clear();
        }
        return res;
    }
};

