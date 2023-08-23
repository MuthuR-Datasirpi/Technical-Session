import 'package:flutter/material.dart';
import 'package:navigation/pages/Third_page.dart';
import 'package:navigation/pages/main_page.dart';
import 'package:navigation/pages/second_page.dart';


// class RouteGenerater {
//   static const ROUTE_HOME = "/";
//   static const ROUTE_DUMMY = "/intermediate";
//   static const ROUTE_NESTED = "/intermediate/nested_state";

//   static Route<dynamic> generateRoute(RouteSettings settings) {
//     switch (settings.name) {
//       case ROUTE_HOME:
//         final page = HomePage();
//         return MaterialPageRoute(builder: (context) => page);
//       case ROUTE_DUMMY:
//         final page = DummyPage();
//         return MaterialPageRoute(builder: (context) => page);
//       case ROUTE_NESTED:
//         final page = NestedState();
//         return MaterialPageRoute(builder: (context) => page);

//       default:
//         return MaterialPageRoute(builder: (context) => HomePage());
//     }
//   }
// }


class Routes{
  static const homepage='/';
  static const second='/secondpage';
  static const third='/thirdpage';

  static Route<dynamic> change(RouteSettings settings){
    var newvalue;
    if(settings.arguments!=null){
      newvalue=settings.arguments as Map<String,String>;
    }

    switch(settings.name){
      case homepage:
      return MaterialPageRoute(builder:(context) => Homepage(),);
      case second:
      return MaterialPageRoute(builder:(context) => Secondpage(),);
      case third:
      return MaterialPageRoute(builder:(context) => Thirdpage(name: newvalue['name'],),);
      default:
      throw FormatException('check ur proper routes');
    }
  }

}