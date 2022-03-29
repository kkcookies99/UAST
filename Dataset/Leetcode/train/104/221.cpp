class Solution {
public:
    int max_count = 0;
    void backTrack(TreeNode* root, int count){
        if(!root){
            max_count = max(count, max_count);
            return;
        }
        backTrack(root->left, count + 1);
        backTrack(root->right, count + 1);
    }
    int XXX(TreeNode* root) {
        backTrack(root, 0);
        return max_count;
    }
};

