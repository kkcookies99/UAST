var XXX = function(nums) {
  let arr = [], temp = []
  const dfs = () => {
    if (temp.length == nums.length) {
      arr.push([...temp])
      return
    }
    for (let i = 0; i < nums.length; i++) {
      if (temp.includes(nums[i])) continue
      temp.push(nums[i])
      dfs()
      temp.pop()
    }
  }
  dfs(0)
  return arr
};

