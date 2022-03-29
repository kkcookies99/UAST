 var XXX = function(s) {
    let decodeString = s.replace(/[^0-9a-zA-Z]/g, '').toLowerCase();
    return decodeString === decodeString.split('').reverse().join('');
};

