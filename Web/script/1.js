
// var a=parseFloat(prompt('Enter first number'));
// var b=parseFloat(prompt("Enter second number "));

// alert(`First number is ${a}\nSecond number is${b}\nSum is: ${a+b}`)

// console.log(`First number is ${a}\nSecond number is${b}\nSum is: ${a+b}`);
//---------------------------------------------------------------------------------------
// function factorial(f){
//     var fact=1;
//     for(var i=1;i<=f;i++){
//         fact=fact*i;
//     }
//     return fact;
// }

// console.log(`factorial is ${factorial(5)}`)
//------------------------------------------------------------------------------------------
// var p1="5";
// var p2=5;

// console.log(p1==p2);
// console.log(p1===p2);
// console.log("2"+"30"-"10");

// console.log(eval(eval("2")+eval("20")-eval("10")));
//------------------------------------------------------------------------------------------

// console.log(isNaN("100a"));
// console.log(isNaN("10"))
// console.log(isFinite(10))
//-------------------------------------------------------------------------------------------

var date1= new Date();
// alert(date1.getHours()+":"+date1.getMinutes()+":"+date1.getSeconds());
// alert(date1.getDate()+"-"+date1.getMonth()+"-"+date1.getFullYear());
// console.log(date1.toLocaleDateString());
// console.log(date1.toDateString());
// console.log(date1.toISOString());

//-----------------------------------------------------------------------------------------

// function alarm(){
//     alert("alarm is ringing");

// }
// setTimeout(alarm,4000);

// var clock=function(){
//     console.log(new Date().toLocaleDateString())
// }
// setInterval(clock,2000);
//---------------------------------------------------------------------------------------------

// ar1=new Array(2);
//ar1[0]=32;
//ar1[1]=33;
// for(var i=i;i<ar1.length;i++){
//     console.log(ar1[i]);
// }
// ar2=[11,22,177,12,748,35];
// console.log(ar2)

// for(i in ar2){ // for-In // index
//     console.log(i)
// }

// for(i of ar2){  /// for-Of //values
//     console.log(i)
// }
//-------------------------------------------------------------------------------------

// ar1=[11,47,85,4,6,4,5];
// ar2=[14,74,854,61,31,7];

// ar3=ar1.concat(ar2);

// console.log(ar3);

// var s1= ar1.join(' and ');
// console.log(s1)
// console.log("array1 before pop: "+ar1);
// ar1.pop();// removed ffrom last
// ar1.push(551);// added at last
// console.log("array1 after pop  and push: "+ar1)

// ar1.shift()// removed from first
// ar1.unshift(52)// added at first
// console.log("Array after shift and Unshift: "+ ar1)

// ar3.reverse();
// console.log("Reverse array 3")
// console.log(ar3)

//------------------------------------------------------------------------------------

function addition(){
    var a= document.getElementById('n1').value;
    var b= document.getElementById('n2').value;
    if(a<=0||a==' ')
    alert('no 1 is blank')
    else if(isNaN(a))
    alert('no1 is NAN')
    if(b<=0||b==' ')
    alert('no 2 is blank')
    else if(isNaN(b))
    alert('no2 is NAN')
else
    document.getElementById('result').value=parseFloat(a)+parseFloat(b);
 }
 function substract(){
    var a= document.getElementById('n1').value;
    var b= document.getElementById('n2').value;
    if(a<=0||a==' ')
    alert('no 1 is blank')
    else if(isNaN(a))
    alert('no1 is NAN')
    if(b<=0||b==' ')
    alert('no 2 is blank')
    else if(isNaN(b))
    alert('no2 is NAN')
else
    document.getElementById('result').value=parseFloat(a)-parseFloat(b);
 }

 function multiply(){
    var a= document.getElementById('n1').value;
    var b= document.getElementById('n2').value;
    if(a<=0||a==' ')
    alert('no 1 is blank')
    else if(isNaN(a))
    alert('no1 is NAN')
    if(b<=0||b==' ')
    alert('no 2 is blank')
    else if(isNaN(b))
    alert('no2 is NAN')
else
    document.getElementById('result').value=parseFloat(a)*parseFloat(b);
 }
 function divide(){
    var a= document.getElementById('n1').value;
    var b= document.getElementById('n2').value;
    if(a<=0||a==' ')
    alert('no 1 is blank')
    else if(isNaN(a))
    alert('no1 is NAN')
    if(b<=0||b==' ')
    alert('no 2 is blank')
    else if(isNaN(b))
    alert('no2 is NAN')
else
    document.getElementById('result').value=parseFloat(a)/parseFloat(b);
 }
//-----------------------------------------------------------------------------------

function changeImage(){
    var image=document.getElementById('img1');
    image.src='images/img2.jfif'
}
//-----------------------------------------------------------------------------------

function changeText(){
    var text= document.getElementById('text1');
    text.innerHTML='<h2>Namaste Duniya</h2>';
}
//-----------------------------------------------------------------------------------
var count=0;
function increase(){
    var inc= document.getElementById('id1');
    count=count+1;
    inc.innerHTML='count is: ' +count;
}

function decrease(){
    var inc= document.getElementById('id2');
    count=count-1;
    inc.innerHTML='count is: ' +count;
    
}
//----------------------------------------------------------------------------------------
function clock(){
    var clock= new Date().toLocaleTimeString();
    var t= document.getElementById('id3');
    t.innerHTML=  clock;  
}
setInterval(clock,1000);
//------------------------------------------------------
