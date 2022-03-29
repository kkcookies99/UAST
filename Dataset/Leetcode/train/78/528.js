 var XXX = function(nums) {
  const results = [[]];
  
  for (let n of nums) {
    results.forEach(result => {
      results.push([...result, n])
    })
  }
  
  return results;
};

