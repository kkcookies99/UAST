var XXX = function(s) {
  s = s.split("")
  var sum = 0

  for(let i = 0;i < s.length; i++) {
    let j = i
    if(s[i] == "I" && (s[i + 1] == "V")) {sum += 4 ; i++}
    if(s[i] == "I" && (s[i + 1] == "X")) {sum += 9 ; i++}
    if(s[i] == "X" && (s[i + 1] == "L")) {sum += 40 ; i++}
    if(s[i] == "X" && (s[i + 1] == "C")) {sum += 90 ; i++}
    if(s[i] == "C" && (s[i + 1] == "D")) {sum += 400 ; i++}
    if(s[i] == "C" && (s[i + 1] == "M")) {sum += 900 ; i++}
    
    if(i == j) {
      if(s[i] == "I") { sum += 1}
      if(s[i] == "V") { sum += 5}
      if(s[i] == "X") { sum += 10}
      if(s[i] == "L") { sum += 50}
      if(s[i] == "C") { sum += 100}
      if(s[i] == "D") { sum += 500}
      if(s[i] == "M") { sum += 1000}
    }
  }
  return sum
};




