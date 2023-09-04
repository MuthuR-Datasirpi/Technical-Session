import 'package:flutter/material.dart';

void main(){
  runApp(const DrawerTutorial());
}

class DrawerTutorial extends StatefulWidget {
  const DrawerTutorial({super.key});

  @override
  State<DrawerTutorial> createState() => _DrawerTutorialState();
}

class _DrawerTutorialState extends State<DrawerTutorial> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        backgroundColor: Colors.grey[300],
        appBar: AppBar(
          centerTitle: true,
          backgroundColor: Colors.black54,
          title: const Text('Flutter Smashers', style: TextStyle(color: Colors.white, fontSize: 30,
          fontWeight: FontWeight.w500
          ),),
        ),

        drawer: Drawer(
          backgroundColor: Colors.grey[300],
          child: Column(
            children: [
              const SizedBox(height: 40,),
              Container(
                height: 70,
                width: 70,
                decoration: BoxDecoration(
                  color: Colors.grey,
                  borderRadius: BorderRadius.circular(50),
                ),
                child: const Icon(Icons.person, color: Colors.white, size: 45,),
              ),
              const SizedBox(height: 30,),
              
              const ListTile(
                leading: Icon(Icons.home),
                title: Text('H O M E', style: TextStyle(fontSize: 16),),
              ),

              const ListTile(
                leading: Icon(Icons.search),
                title: Text('S E A R C H', style: TextStyle(fontSize: 16),),
              ),

              const ListTile(
                leading: Icon(Icons.settings),
                title: Text('S E T T I N G S', style: TextStyle(fontSize: 16),),
              ),

              const ListTile(
                leading: Icon(Icons.logout),
                title: Text('L O G O U T', style: TextStyle(fontSize: 16),),
              ),

            ],
          ),
        ),
      ),
    );
  }
}