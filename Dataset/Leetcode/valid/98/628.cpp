 class Solution {
public:
    bool XXX(TreeNode* root){
        return in_order(root);
    }
    int in_order(TreeNode* root){
        if(nullptr != root){
            if(!in_order(root->left)) return 0;
            if(pre_val.size()){
                if(root->val <= pre_val[0])
                    return 0;
            }
            else
                pre_val.push_back(root->val);
            pre_val[0] = root->val;
            if(!in_order(root->right)) return 0;
        }
        return 1;
    }
private:
    vector<int> pre_val;
};

