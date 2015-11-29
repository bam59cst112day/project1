///Project 1
 ///By : Ana Collantes
 
 //BAM:  Project #1 is OK.
 
 float circleX;
 float circleY;
 float rectX;
 float rectY;
 float DY;
 float DX;
 float monsterX;
 float monsterY;
 int score;
 float goldX;
 float goldY;
 float buttonX;
 float buttonY;
 void setup() {
   score=0;
   size(900,700);
 reset();
   
 }
 void draw() {
   scene();
   trees();
   hero ();
   monster();
   gold();
   button();
   
 }
 void scene() {
    ///sky
   fill(144, 220, 229);
   rect(0, 1, 899, 220);
   ///ground
   fill(42, 124, 51);
   rect(0, 222, 899, 477);
   ///house (bottom part)
   fill(240, 132, 102);
   rect(740, 131, 150, 90);
   
  ///house (windows)
  fill(144, 220, 229);
  rect(779,  147, 70, 30);
  //line
  
  ///1st floor windows
  fill(144, 220, 229);
  rect(765, 189, 20, 20);
  
  fill(144, 220, 229);
  rect(803, 189, 20, 20);
  
  fill(144, 220, 229);
  rect(840, 189, 20, 20);
  ///3 line
  
  ///pathway through the woods from house(vertical)
  fill(77, 51, 44);
  rect(710, 223, 50, 475);
  
  ///horizontal close to house
  fill(77, 51, 44);
  rect(710, 280, 325, 50);
  
  ///middle (horizontal)
  fill(77, 51, 44);
  rect(1, 410, 709, 50);
  
  ///from middle (horizontal)down far right first
  fill(77, 51, 44);
  rect(530, 460, 50, 238);
  
  ///from middle (horizontal)down from right second
  fill(77, 51, 44);
  rect(400, 460, 50, 238);
  
  ///from middle(horizontal)down from right third
  fill(77, 51, 44);
  rect(270, 460, 50, 238);
  
  ///from middle (horizontal)down from right fourth
  fill(77, 51, 44);
  rect(140, 460, 50, 238);
  
  ///from middle (horizontal)down from right fifth
  fill(77, 51, 44);
  rect(20, 460, 50, 238);
  
  ///from middle (horizontal)up from right first
  fill(77, 51, 44);
  rect(463, 223, 50, 187);
  
  ///from middle(horizontal)up from right second
  fill(77, 51, 44);
  rect(209, 223, 50, 187);
  
  ///from middle (horizontal)up from right third
  fill(77, 51, 44);
  rect(1, 223, 5, 187);
 }
  void trees() {
  
  ///1st tree
  fill(46, 31, 27);
  rect(790, 380, 9, 20);
  fill(6, 52, 11);
  ellipse(795, 370, 25, 25);
  
 ///2nd
 fill(46, 31, 27);
 rect(870, 380, 9, 20);
 fill(6, 52, 11);
 ellipse(875, 370, 25, 25);
 ///third
 fill(46, 31, 27);
 rect(830, 440, 9, 20);
 fill(6, 52, 11);
 ellipse(835, 430, 25, 25);
 ///fourth
 fill(46, 31, 27);
 rect(790, 510, 9, 20);
 fill(6, 52, 11);
 ellipse(795, 500, 25, 25);
 ///fifth
 fill(46, 31, 27);
 rect(870, 510, 9, 20);
 fill(6, 52, 11);
 ellipse(875, 500, 25, 25);
 ///sixth
 fill(46, 31, 27);
 rect(830, 570, 9, 20);
 fill(6, 52, 11);
 ellipse(835, 560, 25, 25);
 ///seventh
 fill(46, 31, 27);
 rect(790, 630, 9, 20);
 fill(6, 52, 11);
 ellipse(795, 620, 25, 25);
 ///eigth
 fill(46, 31, 27);
 rect(870, 630, 9, 20);
 fill(6, 52, 11);
 ellipse(875, 620, 25, 25);
 ///nine
 fill(46, 31, 27);
 rect(670, 250, 9, 20);
 fill(6, 52, 11);
 ellipse(675, 240, 25, 25);
 ///ten
 fill(46, 31, 27);
 rect(606, 250, 9, 20);
 fill(6, 52, 11);
 ellipse(611, 240, 25, 25);
 ///eleven
 fill(46, 31, 27);
 rect(540, 250, 9, 20);
 fill(6, 52, 11);
 ellipse(545, 240, 25, 25);
 ///twelve
 fill(46, 31, 27);
 rect(640, 310, 9, 20);
 fill(6, 52, 11);
 ellipse(645, 300, 25, 25);
 ///thirteen
 fill(46, 31, 27);
 rect(570, 310, 9, 20);
 fill(6, 52, 11);
 ellipse(575, 300, 25, 25);
 ///fourteen
 fill(46, 31, 27);
 rect(670, 370, 9, 20);
 fill(6, 52, 11);
 ellipse(675, 360, 25, 25);
 ///fifteen
 fill(46, 31, 27);
 rect(606, 370, 9, 20);
 fill(6, 52, 11);
 ellipse(611, 360, 25, 25);
 ///sixteen
 fill(46, 31, 27);
 rect( 540, 370, 9, 20);
 fill(6, 52, 11);
 ellipse( 545, 360, 25, 25);
 ///seventeen
 fill(46, 31, 27);
 rect(670, 510, 9, 20);
 fill(6, 52, 11);
 ellipse(675, 500, 25, 25);
 ///eigthteen
 fill(46, 31, 27);
 rect(608, 510, 9, 20);
 fill(6, 52, 11);
 ellipse(613, 500, 25, 25);
 ///nineteen
 fill(46, 31, 27);
 rect(640, 570, 9, 20);
 fill(6, 52, 11);
 ellipse(645, 560, 25, 25);
 ///twenty
 fill(46, 31, 27);
 rect(608, 630, 9, 20);
 fill(6, 52, 11);
 ellipse(613, 620, 25, 25);
 ///twenty-one
 fill(46, 31, 27);
 rect(670, 630, 9, 20);
 fill(6, 52, 11);
 ellipse(675, 620, 25, 25);
 ///twenty-two
 fill(46, 31, 27);
 rect(485, 505, 9, 20);
 fill(6, 52, 11);
 ellipse(490, 495, 25, 25);
 ///twenty-three
 fill(46, 31, 27);
 rect(485, 570, 9, 20);
 fill(6, 52, 11);
 ellipse(490, 560, 25, 25);
 ///twenty-four
 fill(46, 31, 27);
 rect(485, 640, 9, 20);
 fill(6, 52, 11);
 ellipse(490, 630, 25, 25);
 ///twenty-five
 fill(46, 31, 27);
 rect(355, 505, 9, 20);
 fill(6, 52, 11);
 ellipse(360, 495, 25, 25);
 ///twenty-six
 fill(46, 31, 27);
 rect(355, 570, 9, 20);
 fill(6, 52, 11);
 ellipse(360, 560, 25, 25);
 ///twenty-seven
 fill(46, 31, 27);
 rect(355, 640, 9, 20);
 fill(6, 52, 11);
 ellipse(360, 630, 25, 25);
 ///twenty-eight
 fill(46, 31, 27);
 rect(225, 505, 9, 20);
 fill(6, 52, 11);
 ellipse(230, 495, 25, 25);
 ///twenty-nine
 fill(46, 31, 27);
 rect(225, 575, 9, 20);
 fill(6, 52, 11);
 ellipse(230, 565, 25, 25);
 ///thirty
 fill(46, 31, 27);
 rect(225, 640, 9, 20);
 fill(6, 52, 11);
 ellipse(230, 630, 25, 25);
 ///thirty-one
 fill(46, 31, 27);
 rect(100, 505, 9, 20);
 fill(6, 52, 11);
 ellipse(105, 495, 25, 25);
 ///thrity-two
 fill(46, 31, 27);
 rect(100, 575, 9, 20);
 fill(6, 52, 11);
 ellipse(105, 565, 25, 25);
 ///thirty-three
 fill(46, 31, 27);
 rect(100, 640, 9, 20);
 fill(6, 52, 11);
 ellipse(105, 630, 25, 25);
 ///thirty-four
 fill(46, 31, 27);
 rect( 400, 250, 9, 20);
 fill(6, 52, 11);
 ellipse(405, 240, 25, 25);
 ///thirty-five
 fill(46, 31, 27);
 rect(310, 250, 9, 20);
 fill(6, 52, 11);
 ellipse(315, 240, 25, 25);
 ///thirty-six
 fill(46, 31, 27);
 rect(355, 310, 9, 20);
 fill(6, 52, 11);
 ellipse(360, 300, 25, 25);
 ///thirty-seven
 fill(46, 31, 27);
 rect(400, 370, 9, 20);
 fill(6, 52, 11);
 ellipse(405, 360, 25, 25);
 ///thirty-eight
 fill(46, 31, 27);
 rect(310, 370, 9, 20);
 fill(6, 52, 11);
 ellipse(315, 360, 25, 25);
 ///thirty-nine
 fill(46, 31, 27);
 rect(160, 250, 9, 20);
 fill(6, 52, 11);
 ellipse(165, 240, 25, 25);
 ///fourty
 fill(46, 31, 27);
 rect(100, 250, 9, 20);
 fill(6, 52, 11);
 ellipse(105, 240, 25, 25);
 ///foury-one
 fill(46, 31, 27);
 rect(40, 250, 9, 20);
 fill(6, 52, 11);
 ellipse(45, 240, 25, 25);
 ///fourty-two
 fill(46, 31, 27);
 rect(130, 310, 9, 20);
 fill(6, 52, 11);
 ellipse(135, 300, 25, 25);
 ///fourty-three
 fill(46, 31, 27);
 rect(68, 310, 9, 20);
 fill(6, 52, 11);
 ellipse(73, 300, 25, 25);
 ///fourty-four
 fill(46, 31, 27);
 rect(160, 370, 9, 20);
 fill(6, 52, 11);
 ellipse(165, 360, 25, 25);
 ///fourty-five
 fill(46, 31, 27);
 rect(100,370,9,20);
 fill(6, 52, 11);
 ellipse(105, 360, 25, 25);
 ///fourty-six
 fill(46, 31, 27);
 rect(40, 370, 9, 20);
 fill(6, 52, 11);
 ellipse(45, 360, 25, 25);
 ////SUN
 fill(250, 255, 121);
 stroke(0);
   ellipse(circleX,circleY, 50, 50);
     circleX=circleX + 3;
     if ( circleX>width){
       circleX=0;
     }
  }
 void hero() {
  noStroke();
 rectMode((CENTER));
 fill(11, 69, 149);
 ellipse(rectX, rectY-10, 20, 20);
 rect(rectX, rectY, 15,25);
 if(frameCount % 60 > 30 ){
   
 //arms
 rect(rectX+10, rectY+5, 10, 5);
 rect(rectX-10, rectY+5, 10, 5);
 //legs
 rect(rectX-6, rectY+17, 5, 10);
 rect(rectX+6, rectY+17, 5, 10);
 } else {
 //arms
 rect(rectX+10, rectY+3, 10, 5);
 rect(rectX-10, rectY+3, 10, 5);
 //legs
 rect(rectX-4, rectY+17, 5, 10);
 rect(rectX+4, rectY+17, 5, 10);
 }
 /*rectX=rectX + DX;
 rectY=rectY + DY;
 if (rectX>width || rectX<0){
   DX=-DX;
 }
   if (rectY>height || rectY<0){
   DY=-DY;
   
 }*/
 rectMode((CORNER));
 }
 void reset() {
   DX=5;
   DY=2;
  rectX=850;
  rectY=200;
  circleY=55;
  monsterX=random(0, width);
  monsterY=random(height/3, height);
  goldX= random(0, width);
  goldY= random(height/3, height);
buttonX= 700;
buttonY=100;
 }

 void monster() {
   ///monster body
   fill(255);
   ellipse( monsterX, monsterY, 20, 40);
   ///monster eyes
   fill(255, 57, 3);
   ellipse(monsterX+5, monsterY-9, 3,3);
   ellipse(monsterX-5, monsterY-9, 3, 3);
   
   
 monsterY +=(rectY-monsterY) / 150;
 monsterX +=(rectX-monsterX) / 150;
  
   if ( dist (rectX, rectY, monsterX, monsterY) < 75) {
     score -= 100;
     reset();
   }
   fill(43, 23, 56);
   textSize(18);
   text(score, 60, 205);
   text("Score", 1, 205);
 }
 void gold() {
   fill(255, 190, 8);
   rect(goldX, goldY, 20, 20);
   rectY +=(goldY-rectY) / 75;
 rectX +=(goldX-rectX) / 75;
  if ( dist (rectX, rectY, goldX, goldY) < 75) {
     score += 50;
     reset();
   }
 }
   void button() {
     fill(0);
        textSize(18);
     text("Ana Collantes", 1, 690);
     text("reset", 677, 132);
     text("Monster vs. Hero", 350, 15);
     ellipse(buttonX, buttonY, 30, 30);
    
     
 }   
 
 void mousePressed() {
   if( (dist( mouseX, mouseY, buttonX, buttonY)< 15) && mousePressed) {
      score -=50;
      reset();
    }
 }
