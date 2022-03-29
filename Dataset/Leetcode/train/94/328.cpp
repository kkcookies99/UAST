 class Solution {
public:
    vector<int> res;
    vector<int> XXX(TreeNode* root) {
        stack<TreeNode*> s;
        while(root||!s.empty()){
            if(root){
                s.push(root);
                root = root->left;
            }else{
                TreeNode* cur = s.top();
                s.pop(); 
                res.push_back(cur->val);
                root = cur->right;
            }
        }
        return res;
    }
};

