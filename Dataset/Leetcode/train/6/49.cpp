 class Solution {
public:
    string XXX(string s, int numRows) {
        string res;
        int len = s.size();
        int row = 0,line = -1;
        char res_Z[numRows][len+1];//用一个行数为输入值，列数不固定的多维数组作为Z数组
        memset(res_Z, '0',sizeof(res_Z));
        //生成Z数组
        for(int i = 0; i < len;){
            line++;
            if(row == 0){
                while(row < numRows){//生成竖向笔画上的字母
                    res_Z[row][line] = s[i++];
                    row++;//列不变，只变行
                    if(i >= len) break;//如果铺不满这一竖向则跳出
                }
                row--;//出while的row等于numRows,需要减1
                continue;
            }    
            if(row != 1){//生成斜向笔画上的字母，生成完后row会变为0
                row--;
                res_Z[row][line] = s[i++];
            }
            else row--;//如果numRows等于2则没有斜向笔画，row--直接进入下一个竖向笔画
        }
        //按先列后行的规则输出Z数组
        for(int i = 0;i < numRows; i++)
            for(int j = 0;j <= line; j++) 
                if(res_Z[i][j] != '0') 
                    res+=res_Z[i][j];  
        return res;
    }
};

