int hiScore = 0;
int score = 0;
String hiScoreMessage = "High-Score: ";
String currentScore = "Current Score: ";

void setup(){
   size(400, 400);
   frameRate(5);
}
void draw(){
 background(0,0,0);
 if(score >= hiScore){
    hiScore = score; 
 }
 
 text(hiScoreMessage, 270, 15);
 text(hiScore, 360,15);
 text(currentScore, 270, 30);
 text(score, 360,30);
 
 score += 1;
}
