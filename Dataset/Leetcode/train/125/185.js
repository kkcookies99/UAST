 var XXX = function(s) {
  if (!s)
    return true
  const len = s.length
  for (let front = 0, end = len - 1; front <= end;) {
    const f = s.charCodeAt(front)
    const e = s.charCodeAt(end)
    if (f < 48 || (f > 57 && f < 65) || (f > 90 && f < 97) || f > 122) {
      front++
      continue
    }
    if (e < 48 || (e > 57 && e < 65) || (e > 90 && e < 97) || e > 122) {
      end--
      continue
    }
    if (s[front].toLowerCase() === s[end].toLowerCase()) {
      front++
      end--
    } else {
      return false
    }
  }
  return true
}

