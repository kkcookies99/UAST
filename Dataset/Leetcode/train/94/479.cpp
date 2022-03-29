 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        stack<TreeNode *> s;
        vector<int> inorder;
        if(root == NULL){
            return inorder;
        }
        s.push(root);
        TreeNode* t = root;
        while(t->left){
            s.push(t->left);
            t = t->left;
        }
        while(!s.empty()){
            TreeNode* t = s.top();
            inorder.push_back(t->val);
            s.pop();
            if(t->right){
                s.push(t->right);
                t = t->right;
                while(t->left){
                    s.push(t->left);
                    t = t->left;
                }
            }
        }

        return inorder;
    }
};

