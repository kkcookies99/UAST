   public void XXX(int[][] matrix) {
        // 对角反转
        change_cross(matrix);
        // 水平翻转
        change_middle(matrix);
       
    }


   public void change_middle(int [][] matrix ){
       int len =matrix.length ;
       int start =0 , stop= len-1 ;
        while(start <= stop ){
            for(int i=0;i<len ;i++){
                int temp =matrix[start][i];
               matrix[start][i]= matrix[stop][i] ;
               matrix[stop][i]  = temp ;
            }

            start ++;
            stop --;

        }
    }

     public void change_cross(int [][] matrix ){
       int len =matrix.length ;
       for(int i=0;i<len;i++){
           for(int j =0;j+i<len ; j++){
               int lef_dis = i-0;
               int rig_dis = j-0 ; 
               int changex = len - 1 - rig_dis;
               int changey = len - 1 - lef_dis;

               int temp = matrix[changex][changey];
                matrix[changex][changey]= matrix[i][j] ;
               matrix[i][j]  = temp ;
           }
       }
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


