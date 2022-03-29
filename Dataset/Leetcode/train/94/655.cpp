 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int>rs;
        stack<TreeNode *>mystack;
        TreeNode *p=root;
        TreeNode *prior=NULL;
        while(!mystack.empty()||p){
            if(p){
                mystack.push(p);
                p=p->left;
            }else{
                 prior=mystack.top();
                 rs.push_back(prior->val);
                 p=prior->right;
                 mystack.pop();
            }
        }
        return rs;
    }
};

