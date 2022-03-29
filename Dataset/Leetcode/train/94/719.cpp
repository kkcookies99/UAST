 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> ret;
        if (!root) {
            return ret;
        }
        stack<pair<TreeNode *, bool>> st;
        st.push(pair{root->right, false});
        st.push(pair{root, true});  //true表示子节点已入栈
        st.push(pair{root->left, false});
        while (!st.empty()) {
            auto it = st.top();
            st.pop();
            if (!it.first) {
                continue;
            }
            if (it.second) {
                ret.emplace_back(it.first->val);
                continue;
            }
            it.second = true;
            st.push(pair{it.first->right, false});
            st.push(it);
            st.push(pair{it.first->left, false});
        }
        return ret;
    }
};

