 class Solution {
public:
    bool XXX(TreeNode* root) {
        stack<TreeNode*> s;
        vector<int> res;
        while(root||!s.empty()){
            while(root){
                s.push(root);
                root = root->left;
            }
            root = s.top();
            s.pop();
            res.push_back(root->val);
            root = root->right;
        }
        for(int i=0;i<res.size()-1;i++){
            if(res[i]>=res[i+1]) return false;
        }
        return true;
    }

