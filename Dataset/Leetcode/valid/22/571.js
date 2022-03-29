 var XXX = function(n) {
  let temp = [], arr = []
  const A = (t) => {
    if (t < 0 || t > n) return
    if (temp.length >= 2 * n) {
      if (t == 0) {
        arr.push(temp.join(''))
      }
      return;
    }
    temp.push('(')
    A(t + 1)
    temp.pop("(")
    temp.push(")")
    A(t - 1)
    temp.pop(")")
  }
  A(0)
  return arr
};```

