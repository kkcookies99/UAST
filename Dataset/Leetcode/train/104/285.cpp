class Solution {
public:
    int getdepth(TreeNode* root, int k, int& max){
        k++;
        if(!root->left && !root->right){
            max = k > max ? k : max;
            return max;
        }
        if(root->left)  getdepth(root->left, k ,max);
        if(root->right) getdepth(root->right, k, max);
        return max;
    }

    int XXX(TreeNode* root) {
        int k = 0;
        int max = 0;
        if(root == nullptr)  return 0;
        getdepth(root, k, max);
        return max;
    }
};

