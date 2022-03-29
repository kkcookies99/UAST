 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(!root) return false;
        int temp_sum = root -> val;
        bool ans = false;
        traceback(root, temp_sum, sum, ans);
        return ans;
    }

    void traceback(TreeNode* root, int& temp_sum, int sum, bool& ans) {
        if(ans) return;
        if(root -> left) {
            temp_sum += root -> left -> val;
            traceback(root -> left, temp_sum, sum, ans);
            temp_sum -= root -> left -> val;
        }
        if(root -> right) {
            temp_sum += root -> right -> val;
            traceback(root -> right, temp_sum, sum, ans);
            temp_sum -= root -> right -> val;
        }
        if(!root -> left && !root -> right) {
            if(temp_sum == sum) ans = true;
            return;
        }
    }
};

