class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res;
        queue<TreeNode*> que;
        que.push(root);
        if(root==nullptr)
            return res;
        while(!que.empty()){
            int size=que.size();
            vector<int> level;
            for(int i=0;i<size;i++){
                level.push_back(que.front()->val);
                root=que.front();
                que.pop();
                if(root->left!=nullptr)
                    que.push(root->left);
                if(root->right!=nullptr)
                    que.push(root->right);
            }
            res.push_back(level);
        }
        return res;
    }
};

