 var XXX = function(s) {
  let romanMap = {'I' : 1, 'V' : 5, 'X' : 10, 'L' : 50, 'C' : 100, 'D' : 500, 'M' : 1000 }
  let temp = 0,num = 0
  for(let i of s){
    num += romanMap[i] <= temp ?  romanMap[i] : romanMap[i] - temp * 2
    temp = romanMap[i]
  }
  return num
};

