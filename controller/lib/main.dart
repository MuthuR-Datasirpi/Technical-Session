



import 'package:flutter/material.dart';

void main(List<String> args) {
  runApp(const Myapp());
}

class Myapp extends StatefulWidget {
  const Myapp({super.key});

  @override
  State<Myapp> createState() => _MyappState();
}
class _MyappState extends State<Myapp> {
  var values=TextEditingController();
  String one='';
  Widget icn=const Icon(Icons.close);

  @override
  void initState() {
    super.initState();
    values.addListener(()=>setState(() {
      
    }));
  }


  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        body: Padding(
          padding: const EdgeInsets.all(30),
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            crossAxisAlignment: CrossAxisAlignment.end,
            children: [
              Expanded(
                child: Center(child: Text(one, style:const TextStyle(fontSize: 30),),),
              ),
              TextFormField(
              
                controller: values,
                decoration: InputDecoration(
                  suffixIcon: values.text.isEmpty?Container(width: 0,):IconButton(onPressed: (){
                    
                    values.clear();
                  }, icon:icn),
                  focusedBorder: const OutlineInputBorder(borderSide: BorderSide(color: Colors.grey)),
                  hintText:"What's on your mind?",
                  border:const OutlineInputBorder(
                    borderSide: BorderSide(color: Colors.grey)
                    
                    
                  )
                ),
              ),
              ElevatedButton(
                
                onPressed: (){
                  setState(() {
                    
                  });
                  one=values.text;
                }, child: const Text("Post",style: TextStyle(fontSize: 20),)),
        
            ],
          ),
        ),
      ),
    );
  }
}