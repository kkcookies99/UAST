class Solution {
public:
    int XXX(TreeNode* root) {
        stack<int> stk1;
        stack<TreeNode*> stk2;
        int curdep = 0;
        int maxdep = 1;
        while(root!=nullptr||!stk2.empty()){
            while(root){
                stk1.push(curdep);
                stk2.push(root);
                curdep++;
                root = root->left;
            }
            root = stk2.top();
            stk2.pop();
            curdep = stk1.top();
            stk1.pop();
            curdep++;
            if(maxdep<curdep){
            maxdep = curdep;
        }
            root = root->right;
        }
        return maxdep;
    }
};

