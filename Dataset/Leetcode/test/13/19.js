var XXX = function(s) {
  const map = {
    I: 1,
    V: 5,
    X: 10,
    L: 50,
    C: 100,
    D: 500,
    M: 1000,
  }

  const mapCombine = {
    IV: 4,
    IX: 9,
    XL: 40,
    XC: 90,
    CD: 400,
    CM: 900
  }

  let ret = 0
  let j = 0

  while (j < s.length) {
    if (mapCombine[`${s[j]}${s[j + 1]}`]) {
      ret += mapCombine[`${s[j]}${s[j + 1]}`]
      j += 2
    } else {
      ret += map[`${s[j]}`]
      j++
    }
  }

  return ret
};

