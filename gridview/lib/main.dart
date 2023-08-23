import 'package:flutter/material.dart';
import 'package:flutter_staggered_grid_view/flutter_staggered_grid_view.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        body: MasonryGridView.builder(itemCount: 6
        ,gridDelegate:const SliverSimpleGridDelegateWithFixedCrossAxisCount(crossAxisCount: 2), 
        itemBuilder:(context, index)=>
        Image.asset('lib/images/images${index+1}.jpeg'),
        ),
      ),
    );
  }
}