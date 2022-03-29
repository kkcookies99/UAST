class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
    	int size = matrix.size();
        for(int i=0 ;i<size; i++){
        	for(int j=i+1;j<size;j++){
        		matrix[i][j] = matrix[i][j] ^ matrix[j][i];
        		matrix[j][i] = matrix[i][j] ^ matrix[j][i];
      			matrix[i][j] = matrix[i][j] ^ matrix[j][i];
        	}
        }
        for(int i=0;i<size;i++){
        	for(int j=0;j<size/2;j++){
        		matrix[i][j] = matrix[i][j] ^ matrix[i][size-j-1];
        		matrix[i][size-j-1] = matrix[i][j] ^ matrix[i][size-j-1];
        		matrix[i][j] = matrix[i][j] ^ matrix[i][size-j-1];
        	}
        }
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


