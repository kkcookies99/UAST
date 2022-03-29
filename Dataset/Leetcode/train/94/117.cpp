 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> ans;
        stack<TreeNode*> s;
        TreeNode* r=root;
        while(r||!s.empty()){
            while(r){
                s.push(r);
                r=r->left;//左
            }
            r=s.top();s.pop();
            ans.push_back(r->val);//根
            r=r->right;//右   
        }
        return ans;
    }
};

