import 'dart:io';



void createOrderMessage() async {
  var order =  fetchUserOrder();
  print('Your order is: $order') ;
  print("when");
  
}

Future<String> fetchUserOrder() async  =>
    // Imagine that this function is more complex and slow.
 /* await*/  
        await  Future.delayed(
      const Duration(seconds: 2),
      () => 'Large Latte',
    );

void main() {
  createOrderMessage();
}


// void main(){
//   print("Enter car brand");
//   var a=stdin.readLineSync();
//   var b=stdin.readLineSync();
//   print(a);


// }

// void main(){

// Hello();
// }

// Future hii() async{
//   print("Muthu");
// }

// void Hello() async   {
//     await hii();
//   print("raj");
// }





// Future<void> fetchUserOrder() {
//   // Imagine that this function is fetching user info from another service or database.
//   return Future.delayed(const Duration(seconds: 2), () => print('Large Latte'));
// }

// void main() {
//   fetchUserOrder();
//   print('Fetching user order...');
// }