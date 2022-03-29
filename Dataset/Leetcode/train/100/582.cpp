 class Solution {
public:
    void trans(string& res,TreeNode* s){
        if(s){
            res+=to_string(s->val);
            trans(res,s->left);
            trans(res,s->right);
        }
        else res+="0";
    }
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p==NULL&&q==NULL) return true;
        if(p==NULL||q==NULL) return false; 
        string res1="",res2="";
        trans(res1,p);
        trans(res2,q);
        if(strcmp(res1.c_str(),res2.c_str())) return false;
        else return true;
    }
};

