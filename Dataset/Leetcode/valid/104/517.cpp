class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root) return 0;
        int ans = 0;
        queue<TreeNode*> q;
        TreeNode *p = root;
        q.push(p);
        while(!q.empty()) {
            int size = q.size();
            while(size--) {
                p = q.front();
                q.pop();
                if(p -> left) q.push(p -> left);
                if(p -> right) q.push(p -> right);
            }
            ans++;
        }
        return ans;
    }
};

