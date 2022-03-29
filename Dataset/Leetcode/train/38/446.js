 var XXX = function(n) {
  if (n === 1) {
    return '1'
  }
  const dfs = (str, idx) => {
    let temp = str[0]
    let count = 1
    let res = []
    for (let i = 1; i < str.length; i++) {
      if (str[i] !== temp) {
        res.push(count.toString())
        res.push(temp)
        temp = str[i]
        count = 1
      } else {
        count++
      }
    }
    res.push(count.toString())
    res.push(temp)
    res = res.join('')
    if (idx === n) {
      return res
    } else {
      return dfs(res, idx + 1)
    }
  }
  return dfs('1', 2)
};

