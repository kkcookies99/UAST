class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        TreeNode* now = NULL;
        queue<TreeNode*> q,mid;
        vector<vector<int> > v;
        v.clear();
        if(root == NULL) return v;
        q.push(root);
        while(true){
            vector<int> vc;
            while(!q.empty()){
                now = q.front();
                q.pop();
                vc.push_back(now->val);
                if(now->left)
                    mid.push(now->left);
                if(now->right)
                    mid.push(now->right);
            }
            if(vc.size()>0) v.push_back(vc);
            if(mid.empty()) break;
            while(!mid.empty()){
                q.push(mid.front());
                mid.pop();
            }
        }
        return v;
    }
};

