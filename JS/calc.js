var erase= document.getElementById("erase")
var clr= document.getElementById("clr")
var input= document.getElementById("input")
var modulos= document.getElementById("modulos")
var divide= document.getElementById("divide")
var seven= document.getElementById("seven")
var eight= document.getElementById("eight")
var nine= document.getElementById("nine")
var multiply= document.getElementById("multiply")
var four= document.getElementById("four")
var five= document.getElementById("five")
var six= document.getElementById("six")
var minus= document.getElementById("minus")
var one= document.getElementById("one")
var two= document.getElementById("two")
var three= document.getElementById("three")
var plus= document.getElementById("plus")
var zero= document.getElementById("zero")
var dot= document.getElementById("dot")
var answer= document.getElementById("answer")

erase.addEventListener("click",()=>{
    input.value=null;
  
})
clr.addEventListener("click",()=>{
    input.value=input.value.slice(0,input.value.length-1)
})
modulos.addEventListener("click",()=>{
    input.value+=modulos.value
})
divide.addEventListener("click",()=>{
    input.value+=divide.value
})
seven.addEventListener("click",()=>{
    input.value+=seven.value
})
eight.addEventListener("click",()=>{
    input.value+=eight.value
})
nine.addEventListener("click",()=>{
    input.value+=nine.value
})
multiply.addEventListener("click",()=>{
    input.value+=multiply.value
})
four.addEventListener("click",()=>{
    input.value+=four.value
})
five.addEventListener("click",()=>{
    input.value+=five.value
})
six.addEventListener("click",()=>{
    input.value+=six.value
})
minus.addEventListener("click",()=>{
    input.value+=minus.value
})
one.addEventListener("click",()=>{
    input.value+=one.value
})
two.addEventListener("click",()=>{
    input.value+=two.value
})
three.addEventListener("click",()=>{
    input.value+=three.value
})
plus.addEventListener("click",()=>{
    input.value+=plus.value
})
zero.addEventListener("click",()=>{
    input.value+=zero.value
})
dot.addEventListener("click",()=>{
    input.value+=dot.value
})
answer.addEventListener("click",()=>{
  let a=eval(input.value)
  input.value=a;
});
input.addEventListener("keyup", ()=>{
    if(input.value==1){
      one.style.boxShadow="5px 5px 11111113px #41407e,-1px -2px 3px #958bed";
    //   one.style.transition="boxshadow 2s";
    //   one.style.boxShadow="inset 5px 5px 2px #41407e,inset -1px -2px 3px #958bed"; 
    }
    
})

