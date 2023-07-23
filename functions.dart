main() {

  print(add(10, 20));

  print(sum(10, 210));

//! (1.)
int personAge = 17;
  if (personAge >= voterAge()) {
    print("You can vote.");
  } else {
    print("Sorry, you can't vote.");
  }
//! (2.)
  var total = plus(2, 3);
  print("Total sum: $total");
  mul(2, 3);
  var greeting = greet();
  print("Greeting: $greeting");
  greetings();

//! (3.)
  // passing values in wrong order
  printInfo("Male", "John");

  // passing values in correct order
  printInfo("John", "Male");

//! (4.)
  printInf("John", "Male");
  printInf("John", "Male", "Mr.");
  printInf("Kavya", "Female", "Ms.");

//! (5.)
// you can pass values in any order in named parameters.
  printIno(gender: "Male", name: "John");
  printIno(name: "Sita", gender: "Female");
  printIno(name: "Reecha", gender: "Female");
  printIno(name: "Reecha", gender: "Female");
  printIno(name: "Harry", gender: "Male");
  printIno(gender: "Male", name: "Santa");


double principal = 5000;
  double time = 3;
  double rate = 3;
  double result = calculateInterest(principal, rate, time);
  print("The simple interest is $result.");

double principa = 5000;
  double tim = 3;
  double rat = 3;
  double resul = calculateInteres(principa, rat, tim);
  print("The simple interest is $resul.");

}
//!Functions part
//!Arrow function without using Fat arrow notation
var add = (num1, num2) {
    return (num1 + num2);
  }; 

//!Arrow function using Fat arrow notation
var sum = (num1, num2)=>(num1 + num2);

//!  1.
int voterAge() {
  return 18;
}

//! parameter and return type  (2.)
int plus(int a, int b) {
  var total;
  total = a + b;
  return total;
}

//! parameter and no return type
void mul(int a, int b) {
  var total;
  total = a * b;
  print("Multiplication is : $total");
}

//! no parameter and return type
String greet() {
  String greet = "Welcome";
  return greet;
}

//! no parameter and no return type
void greetings() {
  print("Hello World!!!");
}
//!  Positional Parameter (3.)
  void printInfo(String name, String gender) {
  print("Hello $name your gender is $gender.");
}

//! optional parameter  (4.)
void printInf(String name, String gender, [String title = "sir/ma'am"]) {
  print("Hello $title $name your gender is $gender.");
}

//!named parameter (5.)
void printIno({String? name, String? gender}) {
  print("Hello $name your gender is $gender.");
}

//!Arrow function
//!Without Arrow Function
double calculateInterest(double principal, double rate, double time) {
  double interest = principal * rate * time / 100;
  return interest;
}

//!With Arrow Function
double calculateInteres(double principa, double rat, double tim) =>
    principa * rat * tim / 100;