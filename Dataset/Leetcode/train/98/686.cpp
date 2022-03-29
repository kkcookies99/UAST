 class Solution {
public:
    bool XXX(TreeNode* root) {
        int mark=-9999;
        TreeNode*p=root;
        stack<TreeNode*>mystack;
        while(!mystack.empty()||p){
            if(p){
                mystack.push(p);
                p=p->left;
            }else{
                TreeNode* prior=mystack.top();
                p=prior->right;
                if(mark==-9999)mark=prior->val;
                else{
                    if(prior->val<=mark)return false;
                    else{
                        mark=prior->val;
                    }
                }
                mystack.pop();
            }
        }
        return true;
    }
};

