 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> ans;
        if (root == NULL) {
            return ans;
        }
        vector<TreeNode*> tmp = {root};
        while (!tmp.empty()) {
            if (tmp.back()->left == NULL) {
                ans.push_back(tmp.back()->val);
                TreeNode* a = tmp.back();
                tmp.pop_back();
                if (a->right != NULL) {
                    tmp.push_back(a->right);
                }
            } else {
                TreeNode* a = tmp.back();
                tmp.push_back(a->left);
                a->left = NULL;
            }
        }
        return ans;
    }
};

