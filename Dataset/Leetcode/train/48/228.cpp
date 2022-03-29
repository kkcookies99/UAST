class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n=matrix.size();
        for(int i=0;i<n/2;++i){
            rot(matrix,i,n-1-i);
        }
    }
    void rot(vector<vector<int>>& matrix,int lt,int rb){//lefttop=lt rightbot=rb
        for(int i=0;i<rb-lt;++i){
            swap(matrix[lt][i+lt],matrix[lt+i][rb]);
            swap(matrix[lt][i+lt],matrix[rb][rb-i]);
            swap(matrix[lt][i+lt],matrix[rb-i][lt]);
        }
    }    
    void swap(int&a,int&b){
        int tmp=a;
        a=b;
        b=tmp;
    }   
};

