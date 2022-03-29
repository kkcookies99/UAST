 class Solution {
    public void XXX(int[][] matrix) {
        for(int i=0;i<matrix.length/2;i++){
            int length=matrix.length;
            int up=i;//up的row
            int right=i;//right的col
            int down=matrix.length-i-1;//down的row
            int left=matrix.length-i-1;//left的col
            while(up<length-1-i){
                //四角交换
                int upVal=matrix[i][up];
                int rightVal=matrix[right][length-1-i];
                int downVal=matrix[length-i-1][down];
                int leftVal=matrix[left][i];
                matrix[i][up]=leftVal;
                matrix[right][length-1-i]=upVal;
                matrix[length-i-1][down]=rightVal;
                matrix[left][i]=downVal;
                //更新
                up++;
                right++;
                down--;
                left--;
            }
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


