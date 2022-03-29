 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        if(root==NULL) return {};
        vector<int> res = {};
        if(root->left!=NULL){ //左
            for(int a : XXX(root->left)){
                res.push_back(a);
            }
        }
        res.push_back(root->val);//根
        if(root->right!=NULL){//右
            for(int a : XXX(root->right)){
                res.push_back(a);
            }
        }
        return res;
    }
};

