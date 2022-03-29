class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root)   return 0;
        queue<TreeNode*> q;
        q.push(root);
        int res = 0;
        
        while(!q.empty()) {
            int sz = q.size();
            for(int i = 0; i < sz; i++) {
                auto t = q.front(); q.pop();
                if(t->left) q.push(t->left);
                if(t->right) q.push(t->right);
            }
            res++;
        }

        return res;
    }
};

