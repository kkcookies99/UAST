 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> res;
        stack<TreeNode*> s;
        s.push(root);
        while(!s.empty()){
            TreeNode* r=s.top();
            if(r==NULL){
                s.pop();
                if(!s.empty()){
                    r=s.top();
                    res.push_back(r->val);
                    s.pop();
                    s.push(r->right);
                }
                continue;
            }
            s.push(r->left);
        }
        return res;
    }
};

