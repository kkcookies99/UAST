 class Solution {
public:
    string s = "";
    bool XXX(TreeNode* p, TreeNode* q) {
        string s1 = treetostr(p);
        s = "";
        string s2 = treetostr(q);
        return s1 == s2 ? true : false;
    }
    
    string treetostr(TreeNode* r)
    {
        if(!r)
        {
            s += "#";
            return s;
        }
        else
        s += to_string(r -> val);
        treetostr(r -> left);
        treetostr(r -> right); 
        return s;
    }
};

