class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<int> v;
        vector<vector<int> > vv;
        if(root==NULL)
            return vv;
        queue<TreeNode*> q;
        q.push(root);
        TreeNode *last = root;
        while(!q.empty()){
            TreeNode *cur = q.front();
            q.pop();
            v.push_back(cur->val);
            if(cur->left)
                q.push(cur->left);
            if(cur->right)
                q.push(cur->right);
            if(cur==last){
                last = q.back();
                vv.push_back(v);
                v.clear();
            }
        }
        return vv;
    }
};

