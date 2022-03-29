class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> bfs; 
        vector<int> temp; 
        TreeNode* p; 
        queue<TreeNode*> q;
        if(!root) return bfs;
        q.push(root);
        TreeNode* last = root;
        while(!q.empty()){
            p = q.front();
            q.pop();
            temp.push_back(p->val);
            if(p->left)
                q.push(p->left);
            if(p->right)
                q.push(p->right);
            if(p == last){
                bfs.push_back(temp);
                last = q.back();
                temp.clear();
            }
        }
        return bfs;
    }
};

