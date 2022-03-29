var XXX = function(s) {
    const romanObj = {
        I: 1,
        V: 5,
        X: 10,
        L: 50,
        C: 100,
        D: 500,
        M: 1000
      };
      const res = s.split('').reduce((sum, current, index, arr) => {
        sum = sum + romanObj[current];
        if ((current === 'V' || current === 'X') && arr[index - 1] === 'I') sum -= 2;
        if ((current === 'L' || current === 'C') && arr[index - 1] === 'X') sum -= 20;
        if ((current === 'D' || current === 'M') && arr[index - 1] === 'C') sum -= 200;
        return sum;
      }, 0);
      return res;
};

