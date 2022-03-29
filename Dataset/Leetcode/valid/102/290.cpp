class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> ret;
        if (!root) return ret;

        queue<TreeNode *> next_layer, current_layer;
        current_layer.push(root);
        ret.push_back({});

        while (!current_layer.empty()) {
            auto p = current_layer.front();
            current_layer.pop();
            
            ret.back().push_back(p->val);

            if (p->left) next_layer.push(p->left);
            if (p->right) next_layer.push(p->right);

            if (current_layer.empty() && !next_layer.empty()) {
                current_layer.swap(next_layer);
                ret.push_back({});
            }
        }

        return move(ret);
    }
};

