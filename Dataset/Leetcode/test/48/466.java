 class Solution {
    public void XXX(int[][] matrix) {
      Stack<Integer> stack = new Stack<Integer>();
      for(int i=matrix.length-1;i>=0;i--){
        for(int j=0;j<matrix[0].length;j++){
          stack.push(matrix[j][i]);
        }   
      }
      for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
          matrix[i][j]=stack.pop();
        }   
      }
      return;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


