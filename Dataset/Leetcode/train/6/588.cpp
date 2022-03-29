 class Solution {
public:
    string XXX(string s, int numRows) {
        string res = "";
        if(numRows == 1) return s;
        // 得到横坐标循环队列 例如：numRows=5时的rowCircle {0, 1, 2, 3, 4, 3, 2, 1} 以后就是这个rowCirle的循环
        vector<int> rowCircle; 
        int set = 2;
        for(int i=0; i<numRows*2; i++){
            if(i < numRows){
                rowCircle.push_back(i);
            }else if(i >= numRows){
                if(i - set == 0) break;
                rowCircle.push_back(i-set);
                set = set + 2;
            }
        }
        
        // 得到纵坐标循环队列
        vector<int> colCircle;
        for(int i=0; i<numRows; i++) colCircle.push_back(0);
        for(int i=0, count = 1; i < numRows-2; i++, count++) colCircle.push_back(count);
        int len = s.size();
        int containCharNum = 2*numRows - 2;
        int oneContainsWhichCol = numRows - 1;
        int numCols = ceil(((float)len / containCharNum)) * oneContainsWhichCol;



        char** matrix = (char**)malloc(sizeof(char*)*numRows);   
        for(int i=0; i<numRows; i++)   
            matrix[i] = (char*)malloc(sizeof(char)*numCols);
        for(int i=0; i<numRows; i++){
            for(int j=0; j<numCols; j++)
                matrix[i][j] = ' ';
        }
        int rowPointer = 0, colPointer = 0, strPointer = 0;
        for(int i=0; i<s.size(); i ++){
            
            matrix[ rowCircle[rowPointer] ] [ colCircle[colPointer] ] = s[strPointer++];

            colCircle[colPointer] += (numRows-1);
            rowPointer = (rowPointer + 1) % rowCircle.size();
            colPointer = (colPointer + 1) % colCircle.size();
        }
        for(int i=0; i<numRows; i++){
            for(int j=0; j<numCols; j++){
                if(matrix[i][j] != ' '){
                    char ch = 'X';
                    string temp="a" ;
                    temp[0] = matrix[i][j];
                    res = res + temp;
                }
            }
        }

        return res;
    }
};

