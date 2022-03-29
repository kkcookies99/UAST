 class Solution {
public:
    bool XXX(TreeNode* root) {
        if((root == nullptr) ||
        (root->left == nullptr && root->right == nullptr)) return true;
        if((root->left == nullptr && root->right != nullptr) || 
        (root->left != nullptr && root->right == nullptr)) return false;
        if(root->left->val != root->right->val) return false;
        vector<TreeNode*> temp = {};
        vector<TreeNode*> parents = {};
        parents.push_back(root->left);
        parents.push_back(root->right);
        bool result = false;
        while(true)
        {
            int size = parents.size();
            for(int i = 0; i != size-1; i++)
            {
                if((parents[i]->left == nullptr && parents[size-1-i]->right != nullptr) ||
                (parents[i]->left != nullptr && parents[size-1-i]->right == nullptr)) return false;
                else if (parents[i]->left == nullptr && parents[size-1-i]->right == nullptr) {}
                else if(parents[i]->left->val != parents[size-1-i]->right->val) return false;

                if((parents[i]->right == nullptr && parents[size-1-i]->left != nullptr) ||
                (parents[i]->right != nullptr && parents[size-1-i]->left == nullptr)) return false;
                else if (parents[i]->right == nullptr && parents[size-1-i]->left == nullptr) {}
                else if (parents[i]->right->val != parents[size-1-i]->left->val) return false;              
            }
            int nullCount = 0;
            for(int j = 0; j<parents.size();j++)
            {
                if(parents[j]->left == nullptr) nullCount++;
                else temp.push_back(parents[j]->left);
                if(parents[j]->right == nullptr) nullCount++;
                else temp.push_back(parents[j]->right); 
                           
            }
            if(nullCount == (parents.size()*2)) 
            {
                result = true;
                break;
            }
            parents = temp;
            temp.clear();         
        }

        return result;
    }
};

