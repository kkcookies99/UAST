 var XXX = function(s) {
      const arr = s.split('')
      let b = []
      let max = 0
      for (let i = 0; i < arr.length; i++) {
        if (b.indexOf(arr[i]) > -1) {
          if (b.length > max) {
            max = b.length
          }
          b = b.slice(b.indexOf(arr[i]) + 1, b.length)
        }
        b.push(arr[i])
      }
      if (b.length > max) {
        max = b.length
      }
      return max
};

