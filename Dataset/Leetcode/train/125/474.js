 var XXX = function(s) {
    var temp=s.replace(/[^A-Za-z0-9]/g,'').toLowerCase()
    return temp===temp.split('').reverse().join('')
};

