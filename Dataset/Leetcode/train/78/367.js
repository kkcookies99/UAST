var XXX = function(nums) {
  let arr = [], temp = []
  const dfs = (index) => {
    arr.push([...temp])
    if (temp.length == nums.length) {
      return
    }
    for (let i = index; i < nums.length; i++) {
      temp.push(nums[i])
      dfs(i + 1)
      temp.pop()
    }
  }
  dfs(0)
  return arr
};

