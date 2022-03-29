class Solution {
public:
    int tmpMin = 9999, i = 0;
    int XXX(TreeNode* root) {
        if(root == nullptr) return 0;        
        if(root != nullptr){
            i++; 
            if(root->left == nullptr && root->right == nullptr){
                tmpMin = tmpMin>i?i:tmpMin; 
                i--;
                return tmpMin;        
            }
        }
        XXX(root->left);
        XXX(root->right);
        i--;
        return tmpMin;
    }
};

