class Solution {
public:
    int search_depth(TreeNode* root, bool &res){
        if(!root)
            return 0;
        int left_depth = 0, right_depth = 0, ans = 0;
        left_depth = search_depth(root->left, res) + 1;
        right_depth = search_depth(root->right, res) + 1;
        ans = abs(left_depth - right_depth);
        if(ans > 1)
            res = false;
        return (left_depth > right_depth)?(left_depth):(right_depth);
    }
    bool XXX(TreeNode* root) {
        bool res = true;
        search_depth(root, res);
        return res;   
    }
};

