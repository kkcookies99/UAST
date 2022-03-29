class Solution {
public:
    int BFS(TreeNode* root) {
        if (!root) {
            return 0;
        }
        
        std::deque<TreeNode*> q = {root};
        int depth = 1;
        while (!q.empty()) {
            std::deque<TreeNode*> new_q;
            for (auto e : q) {
                if (e->left == nullptr && e->right == nullptr) {
                    return depth;
                }
                if (e->left) {
                    new_q.push_back(e->left);
                }
                if (e->right) {
                    new_q.push_back(e->right);
                }
            }
            
            q = new_q;
            ++depth;
        }
        
        return depth;
    }
    
    int XXX(TreeNode* root) {
        return BFS(root);
    }
};

