// ignore_for_file: public_member_api_docs, sort_constructors_first
import 'package:flutter/material.dart';

class Thirdpage extends StatefulWidget {

  Thirdpage({
    Key? key,
    required this.name,
  }) : super(key: key);
  final String name;

  @override
  State<Thirdpage> createState() => _ThirdpageState();
}

class _ThirdpageState extends State<Thirdpage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        automaticallyImplyLeading: false,
        title: const Text("Third page"),
      ),
      body: Center(child: ElevatedButton(onPressed: (){

        Navigator.pop(context, "I am from the third page data");
      }, child: Text("${widget.name}")),),
    );
  }
}