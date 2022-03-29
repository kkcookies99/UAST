 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==NULL)
            return true;
        stack<TreeNode*> sz;
        stack<TreeNode*> sf;
        TreeNode *currz=root;
        TreeNode *currf=root;
        while(currf!=NULL||currz!=NULL||!sz.empty()||!sf.empty()){
            while(currf!=NULL&&currz!=NULL){
                sz.push(currz);
                sf.push(currf);
                currz=currz->left;
                currf=currf->right;
            }
            if(currz==NULL&&currf==NULL){
                if(!sz.empty()&&!sf.empty()){
                    currz=sz.top();
                    currf=sf.top();
                    if(currz->val!=currf->val)
                        return false;
                    sz.pop();
                    sf.pop();
                    currf=currf->left;
                    currz=currz->right;
                }
            }else{
                return false;
            }
        }
        return true;
    }
    
};

