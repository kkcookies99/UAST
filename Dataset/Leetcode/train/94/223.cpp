 class Solution {
public:
    void bltree(vector<int> &vec,TreeNode* R){
        if(R == NULL) return;
        
         bltree(vec,R->left);
         vec.push_back(R->val);
         bltree(vec,R->right);
    }

    vector<int> XXX(TreeNode* root) {
        vector<int> res;
        bltree(res,root);
        return res;
    }
};

