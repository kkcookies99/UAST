var XXX = function(s) {
  const result = [];
  let last = '';
  
  const special = {
      I: ['V', 'X'],
      X: ['L', 'C'],
      C: ['D', 'M']
  };

  const map = {
      I: 1,
      V: 5,
      X: 10,
      L: 50,
      C: 100,
      D: 500,
      M: 1000
  }

  for(let char of s) {
      if(special[last] && special[last].includes(char)) {
          result.push(map[char] - (map[last] * 2))
      } else {
          result.push(map[char]);
          last = '';
      }
          
      if(special[char]) {
          last = char;
      }
  }
  
  return result.reduce((a,b) => a+b)
};

