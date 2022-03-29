class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res;
        queue<TreeNode*> q;
        if(root==nullptr)
            return res;
        q.push(root);
        while(!q.empty()){
            int count = q.size();
            vector<int> temp;
            for(int i=0;i<count;i++){
                if(q.front()->left)
                    q.push(q.front()->left);
                if(q.front()->right)
                    q.push(q.front()->right);
                temp.push_back(q.front()->val);
                q.pop();
            }
            res.push_back(temp);
        }
        return res;
    }
};

