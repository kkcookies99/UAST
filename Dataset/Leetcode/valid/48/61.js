var XXX = function(matrix) {
  let m = matrix.length, n = matrix[0].length
  const arr = new Array(n).fill(0).map(() => new Array(m).fill(0))
  let x = 0, y = 0
  for (let j = 0; j < n; j++) {
    y = 0
    for (let i = m - 1; i >= 0; i--) {
      arr[x][y] = matrix[i][j]
      y++
    }
    x++
  }
  for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < arr[0].length; j++) {
      matrix[i][j] = arr[i][j]
    }
  }
};

