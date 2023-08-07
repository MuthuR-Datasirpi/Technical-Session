import 'package:flutter/material.dart';
import 'chicken_menu.dart';

void main(List<String> args) {
  runApp(Myapp());
}

class Myapp extends StatefulWidget {
  const Myapp({super.key});

  @override
  State<Myapp> createState() => _MyappState();
}

class _MyappState extends State<Myapp> {
  var mario = "https://images7.alphacoders.com/130/1301276.jpg";
  // var c = "10";
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: PreferredSize(
          preferredSize: Size.fromRadius(25),
          //!Appbar
          child: AppBar(
            elevation: 0,
            backgroundColor: Colors.deepOrange[50],
            leadingWidth: 80,
            leading: Container(
                margin: EdgeInsets.only(left: 20),
                width: 20,
                height: 30,
                decoration: BoxDecoration(
                  borderRadius: BorderRadius.circular(20),
                  color: Colors.white,
                ),
                child: IconButton(
                    splashRadius: 0.1,
                    onPressed: () {},
                    icon: Icon(
                      Icons.menu_outlined,
                      color: const Color.fromARGB(255, 2, 2, 2),
                    ))),
            actions: [
              ClipRRect(
                borderRadius: BorderRadius.circular(60),
                child: Container(
                  // margin: EdgeInsets.only(right: 10),
                  width: 60,
                  height: 60,
                  child: Image.network(
                    "https://cdn.vox-cdn.com/thumbor/1sZXN8lR_lQ3qn-kbcwTezoQIMo=/0x0:3273x1604/1400x933/filters:focal(1380x124:1902x646):no_upscale()/cdn.vox-cdn.com/uploads/chorus_image/image/69018101/Mario_test_3.0.0.jpg",
                    fit: BoxFit.cover,
                  ),
                ),
              ),
              SizedBox(
                width: 15,
              ),
            ],
          ),
        ),
        //!  body
        body: Container(
          width: double.infinity,
          height: double.infinity,
          color: Colors.deepOrange[50],
          child: Padding(
            padding: EdgeInsets.all(20),
            child: Column(
              children: [
                //! Row 1------------------------
                Row(
                  children: [
                    Text(
                      "Deliver to",
                      style: TextStyle(
                          color: const Color.fromARGB(255, 17, 17, 17),
                          fontSize: 16,
                          letterSpacing: 0.5,
                          fontWeight: FontWeight.w600),
                    ),
                    SizedBox(
                      width: 7,
                    ),
                    Text("4102 pretty view lane",
                        style: TextStyle(
                            color: Colors.amber[800],
                            fontSize: 16,
                            letterSpacing: 0.5,
                            fontWeight: FontWeight.w600)),
                    //?--------------------------
                    IconButton(
                      splashRadius: 20,
                      icon: Icon(
                        Icons.arrow_drop_down_outlined,
                        size: 30,
                      ),
                      onPressed: () {},
                    ),
                  ],
                ),
                //! Row 2-------------------------------
                SizedBox(
                  height: 10,
                ),
                Row(
                  children: [
                    Text(
                      "Food Delivery",
                      style:
                          TextStyle(fontSize: 30, fontWeight: FontWeight.w700),
                    )
                  ],
                ),
                //! Row 3-------------------------------
                SizedBox(
                  height: 20,
                ),
                Row(
                  children: [
                    Expanded(
                      child: Container(
                        width: 300,
                        height: 70,
                        // color: Colors.lightBlueAccent,
                        child: TextField(
                          style: TextStyle(fontSize: 17, height: 1),
                          decoration: InputDecoration(
                            focusedBorder: OutlineInputBorder(
                                borderSide: BorderSide(color: Colors.white),
                                borderRadius: BorderRadius.circular(20)),
                            enabledBorder: OutlineInputBorder(
                              borderSide: BorderSide(color: Colors.white),
                              borderRadius: BorderRadius.circular(20),
                            ),
                            filled: true,
                            fillColor: Colors.white,
                            contentPadding: EdgeInsets.all(20),
                            hintText: "Find for food or restarunt....",
                            prefixIcon: Padding(
                                padding: EdgeInsets.only(left: 20, right: 10),
                                child: Icon(
                                  Icons.search,
                                  color: Colors.grey[500],
                                )),
                            suffixIcon: Icon(
                              Icons.close,
                              color: Colors.grey[500],
                            ),
                            border: OutlineInputBorder(
                              borderRadius: BorderRadius.circular(20),
                            ),
                          ),
                        ),
                      ),
                    ),
                    SizedBox(
                      width: 25,
                    ),
                    ClipRRect(
                      borderRadius: BorderRadius.circular(12),
                      child: Container(
                        width: 50,
                        height: 54,
                        color: Colors.amber[800],
                        child: IconButton(
                          splashRadius: 2,
                          onPressed: () {},
                          icon: Icon(
                            Icons.tune_outlined,
                            size: 32,
                            color: Colors.white,
                          ),
                        ),
                      ),
                    ),
                  ],
                ),
                //! Row 4 ----------------------------------
                SizedBox(
                  height: 17,
                ),

                SizedBox(
                  width: double.infinity,
                  height: 55,
                  child: ListView.builder(
                    scrollDirection: Axis.horizontal,
                    itemCount: 5,
                    itemBuilder: (context, index) {
                      return Container(
                          width: 200,
                          child: Card(
                            margin: EdgeInsets.only(right: 25),
                            shape: RoundedRectangleBorder(
                                borderRadius: BorderRadius.circular(70)),
                            color: Colors.amber[800],
                            child: ListTile(
                              shape: RoundedRectangleBorder(
                                  borderRadius: BorderRadius.circular(70)),
                              onTap: () {},
                              splashColor: null,
                              leading: CircleAvatar(
                                backgroundImage: NetworkImage(menu_img[index]),
                              ),
                              title: Text(
                                menu[index],
                                style: TextStyle(
                                    color: Colors.white,
                                    fontSize: 16,
                                    fontWeight: FontWeight.w600),
                              ),
                            ),
                          ));
                    },
                  ),
                ),
                //! Row 5 ----------------------------------
                SizedBox(
                  height: 30,
                ),
                Row(
                  mainAxisAlignment: MainAxisAlignment.spaceBetween,
                  children: [
                    Text("Best Restaurants",
                        style: TextStyle(
                            fontSize: 18, fontWeight: FontWeight.bold)),
                    GestureDetector(
                      child: Text("view all",
                          style: TextStyle(
                            fontSize: 14,
                            fontWeight: FontWeight.bold,
                            color: Colors.amber[800],
                          )),
                      onTap: () {
                        setState(() {
                          ;
                        });
                      },
                    ),
                  ],
                ),
                //! Row 6 ----------------------------------
                SizedBox(
                  height: 25,
                ),
                SizedBox(
                  width: double.infinity,
                  height: 410,
                  child: Expanded(
                    
                    child: Row(
                      children: [
                        Stack(
                          // alignment: Alignment.topCenter,
                          children: [
                            ClipRRect(
                              borderRadius: BorderRadius.circular(30),
                              child: Container(
                                width: 280,
                                height: 410,
                                child: Image.network(
                                  "https://www.recipetineats.com/wp-content/uploads/2022/08/Stack-of-cheeseburgers.jpg",
                                  fit: BoxFit.cover,
                                ),
                              ),
                            ),
                            Positioned(
                              top: 30,
                              left: 30,
                              child: Row(
                                crossAxisAlignment:
                                    CrossAxisAlignment.center,
                                children: [
                                  //& star
                                  Container(
                                    decoration: BoxDecoration(
                                        color:
                                            Colors.white.withOpacity(0.4),
                                        borderRadius:
                                            BorderRadius.circular(40)),
                                    width: 110,
                                    height: 40,
                                    child: Row(
                                      children: [
                                        SizedBox(
                                          width: 10,
                                        ),
                                        Text(
                                          "4.5",
                                          style: TextStyle(
                                              fontSize: 14,
                                              color: Colors.white,
                                              fontWeight: FontWeight.w800),
                                        ),
                                        SizedBox(
                                          width: 7,
                                        ),
                                        Icon(
                                          Icons.star,
                                          size: 19,
                                          color: Colors.yellow[800],
                                        ),
                                        SizedBox(
                                          width: 4,
                                        ),
                                        Text("(50+)",
                                            style: TextStyle(
                                                fontSize: 14,
                                                color: Colors.white,
                                                fontWeight:
                                                    FontWeight.w800))
                                      ],
                                    ),
                                  ),
                                  //& heart
                                  Container(
                                    width: 50,
                                    height: 50,
                                    margin: EdgeInsets.only(left: 50),
                                    decoration: BoxDecoration(
                                        color: Colors.white,
                                        borderRadius:
                                            BorderRadius.circular(40)),
                                    child: IconButton(
                                      onPressed: () {},
                                      color: Colors.white,
                                      icon: Icon(
                                        Icons.heart_broken,
                                        size: 32,
                                        color: Colors.amber[800],
                                      ),
                                    ),
                                  ),
                                ],
                              ),
                            ),
                            //& fast food
                            Positioned(
                              left: 30,
                              top: 190,
                              child: Row(
                                crossAxisAlignment:
                                    CrossAxisAlignment.center,
                                children: [
                                  Container(
                                    width: 75,
                                    height: 30,
                                    child: Center(
                                        child: Text(
                                      "AMIRICAN",
                                      style: TextStyle(
                                          fontSize: 11,
                                          color: Colors.white,
                                          fontWeight: FontWeight.w700),
                                    )),
                                    decoration: BoxDecoration(
                                        color:
                                            Colors.white.withOpacity(0.4),
                                        borderRadius:
                                            BorderRadius.circular(8)),
                                    margin: EdgeInsets.only(right: 13),
                                  ),
                                  Container(
                                    width: 75,
                                    height: 30,
                                    child: Center(
                                      child: Text("FAST FOOD",
                                          style: TextStyle(
                                              fontSize: 11,
                                              color: Colors.white,
                                              fontWeight: FontWeight.w700)),
                                    ),
                                    decoration: BoxDecoration(
                                        color:
                                            Colors.white.withOpacity(0.4),
                                        borderRadius:
                                            BorderRadius.circular(8)),
                                  ),
                                ],
                              ),
                            ),
                            //& Burger King
                            Positioned(
                              left: 30,
                              top: 240,
                              child: Row(
                                children: [
                                  Container(
                                    child: Text("Burger King",
                                        style: TextStyle(
                                            fontSize: 38,
                                            color: Colors.white,
                                            fontWeight: FontWeight.w700)),
                                    width: 230,
                                    height: 50,
                                    // color: Color.fromARGB(255, 219, 69, 15),
                                  ),
                                ],
                              ),
                            ),
                            //& Friends were here
                            Positioned(
                              left: 30,
                              top: 310,
                              child: Row(
                                children: [
                                  Container(
                                    width: 230,
                                    height: 20,
                                    child: Text("Friends were here",
                                        style: TextStyle(
                                            fontSize: 15,
                                            color: Colors.white,
                                            fontWeight: FontWeight.w700)),
                                    // color: Color.fromARGB(255, 15, 219, 76),
                                  ),
                                ],
                              ),
                            ),
                            //&  Image
                            Positioned(
                              left: 30,
                              top: 340,
                              child: Row(
                                children: [
                                  CircleAvatar(
                                    backgroundImage: NetworkImage(
                                        "https://media.istockphoto.com/id/1214292669/photo/beautiful-transsexual-transgender-woman-wearing-t-shirt-over-isolated-red-background-smiling.webp?b=1&s=170667a&w=0&k=20&c=ry5k7ZYVXSB8CU9B9sO58sCkBEnL2CHEmU1EePJRTLM="),
                                  ),
                                  SizedBox(
                                    width: 8,
                                  ),
                                  CircleAvatar(
                                    backgroundImage: NetworkImage(
                                        "https://media.istockphoto.com/id/1167736976/photo/portrait-of-joyful-young-woman-with-afro-hair.jpg?s=612x612&w=0&k=20&c=BMvp-729XOwacxU5gPh2b73k-gGX6iSbilQ18g2u5yU="),
                                  ),
                                  SizedBox(
                                    width: 8,
                                  ),
                                  CircleAvatar(
                                    backgroundImage: NetworkImage(
                                      "https://thumbnails.production.thenounproject.com/DPYmlbTKG__hknO1OY39sX3S8JQ=/fit-in/1000x1000/photos.production.thenounproject.com/photos/260EA975-3A04-4C42-A019-248FA733363F.jpg",
                                    ),
                                  ),
                                  SizedBox(
                                    width: 8,
                                  ),
                                  CircleAvatar(
                                    backgroundColor: Colors.grey[700],
                                    child: Text(
                                      "15+",
                                      style: TextStyle(
                                        fontSize: 14,
                                        fontWeight: FontWeight.w600,
                                        color: Colors.white,
                                      ),
                                    ),
                                  ),
                                  SizedBox(
                                    width: 8,
                                  ),
                                ],
                              ),
                            ),
                          ],
                        ),
                      ],
                    ),
                  ),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}