import 'package:flutter/material.dart';

class Secondpage extends StatefulWidget {
  const Secondpage({super.key});

  @override
  State<Secondpage> createState() => _SecondpageState();
}

class _SecondpageState extends State<Secondpage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        automaticallyImplyLeading: false,
        title: const Text("second page"),
      ),
      body: Center(child: ElevatedButton(onPressed: (){
        Navigator.of(context).pop();
      }, child: Text("Go back to mainpage")),),
    );
  }
}