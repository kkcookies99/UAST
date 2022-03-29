 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> order;
        TreeNode * p = root;
        while (p) {
            if (p->left) {
                TreeNode * tmp = p->left;
                while (tmp->right) tmp = tmp->right;
                tmp->right = p;
                
                tmp = p->left;
                p->left = NULL;
                p = tmp;
            } else {
                order.push_back(p->val);
                p = p->right;
            }
        }
        return order;
    }
};

