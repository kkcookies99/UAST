 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        if(!root)return {};
        vector<int> res;
        stack<TreeNode*> s;
        s.push(root);
        map<TreeNode*,int> flag;
        while(!s.empty()){
            TreeNode* x=s.top();
            if(x->left&&!flag[x->left]){
                s.push(x->left);
                flag[x->left]++;
            }
            else{
                s.pop();
                res.push_back(x->val);
                if(x->right)s.push(x->right);
            }
        }
        return res;
    }
};

