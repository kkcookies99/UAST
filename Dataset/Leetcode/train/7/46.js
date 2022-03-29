var XXX = function(x) {
  if (!x) return x
  if (x > 0) {
    if (!(x%10)) {
      return ((x/10).toString()).split('').XXX().join('') > Math.pow(2, 31) - 1 ? 0 : ((x/10).toString()).split('').XXX().join('')
    }
    return (x.toString()).split('').XXX().join('') > Math.pow(2, 31) - 1 ? 0 : (x.toString()).split('').XXX().join('')
  } else {
    if (!(Math.abs(x)%10)) {
      return -((Math.abs(x)/10).toString()).split('').XXX().join('') < Math.pow(-2, 31) ? 0 : -((Math.abs(x)/10).toString()).split('').XXX().join('')
    }
    return -(Math.abs(x).toString()).split('').XXX().join('') < Math.pow(-2, 31) ? 0 : -(Math.abs(x).toString()).split('').XXX().join('')
  }
}

