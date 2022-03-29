     var XXX = function(matrix) {
         const m = matrix.length;
         const n = matrix.length;
         let arr = new Array(m).fill(0).map(item=> new Array(m).fill(0));
         for (let i = 0; i < m; i++) {
           for (let j = 0; j < n; j++) {
              arr[j][n - i - 1] = matrix[i][j];
           }
         }
         console.log(arr)
        //  注意原地修改的问题，不管你return什么这道题检测的还是matrix值，所以最终我们还是需要改变matrix的值
        // 如果直接matrix=arr，只是修改了引用地址，但是实际值并没有发生改变，并不满足要求
          for (let i = 0; i < m; i++) {
           for (let j = 0; j < n; j++) {
              matrix[i][j] =arr[i][j];
           }
         }
         return matrix;
};

