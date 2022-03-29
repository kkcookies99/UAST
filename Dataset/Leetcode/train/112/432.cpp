 class Solution {
public:
    vector<int> res;
    bool XXX(TreeNode* root, int sum) {
        if(root == NULL)return false;
        lengthroute(root,0);
        for(auto r:res){
            if(r == sum)return true;
        }
        return false;
    }
    void lengthroute(TreeNode* root, int level){
        if(root == NULL)return;
        level += root->val;
        if(root->left == NULL && root->right == NULL){
            res.push_back(level);
            return;
        }
        lengthroute(root->left,level);
        lengthroute(root->right,level);
    }

};

