 class Solution {
public:
    string leftTravel(TreeNode* root){
        if(!root) return " ";
        string result;
        result+=to_string(root->val);
        result+=leftTravel(root->left);
        result+=leftTravel(root->right);
        return result;
    }
    string rightTravel(TreeNode* root){
        if(!root) return " ";
        string result;
        result+=to_string(root->val);
        result+=rightTravel(root->right);
        result+=rightTravel(root->left);
        return result;
    }
    bool XXX(TreeNode* root) {
        if(!root)
            return true;
        else{
            string leftStr = leftTravel(root->left);
            string rightStr = rightTravel(root->right);
            return leftStr == rightStr;
        } 
    }
};

