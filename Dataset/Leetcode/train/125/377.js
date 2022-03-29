 var XXX = function(s) {
  s = s.replace(/[^\da-zA-Z]/g, '').toLocaleLowerCase()
  return s.split('').reverse().join('') === s
};

