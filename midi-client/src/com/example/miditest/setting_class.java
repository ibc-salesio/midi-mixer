package com.example.miditest;

public class setting_class {
    double[] dblevel={	-138.00,-138.00,-135.00,-132.00,-129.00,-126.00,-123.00,-120.00,-117.00,-114.00,-111.00,
    		-108.00,-105.00,-102.00,-99.00,-96.00,-95.00,-94.00,-93.00,-92.00,-91.00,-90.00,-89.00,-88.00,
    		-87.00,-86.00,-85.00,-84.00,-83.00,-82.00,-81.00,-80.00,-79.00,-78.00,-77.80,-77.60,-77.40,
    		-77.20,-77.00,-76.80,-76.60,-76.40,-76.20,-76.00,-75.80,-75.60,-75.40,-75.20,-75.00,-74.80,
    		-74.60,-74.40,-74.20,-74.00,-73.80,-73.60,-73.40,-73.20,-73.00,-72.80,-72.60,-72.40,-72.20,
    		-72.00,-71.80,-71.60,-71.40,-71.20,-71.00,-70.80,-70.60,-70.40,-70.20,-70.00,-69.80,-69.60,
    		-69.40,-69.20,-69.00,-68.80,-68.60,-68.40,-68.20,-68.00,-67.80,-67.60,-67.40,-67.20,-67.00,
    		-66.80,-66.60,-66.40,-66.20,-66.00,-65.80,-65.60,-65.40,-65.20,-65.00,-64.80,-64.60,-64.40,
    		-64.20,-64.00,-63.80,-63.60,-63.40,-63.20,-63.00,-62.80,-62.60,-62.40,-62.20,-62.00,-61.80,
    		-61.60,-61.40,-61.20,-61.00,-60.80,-60.60,-60.40,-60.20,-60.00,-59.80,-59.60,-59.40,-59.20,
    		-59.00,-58.80,-58.60,-58.40,-58.20,-58.00,-57.80,-57.60,-57.40,-57.20,-57.00,-56.80,-56.60,
    		-56.40,-56.20,-56.00,-55.80,-55.60,-55.40,-55.20,-55.00,-54.80,-54.60,-54.40,-54.20,-54.00,
    		-53.80,-53.60,-53.40,-53.20,-53.00,-52.80,-52.60,-52.40,-52.20,-52.00,-51.80,-51.60,-51.40,
    		-51.20,-51.00,-50.80,-50.60,-50.40,-50.20,-50.00,-49.80,-49.60,-49.40,-49.20,-49.00,-48.80,
    		-48.60,-48.40,-48.20,-48.00,-47.80,-47.60,-47.40,-47.20,-47.00,-46.80,-46.60,-46.40,-46.20,
    		-46.00,-45.80,-45.60,-45.40,-45.20,-45.00,-44.80,-44.60,-44.40,-44.20,-44.00,-43.80,-43.60,
    		-43.40,-43.20,-43.00,-42.80,-42.60,-42.40,-42.20,-42.00,-41.80,-41.60,-41.40,-41.20,-41.00,
    		-40.80,-40.60,-40.40,-40.20,-40.00,-39.90,-39.80,-39.70,-39.60,-39.50,-39.40,-39.30,-39.20,
    		-39.10,-39.00,-38.90,-38.80,-38.70,-38.60,-38.50,-38.40,-38.30,-38.20,-38.10,-38.00,-37.90,
    		-37.80,-37.70,-37.60,-37.50,-37.40,-37.30,-37.20,-37.10,-37.00,-36.90,-36.80,-36.70,-36.60,
    		-36.50,-36.40,-36.30,-36.20,-36.10,-36.00,-35.90,-35.80,-35.70,-35.60,-35.50,-35.40,-35.30,
    		-35.20,-35.10,-35.00,-34.90,-34.80,-34.70,-34.60,-34.50,-34.40,-34.30,-34.20,-34.10,-34.00,
    		-33.90,-33.80,-33.70,-33.60,-33.50,-33.40,-33.30,-33.20,-33.10,-33.00,-32.90,-32.80,-32.70,
    		-32.60,-32.50,-32.40,-32.30,-32.20,-32.10,-32.00,-31.90,-31.80,-31.70,-31.60,-31.50,-31.40,
    		-31.30,-31.20,-31.10,-31.00,-30.90,-30.80,-30.70,-30.60,-30.50,-30.40,-30.30,-30.20,-30.10,
    		-30.00,-29.90,-29.80,-29.70,-29.60,-29.50,-29.40,-29.30,-29.20,-29.10,-29.00,-28.90,-28.80,
    		-28.70,-28.60,-28.50,-28.40,-28.30,-28.20,-28.10,-28.00,-27.90,-27.80,-27.70,-27.60,-27.50,
    		-27.40,-27.30,-27.20,-27.10,-27.00,-26.90,-26.80,-26.70,-26.60,-26.50,-26.40,-26.30,-26.20,
    		-26.10,-26.00,-25.90,-25.80,-25.70,-25.60,-25.50,-25.40,-25.30,-25.20,-25.10,-25.00,-24.90,
    		-24.80,-24.70,-24.60,-24.50,-24.40,-24.30,-24.20,-24.10,-24.00,-23.90,-23.80,-23.70,-23.60,
    		-23.50,-23.40,-23.30,-23.20,-23.10,-23.00,-22.90,-22.80,-22.70,-22.60,-22.50,-22.40,-22.30,
    		-22.20,-22.10,-22.00,-21.90,-21.80,-21.70,-21.60,-21.50,-21.40,-21.30,-21.20,-21.10,-21.00,
    		-20.90,-20.80,-20.70,-20.60,-20.50,-20.40,-20.30,-20.20,-20.10,-20.00,-19.95,-19.90,-19.85,
    		-19.80,-19.75,-19.70,-19.65,-19.60,-19.55,-19.50,-19.45,-19.40,-19.35,-19.30,-19.25,-19.20,
    		-19.15,-19.10,-19.05,-19.00,-18.95,-18.90,-18.85,-18.80,-18.75,-18.70,-18.65,-18.60,-18.55,
    		-18.50,-18.45,-18.40,-18.35,-18.30,-18.25,-18.20,-18.15,-18.10,-18.05,-18.00,-17.95,-17.90,
    		-17.85,-17.80,-17.75,-17.70,-17.65,-17.60,-17.55,-17.50,-17.45,-17.40,-17.35,-17.30,-17.25,
    		-17.20,-17.15,-17.10,-17.05,-17.00,-16.95,-16.90,-16.85,-16.80,-16.75,-16.70,-16.65,-16.60,
    		-16.55,-16.50,-16.45,-16.40,-16.35,-16.30,-16.25,-16.20,-16.15,-16.10,-16.05,-16.00,-15.95,
    		-15.90,-15.85,-15.80,-15.75,-15.70,-15.65,-15.60,-15.55,-15.50,-15.45,-15.40,-15.35,-15.30,
    		-15.25,-15.20,-15.15,-15.10,-15.05,-15.00,-14.95,-14.90,-14.85,-14.80,-14.75,-14.70,-14.65,
    		-14.60,-14.55,-14.50,-14.45,-14.40,-14.35,-14.30,-14.25,-14.20,-14.15,-14.10,-14.05,-14.00,
    		-13.95,-13.90,-13.85,-13.80,-13.75,-13.70,-13.65,-13.60,-13.55,-13.50,-13.45,-13.40,-13.35,
    		-13.30,-13.25,-13.20,-13.15,-13.10,-13.05,-13.00,-12.95,-12.90,-12.85,-12.80,-12.75,-12.70,
    		-12.65,-12.60,-12.55,-12.50,-12.45,-12.40,-12.35,-12.30,-12.25,-12.20,-12.15,-12.10,-12.05,
    		-12.00,-11.95,-11.90,-11.85,-11.80,-11.75,-11.70,-11.65,-11.60,-11.55,-11.50,-11.45,-11.40,
    		-11.35,-11.30,-11.25,-11.20,-11.15,-11.10,-11.05,-11.00,-10.95,-10.90,-10.85,-10.80,-10.75,
    		-10.70,-10.65,-10.60,-10.55,-10.50,-10.45,-10.40,-10.35,-10.30,-10.25,-10.20,-10.15,-10.10,
    		-10.05,-10.00,-9.95,-9.90,-9.85,-9.80,-9.75,-9.70,-9.65,-9.60,-9.55,-9.50,-9.45,-9.40,-9.35,
    		-9.30,-9.25,-9.20,-9.15,-9.10,-9.05,-9.00,-8.95,-8.90,-8.85,-8.80,-8.75,-8.70,-8.65,-8.60,
    		-8.55,-8.50,-8.45,-8.40,-8.35,-8.30,-8.25,-8.20,-8.15,-8.10,-8.05,-8.00,-7.95,-7.90,-7.85,
    		-7.80,-7.75,-7.70,-7.65,-7.60,-7.55,-7.50,-7.45,-7.40,-7.35,-7.30,-7.25,-7.20,-7.15,-7.10,
    		-7.05,-7.00,-6.95,-6.90,-6.85,-6.80,-6.75,-6.70,-6.65,-6.60,-6.55,-6.50,-6.45,-6.40,-6.35,
    		-6.30,-6.25,-6.20,-6.15,-6.10,-6.05,-6.00,-5.95,-5.90,-5.85,-5.80,-5.75,-5.70,-5.65,-5.60,
    		-5.55,-5.50,-5.45,-5.40,-5.35,-5.30,-5.25,-5.20,-5.15,-5.10,-5.05,-5.00,-4.95,-4.90,-4.85,
    		-4.80,-4.75,-4.70,-4.65,-4.60,-4.55,-4.50,-4.45,-4.40,-4.35,-4.30,-4.25,-4.20,-4.15,-4.10,
    		-4.05,-4.00,-3.95,-3.90,-3.85,-3.80,-3.75,-3.70,-3.65,-3.60,-3.55,-3.50,-3.45,-3.40,-3.35,
    		-3.30,-3.25,-3.20,-3.15,-3.10,-3.05,-3.00,-2.95,-2.90,-2.85,-2.80,-2.75,-2.70,-2.65,-2.60,
    		-2.55,-2.50,-2.45,-2.40,-2.35,-2.30,-2.25,-2.20,-2.15,-2.10,-2.05,-2.00,-1.95,-1.90,-1.85,
    		-1.80,-1.75,-1.70,-1.65,-1.60,-1.55,-1.50,-1.45,-1.40,-1.35,-1.30,-1.25,-1.20,-1.15,-1.10,
    		-1.05,-1.00,-0.95,-0.90,-0.85,-0.80,-0.75,-0.70,-0.65,-0.60,-0.55,-0.50,-0.45,-0.40,-0.35,
    		-0.30,-0.25,-0.20,-0.15,-0.10,-0.05,0.00,0.05,0.10,0.15,0.20,0.25,0.30,0.35,0.40,0.45,0.50,
    		0.55,0.60,0.65,0.70,0.75,0.80,0.85,0.90,0.95,1.00,1.05,1.10,1.15,1.20,1.25,1.30,1.35,1.40,
    		1.45,1.50,1.55,1.60,1.65,1.70,1.75,1.80,1.85,1.90,1.95,2.00,2.05,2.10,2.15,2.20,2.25,2.30,
    		2.35,2.40,2.45,2.50,2.55,2.60,2.65,2.70,2.75,2.80,2.85,2.90,2.95,3.00,3.05,3.10,3.15,3.20,
    		3.25,3.30,3.35,3.40,3.45,3.50,3.55,3.60,3.65,3.70,3.75,3.80,3.85,3.90,3.95,4.00,4.05,4.10,
    		4.15,4.20,4.25,4.30,4.35,4.40,4.45,4.50,4.55,4.60,4.65,4.70,4.75,4.80,4.85,4.90,4.95,5.00,
    		5.05,5.10,5.15,5.20,5.25,5.30,5.35,5.40,5.45,5.50,5.55,5.60,5.65,5.70,5.75,5.80,5.85,5.90,
    		5.95,6.00,6.05,6.10,6.15,6.20,6.25,6.30,6.35,6.40,6.45,6.50,6.55,6.60,6.65,6.70,6.75,6.80,
    		6.85,6.90,6.95,7.00,7.05,7.10,7.15,7.20,7.25,7.30,7.35,7.40,7.45,7.50,7.55,7.60,7.65,7.70,
    		7.75,7.80,7.85,7.90,7.95,8.00,8.05,8.10,8.15,8.20,8.25,8.30,8.35,8.40,8.45,8.50,8.55,8.60,
    		8.65,8.70,8.75,8.80,8.85,8.90,8.95,9.00,9.05,9.10,9.15,9.20,9.25,9.30,9.35,9.40,9.45,9.50,
    		9.55,9.60,9.65,9.70,9.75,9.80,9.85,9.90,9.95,10.00};



    int solo_c[]=new int[16];
    int on_c[]=new int[16];
    int vol_db[]=new int[16];
    int ch_set=0;


    int aon_c[]=new int[16];
    int avol_db[]=new int[16];
    int ach_set=0;

    
    

}