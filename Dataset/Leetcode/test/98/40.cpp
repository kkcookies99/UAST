 class Solution {
public:
    TreeNode* pre;
    bool XXX(TreeNode* root) {
        //方法一 非递归
        stack<TreeNode*> s;
        TreeNode* cur = root;  
        while(!s.empty() || cur){
            if(cur){
                s.push(cur);
                cur = cur->left;
            }else{
                cur = s.top();
                s.pop();
                if(pre && pre->val >= cur->val) return false;
                pre = cur;
                cur = cur->right;
            }
        }
        return true;
        
        //方法二 递归
        if(root == NULL)
            return true;
        if(!XXX(root->left)){
            return false;
        }
        if(pre && pre->val >= root->val)
            return false;
        pre = root;
        if(!XXX(root->right))
            return false;
        return true;
            
    }

};

