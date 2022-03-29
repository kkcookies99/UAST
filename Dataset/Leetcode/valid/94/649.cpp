 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> ans;
        stack<TreeNode *> stack;
        TreeNode *p = root;

        while (p || !stack.empty()) {
            if (p) {
                stack.push(p);
                p = p -> left;
            } else {
                p = stack.top();
                stack.pop();
                ans.push_back(p -> val);

                p = p -> right;
            }
        }

        return ans;
    }
};

