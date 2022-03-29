 class Solution {
public:
    vector<int> lvec;
    vector<int> rvec;
    bool XXX(TreeNode* root) {
        leftVisit(root->left);
        rightVisit(root->right);
        return lvec==rvec;
    }
    void leftVisit(TreeNode* root){
        if(root){
            lvec.push_back(0);
            return;
        }
        leftVisit(root->left);
        leftVisit(root->right);
        lvec.push_back(root->val);
    }
    void rightVisit(TreeNode* root){
        if(root){
            rvec.push_back(0);
            return;
        }
        rightVisit(root->right);
        rightVisit(root->left);
        rvec.push_back(root->val);
    }
};

