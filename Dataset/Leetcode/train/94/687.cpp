 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        stack<TreeNode*> s;
        vector<int> res;
        TreeNode* cur=root;
        TreeNode* top;
        while(cur!=NULL||!s.empty()){
            while(cur!=NULL){
                s.push(cur);
                cur=cur->left;
            }
            top=s.top();
            s.pop();
            res.push_back(top->val);
            cur=top->right;
        }       
        return res;
    }
};

