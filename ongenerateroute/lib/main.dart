import 'package:flutter/material.dart';
import 'package:navigation/pages/main_page.dart';
import 'package:navigation/routes/routes.dart';

void main(List<String> args) {
  runApp(Myapp());
}

class Myapp extends StatelessWidget {
  const Myapp({super.key});

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      debugShowCheckedModeBanner: false,
      initialRoute:Routes.homepage,
      onGenerateRoute: Routes.change,
    );
  }
}