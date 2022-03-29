 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {  
        int l=0,r=matrix[0].size()-1;

        while(l<r){
            XXX_rect(matrix,l,r);
            l++;
            r--;
        }
    }
    void XXX_rect(vector<vector<int>>& matrix,int l,int r){ 
        for (int i=l;i<r;i++){
            swap(matrix[l][i],matrix[i][r]);
            swap(matrix[l][i],matrix[r][r-(i-l)]);
            swap(matrix[l][i],matrix[r-(i-l)][l]);
        }

    }
};

