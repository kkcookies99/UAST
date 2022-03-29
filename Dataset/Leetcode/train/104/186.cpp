class Solution {
public:
    void drop(TreeNode* root, int & depth, int & max){
        if(!root){return ;}
        depth += 1;
        drop(root->left, depth, max);
        drop(root->right, depth, max);

        max = depth > max ? depth: max;
        depth -= 1;

    }

    int XXX(TreeNode* root) {
        if(!root ) return 0;
        int d = 0;
        int max = 1;
        drop(root, d, max);

        return max;
    }
};

