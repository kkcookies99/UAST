var XXX = function(a, b) {
  let shorter = a.length > b.length ? b : a
  let longer = shorter == a ? b : a
  shorter = shorter.padStart(longer.length, '0')
  let res = [], k = 0, j = 0
  for (let i = shorter.length - 1; i >= 0; i--) {
    let t1 = Number(shorter[i]) + Number(longer[i]) + k
    res[j++] = t1 & 1
    if (t1 >= 2) k = 1
    else k = 0
  }
  if (k == 1) {
    res.push(1)
  }
  return res.reverse().join('')
};

