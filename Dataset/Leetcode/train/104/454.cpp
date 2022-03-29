class Solution {
public:
    int Depth(TreeNode *root, int dep){
        int l=0, r=0;
        if (!root->left&&!root->right) return dep;
        if(root->left){
            l=Depth(root->left,dep+1);
        }
        if(root->right){
            r=Depth(root->right,dep+1);
        }
        if(l<r) return r;
        else return l;

    }
    
    int XXX(TreeNode* root) {
        if(!root) return 0;
        return Depth(root, 1);
    }
};

