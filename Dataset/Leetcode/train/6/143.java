     public String XXX(String s, int numRows) {
        char[] chrs = s.toCharArray();
        char[][] data = new  char[chrs.length][numRows];
        System.out.println("length:"+chrs.length+",numRows="+numRows);
        int l = numRows;
        int flag = 0;
        int x = 0;
        int y = 0;
        int y_operation = 1;

        if(numRows == 1){
            return s;
        }


        for (int i=0;i<chrs.length;i++){
            char chr = chrs[i];
            data[x][y] = chr;

            flag ++;
            if(flag == l){
                l = 1;
                flag = 0;

                x++;

                if(y == numRows - 1){
                    y_operation = 0;
                }

                if(y == 0){
                    y_operation = 1;
                    flag = 1;
                    l = numRows;
                }
            }

            if(y_operation == 1){
                y++;
            }else{
                y--;
            }

        }

        StringBuffer sb = new StringBuffer();
        for (int j = 0;j<numRows; j++)
            for (int i = 0;i<chrs.length; i++){

                if(data[i][j] != '\0'){
                    sb.append(data[i][j]);
                }

            }

        return sb.toString();
    }

