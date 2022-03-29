class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        if(root==NULL) return {};
        vector<vector<int>> res={};
        vector<TreeNode*> nodes={root};
        while(nodes.size()!=0){
            vector<TreeNode*> tmp={};
            vector<int> v={};
            for(TreeNode* node : nodes){
                v.push_back(node->val);
                if(node->left!=NULL){
                    tmp.push_back(node->left);
                }
                if(node->right!=NULL){
                    tmp.push_back(node->right);
                }
            }
            res.push_back(v);
            nodes = tmp;
        }
        return res;
    }   
};

