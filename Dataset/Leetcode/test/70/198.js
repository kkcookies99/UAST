var XXX = function(n) {
    let memo = {
        1: 1,
        2: 2
      };
      for (let i = 3; i <= n; i++) {
        memo[i] = memo[i-1] + memo[i-2];
      }
      return memo[n];
};

