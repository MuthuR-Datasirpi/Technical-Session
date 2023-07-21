void main(){

//int, double
int r = 5;  
double pi = 3.14;  
double res = 4*pi*r*r;    
print("The area of sphere = ${(res)}");  


//Round Double Value To 2 Decimal Places 
double prize = 1130.2232323233233; 
print(prize.toStringAsFixed(2));



//String
String schoolName = "Diamond School";
String address = "New York 2140";   

print("School name is $schoolName and address is $address"); 

//boolean
bool isMarried = true;
print("Married Status: $isMarried");


//list
//!List 1st method
List<String> names = ["Raj", "John", "Max"];
print("Value of names is $names");
print("Value of names[0] is ${names[0]}"); 
print("Value of names[1] is ${names[1]}"); 
print("Value of names[2] is ${names[2]}"); 

//!List 2nd method

var a=List.filled(0, 0);//~tried to add value without grow we cannot add
// a.add(10); we cannot add because length is 0 , non growable 
print(a);

//or
var grow=List.filled(0, 0,growable: true);
grow.add(10);
print(grow);

//~ passing sting in fill //?if we pass String need to pass string only after  
var use=List.filled(5," " );
print(use);

var use2=List.filled(5," ",growable:true );
//use2.add(10) not possible to add because we enter fill="" so it excepting all value must be string
use2.add("muthu");
print(use2);

//~Trying to add value without growable
var use1=List.filled(5,0,growable: true );
use1.add(10);
print(use1);


//map
Map<String, String> myDetails = {
  'name': 'John Doe',
  'address': 'USA',
'fathername': 'Soe Doe'
};

print(myDetails['name']);


//sets
Set<String> weekday = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
print(weekday);


//runes //~emoji
var heart = '\u2665';  
  var theta = '\u{1f600}';  
  print(heart);  
  print(theta);  







}

