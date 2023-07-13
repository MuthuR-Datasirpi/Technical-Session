var a = [{ Name: "muthu", mobileNo: "789654367" }, { Name: "muthu", mobileNo: "9876567895" }];
//for each loop
a.forEach(function (details) { return console.log(details); });
console.log("find function");
//find
var b = a.find(function (out, index) { return out.Name == "muthu"; });
console.log(b);
console.log("Filter condition");
//filter
var c = a.filter(function (out, index) { return out.Name == "muthu"; });
var e = c;
//   c.name not possible
console.log(e);
//map
var d = a.map(function (out, index) { return out.Name == "muthu"; });
console.log(d);
