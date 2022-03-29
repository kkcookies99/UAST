 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        //非递归算法

        vector<int> result ;
        if(root == NULL) return result;
        stack<TreeNode*> s ;
        TreeNode* p;
        p = root;
        while(p || !s.empty()){
            if(p){
                s.push(p);
                p = p->left;
            }
            else{
                TreeNode* temp;
                temp = s.top();
                s.pop();
                result.push_back(temp->val);
                p = temp->right;
            }

        }
        return result;

    }
};

