 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> ans;
        stack<TreeNode*> s;
        TreeNode *p=root;
        while(p||!s.empty()){
            if(p){
                s.push(p);
                p = p->left;
            }
            else{
                p = s.top();s.pop();
                ans.push_back(p->val);
                p=p->right;
            }
        }
        
        return ans;
    }
};

