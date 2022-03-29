 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        if(root==NULL) return{};
        stack<TreeNode*> s;
        s.push(root);
        vector<int> res;
        while(s.empty()==false){
            TreeNode* tmp = s.top();
            s.pop();
            if(tmp!=NULL){
                if(tmp->right)s.push(tmp->right);
                s.push(tmp);
                s.push(NULL);
                if(tmp->left) s.push(tmp->left);
            }
            else{
                auto cur = s.top();
                s.pop();
                res.push_back(cur->val);
            }
        }
        return res;
    }
};

