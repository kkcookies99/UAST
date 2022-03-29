 class Solution {
public:
    bool XXX(TreeNode* root) {
        int value=INT_MIN;
        bool flag=true;
        return judge(root,value,flag);
    }
    bool judge(TreeNode* root,int& value,bool& flag){
        if(!root) return true;
        bool record=judge(root->left,value,flag);
        if(!record) return false;
        if(flag){flag=false;value=root->val;}
        else if(!flag&&root->val>value){
            value=root->val;
        }
        else return false;
        record=judge(root->right,value,flag);
        return record;
    }
};

