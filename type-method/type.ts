type chnge={
    Name: String;
    mobileNo: String;

};



var a:chnge=[{Name:"muthu", mobileNo:"789654367"},{Name:"muthu",mobileNo:"9876567895"}]

//for each loop
a.forEach(details=>console.log(details))
console.log("find function");
//find

let b=a.find((out,index)=> out.Name=="muthu")
console.log(b);

console.log("Filter c");

//filter
let c=a.filter((out,index)=> out.Name=="muthu")
let e=c
//   c.name not possible
console.log(e);

//map
let d=a.map((out,index)=> out.Name=="muthu")
console.log(d);
