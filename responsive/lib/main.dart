import 'package:flutter/material.dart';
import 'package:responsive/desktopview.dart';
import 'package:responsive/mobileview.dart';
import 'package:responsive/responsive.dart';
import 'package:responsive/tabletview.dart';


void main(){
  runApp(const ResponsiveApp());
}

class ResponsiveApp extends StatefulWidget {
  const ResponsiveApp({super.key});

  @override
  State<ResponsiveApp> createState() => _ResponsiveAppState();
}

class _ResponsiveAppState extends State<ResponsiveApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme:  ThemeData(
        primarySwatch: Colors.red
      ),
      // here call the responsive ui class
      home: ResponsiveUI(
          mobileView: const MobileView(),
          tabletView: const TabletView(),
          desktopView: const DeskTopView()),


    );
  }
}
