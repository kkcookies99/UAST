class Solution {
public:
    int XXX(TreeNode* root) {
        if (root == NULL)
            return 0;
        else {
            int left_h = XXX (root->left);
            int right_h = XXX (root->right);
            int max = left_h;
            if (max < right_h)
                max = right_h;
            return max + 1;
        }
    }
};

