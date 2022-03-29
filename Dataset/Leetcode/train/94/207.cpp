 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> res;
        TreeNode* cur = root, *most_right = nullptr;
        while (cur) {
            most_right = cur -> left;
            if (most_right) {
                while (most_right -> right && most_right -> right != cur) {
                    most_right = most_right -> right;
                }
                if (!most_right -> right) {
                    most_right -> right = cur;
                    cur = cur -> left;
                    continue;
                } else if (most_right -> right == cur) {
                    most_right -> right = nullptr;
                }
            }
            res.emplace_back(cur -> val);
            cur = cur -> right;
        }
        return res;
    }
};

