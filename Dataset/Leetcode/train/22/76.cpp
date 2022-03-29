 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> box;
        DFS(box,"",0,n);
        return box;
    }

    void DFS(vector<string> &box,string temp,int a,int b){
        if(a != 0){
            DFS(box,temp + ")",a - 1,b);
        }
        if(b != 0){
            DFS(box,temp + "(",a + 1,b - 1);
        }
        if(a == 0 && b == 0){
            box.push_back(temp);
        }
    }
};

