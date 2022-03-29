 class Solution {
public:
    struct node{
        char val;
        node *left;
        node *right;
        node(char ch):val(ch),left(nullptr),right(nullptr){}
    };

    void buildMap(node *&newNode, char ch, int count){
        if(count <= 0)return;
        --count;
        newNode = new node(ch);
        buildMap(newNode->left, '(', count);
        buildMap(newNode->right, ')', count);
    }

    void getTemp(string temp, node *curNode, int left_tt, vector<string>&total){
        if(curNode == nullptr){
            if(left_tt == 0){
                total.push_back(temp);
                return;
            }
        }
        else{
            if(curNode->val == '(')++left_tt;
            else if(left_tt <= 0)return;
            else --left_tt;
            temp.push_back(curNode->val);
            getTemp(temp, curNode->left, left_tt, total);
            getTemp(temp, curNode->right, left_tt, total);
        }
    }

    vector<string> XXX(int n) {
        vector<string> total;
        node *newNode;
        buildMap(newNode, '(', 2*n);
        string temp;
        int left_tt = 0;
        getTemp("", newNode, 0, total);
        sort(total.begin(), total.end());
        auto end_uniq = unique(total.begin(), total.end());
        total.erase(end_uniq, total.end());
        return total;
    }
    
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

