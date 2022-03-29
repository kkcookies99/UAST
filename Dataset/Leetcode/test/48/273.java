public void XXX(int[][] matrix) {
        int len = matrix.length;
        int count = 0;
        int temp = 0;
        while(count < (len << 1 )) {
        	for(int i = count; i < len - 1 - count; i++) {
        		temp = matrix[count][i];
        		matrix[count][i] = matrix[len - 1 - i][count];
        		matrix[len - 1 - i][count] = matrix[len - 1 - count][len - 1 - i];
        		matrix[len - 1 - count][len - 1 - i] = matrix[i][len - 1 - count];
        		matrix[i][len - 1 - count] = temp;
        	}
            count++;
        }

    } 

