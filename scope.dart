
void main() {

int a=10;
  if(a==10){
  int a=20;
    print(a);
  }
  print(a);
//! lexical closures example 1
	// Definition 1:
	// A closure is a function that has access to the parent scope, even after the scope has closed.

	String message = "Dar is good";

	var showMessage = ()=>
		message = "Dart is awesome";
		print(showMessage());




	// Definition 2:
	// A closure is a function object that has access to variables in its lexical scope,
	// even when the function is used outside of its original scope.

	var talk = () {

		String msg = "Hi";

		var say = () {
			msg = "Hello";
			print(msg);
		};

		return say;
	};

	var speak = talk();

	speak();


  //! lexical closures example 2

var ans=addNumber(5);
print(ans(3));


}
addNumber(int num1){
  addValue(int number){
    return num1+number;
  }
  return addValue;


  
}



