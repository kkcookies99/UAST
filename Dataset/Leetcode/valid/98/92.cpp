 class Solution {
public:
    vector<int> nodes_vec; 
    void traversal(TreeNode* node) {
        if (node == nullptr) return; 
        // in order traversal, left, visit, right
        traversal(node->left);
        nodes_vec.push_back(node->val);
        traversal(node->right); 
    }
    bool XXX(TreeNode* root) {
        nodes_vec.clear(); 
        traversal(root); 
        auto it = adjacent_find(nodes_vec.begin(), nodes_vec.end(), greater_equal<int>()); 
        if (it == nodes_vec.end()) return true; 
        else return false; 
    }
};

