import 'package:flutter/material.dart';

class float extends StatefulWidget {
  const float({super.key});

  @override
  State<float> createState() => _floatState();
}

class _floatState extends State<float> {
  int count=0;
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        body: Center(child: Text("${count}"),),
        floatingActionButton: FloatingActionButton(
          
        onPressed: (){
          setState(() {
            
          });
          count++;
        },
        child: Icon(Icons.add),
        ),
      ),
    );
  }
}