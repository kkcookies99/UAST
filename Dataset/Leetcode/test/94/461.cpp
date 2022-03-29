 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> res;
        stack<TreeNode*> helper;
        while(nullptr != root) {
            helper.push(root);
            if(nullptr != root->left) {
                root = root->left;
            }
            else {
                while(!helper.empty()) {
                    res.push_back(helper.top()->val);
                    if(nullptr != helper.top()->right) {
                        root = helper.top()->right;
                        helper.pop();
                        break;
                    }
                    else {
                        helper.pop();
                        root = nullptr;
                    }
                }
            }
        }

        return res;
    }
};

