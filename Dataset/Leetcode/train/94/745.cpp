 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        stack<TreeNode*> body;
        vector<int> result;
        while(root != NULL || !body.empty()){
            if(root->left != NULL){
                body.push(root);
                root = root->left;
            }
            else{
                body.push(root);
                result.push_back(body.top()->val);
                if(body.top()->right != NULL){
                    root = body.top()->right;
                    body.pop();
                }                
                else{
                    body.pop();
                    if(!body.empty()){
                        body.top()->left = NULL;
                        root = body.top();
                        body.pop();
                    }
                    else
                        root = NULL;
                }
            }
        }
        return result;
    }
};

