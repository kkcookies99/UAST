 class Solution {
public:
    void inner_print(TreeNode* root, vector<int> &arr){
        if(root == nullptr) return ;
        inner_print(root->left, arr);
        arr.push_back(root->val);
        inner_print(root->right,arr);
        return ;
    }
    bool XXX(TreeNode* root) {
        vector<int > arr;
        inner_print(root,arr);
        for(int i = 1; i < arr.size(); i++){
            if(arr[i] <= arr[i - 1]) return false;
        }
        return true;
    }
};

