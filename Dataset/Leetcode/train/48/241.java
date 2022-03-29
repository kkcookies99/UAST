public void XXX(int[][] matrix) {
    //先上下翻转
    for (int i = 0; i < matrix.length / 2; i++) {
        int[] template = matrix[i];
        matrix[i] = matrix[matrix.length - i - 1];
        matrix[matrix.length - i - 1] = template;
    }
    //对角翻转
    for (int i = 0; i < matrix.length; i++) {
        for (int j = i; j < matrix.length; j++) {
            int template = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = template;
        }
    }
}
undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


