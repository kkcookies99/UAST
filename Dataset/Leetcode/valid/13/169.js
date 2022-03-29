var XXX = function(s) {
  if (!s || !typeof s === 'string') return;
  const map = {
    'I': 1,
    'V': 5,
    'X': 10,
    'L': 50,
    'C': 100,
    'D': 500,
    'M': 1000,
    // 以下是特殊情况，优先处理（有规律，减去2或者20或者200）
    'IV': 4,
    'IX': 9,
    'XL': 40,
    'XC': 90,
    'CD': 400,
    'CM': 900,
  };

  let res = 0, len = s.length;
  for (let i = 0; i < len; i++) {
    res += map[s[i]];
  }
  if (s.includes('IV') || s.includes('IX')) res -= 2;
  if (s.includes('XL') || s.includes('XC')) res -= 20;
  if (s.includes('CD') || s.includes('CM')) res -= 200;
  return res;
};

