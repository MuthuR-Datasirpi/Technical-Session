import 'package:flutter/material.dart';
import 'package:navigation/routes/routes.dart';

class Homepage extends StatefulWidget {
  const Homepage({super.key});

  @override
  State<Homepage> createState() => _HomepageState();
}

class _HomepageState extends State<Homepage> {
  dynamic newname="data is coming";
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Main page"),
        
      ),
      body: Center(child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
          children: [
            ElevatedButton(child: Text("Chnage to second"),onPressed:(){
              Navigator.of(context).pushNamed(Routes.second);
            } ),

            ElevatedButton(child: Text("Chnage to Third"),onPressed:()async{
             var chage=await Navigator.of(context).pushNamed(Routes.third,arguments: {'name':'My name is muthu'});
              setState(() {
                newname=chage;
              });
            } ),
            Text("$newname"),
          ],

        ),)
    );
  }
}