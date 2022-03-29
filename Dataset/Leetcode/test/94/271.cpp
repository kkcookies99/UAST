 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        int GRAY = 0, RED = 1;
        stack<pair<int,TreeNode*>> s;
        s.push(pair(GRAY, root));

        vector<int> ret;
        while (!s.empty()) {
            pair<int, TreeNode*> cur = s.top();
            s.pop();
            if (cur.second == NULL) {
                continue;
            }
            if (cur.first == GRAY) {
                s.push(pair(GRAY, cur.second->right));
                s.push(pair(RED, cur.second));
                s.push(pair(GRAY, cur.second->left));
            } else {
                ret.push_back(cur.second->val);
            }
        }
        return ret;
    }
};

