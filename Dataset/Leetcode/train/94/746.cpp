 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        stack<TreeNode*> body;
        vector<int> res;
        while(root || !body.empty()){
            if(root->left){
                body.push(root);
                root = root->left;
            }
            else{
                res.push_back(root->val);
                if(root->right)
                    root = root->right;
                else if(!body.empty()){
                    body.top()->left = nullptr;
                    root = body.top();
                    body.pop();
                }
                else
                    root = nullptr;
            }
        }
        return res;
    }
};

