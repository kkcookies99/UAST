class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int layers = (matrix.size()+1)/2;
        for(int i=0;i<layers;i++){
            int x1=i, y1=i;
            int x2=matrix.size()-i-1, y2=i;
            int x3=matrix.size()-i-1, y3=matrix.size()-i-1;
            int x4=i, y4=matrix.size()-i-1;
            for(int j=i;j<matrix.size()-i-1;j++){
                int temp = matrix[x1][y1];
                matrix[x1][y1] = matrix[x2][y2];
                matrix[x2][y2] = matrix[x3][y3];
                matrix[x3][y3] = matrix[x4][y4];
                matrix[x4][y4] = temp;
                x1++;
                y2++;
                x3--;
                y4--;
            }
        }
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


