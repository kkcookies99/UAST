 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> tar;
        stack<TreeNode *> Stack;
        TreeNode *p=root;
        while(!Stack.empty()||p!=NULL){
            while(p!=NULL){
                Stack.push(p);
                p=p->left;

            }
            if(!Stack.empty()){
                p=Stack.top();
                Stack.pop();
                 tar.push_back(p->val);
                p=p->right;

            }
        }
        return tar;
        }
};```

