 var XXX = function(numRows) {
    if (numRows == 0) {
      return []
    }
    if (numRows == 1) {
      return [[1]]
    } else {
      const results = XXX(numRows - 1);
      const lastResult = results[results.length - 1];
      const result = []
      for (let i = 0; i < lastResult.length + 1; i++) {
        result[i] = (lastResult[i - 1] || 0) + (lastResult[i] || 0)
      }
      results.push(result);
      return results;
    }
};

