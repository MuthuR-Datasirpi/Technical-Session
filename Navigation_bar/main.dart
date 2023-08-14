import 'package:flutter/material.dart';
import 'package:sample/Home.dart';

import 'Search.dart';
import 'Setting.dart';

void main(List<String> args) {
  runApp(Homescreen());
}

class Homescreen extends StatefulWidget {
  const Homescreen({super.key});

  @override
  State<Homescreen> createState() => _HomescreenState();
}

class _HomescreenState extends State<Homescreen> {
  int shift=0;
  List<Widget> nav=[float(),Search(),Setting()];
void change(int index){
  setState(() {
   
  });
   shift=index;
   
}

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        body:IndexedStack(
          index: shift,
          children: nav,
        ) ,
      bottomNavigationBar: BottomNavigationBar(
        mouseCursor: SystemMouseCursors.grab,
        currentIndex:shift,
        onTap: change,
        elevation: 78,
        showUnselectedLabels: false,
        backgroundColor: Colors.black12,
        showSelectedLabels: false,
        
        items: [
          BottomNavigationBarItem(icon: Icon(Icons.home),label: "Home"),
          BottomNavigationBarItem(icon: Icon(Icons.search),label: "Home"),
          BottomNavigationBarItem(icon: Icon(Icons.settings),label: "Home"),
          ]),
          
      ),
    );
    
  }
}