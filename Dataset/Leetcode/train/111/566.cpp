class Solution {
public:
//bfs
    int XXX(TreeNode* root) {
        if(root) {
            queue<TreeNode*> q({root});
            int res = 0;
            while(!q.empty()) {
                ++res;
                int size = q.size();
                while(size--) {
                    TreeNode* p = q.front();
                    q.pop();
                    if(!p->left && !p->right) return res;
                    if(p->left)  q.emplace(p->left);
                    if(p->right) q.emplace(p->right);
                }
            }
        }
        return 0;
    }
//dfs
    int XXX(TreeNode* root) {
        if(!root) return 0;
        int l = XXX(root->left);
        int r = XXX(root->right);
        return l && r ? min(l, r) + 1 : l + r + 1;
    }


