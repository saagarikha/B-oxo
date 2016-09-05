package com.example.touch;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class Newgame extends Activity {

	Button btn, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10,
	btn11, btn12, btn13, btn14, btn15;
	//Animation anim=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
int flagx1 = 0, flagy1 = 0, flagy12 = 0, splb1 = 0, cnt1 = 0;
int flagx2 = 0, flagy2 = 0, flagy22 = 0, splb2 = 0, cnt2 = 0;
int flagx3 = 0, flagy3 = 0, flagy32 = 0, splb3 = 0, cnt3 = 0;
int flagx4 = 0, flagx42 = 0, flagy4 = 0, flagy42 = 0, splb4 = 0, cnt4 = 0;
int flagx21 = 0, flagy21 = 0, splb5 = 0, cnt5 = 0;
int flagx22 = 0, flagy222 = 0, splb6 = 0, cnt6 = 0;
int flagx23 = 0, flagy23 = 0, splb7 = 0, cnt7 = 0;
int flagx31 = 0, flagy31 = 0, splb9 = 0, cnt9 = 0;
int flagx32 = 0, flagy322 = 0, splb10 = 0, cnt10 = 0;
int flagx33 = 0, flagy33 = 0, splb11 = 0, cnt11 = 0;
int flagx41 = 0, flagy41 = 0, splb13 = 0, cnt13 = 0;
int flagx422 = 0, flagy422 = 0, splb14 = 0, cnt14 = 0;
int flagx43 = 0, flagy43 = 0, splb15 = 0, cnt15 = 0;
int flagx24 = 0, flagx241 = 0, flagy24 = 0, splb8 = 0, cnt8 = 0;
int flagx34 = 0, flagx341 = 0, flagy34 = 0, splb12 = 0, cnt12 = 0;
int flagx44 = 0, flagx441 = 0, flagy44 = 0, splb16 = 0, cnt16 = 0;
int turn = 1,set=1,win0=0,win1=0;

// OnTouchListener main=new MainActivity();
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_newgame);
Intent intnt=getIntent();
final MediaPlayer mp=MediaPlayer.create(this,R.raw.strtsnd);
btn = (Button) findViewById(R.id.button1);
btn.setId(1);
btn.setOnTouchListener(new mytouch(flagx1, flagy1, flagy12));
btn1 = (Button) findViewById(R.id.button2);
btn1.setId(2);
btn1.setOnTouchListener(new mytouch(flagx2, flagy2, flagy22));
btn2 = (Button) findViewById(R.id.button3);
btn2.setId(3);
btn2.setOnTouchListener(new mytouch(flagx3, flagy3, flagy32));
btn3 = (Button) findViewById(R.id.button4);
btn3.setId(4);
btn3.setOnTouchListener(new mytouch(flagx4, flagx42, flagy4, flagy42));
btn4 = (Button) findViewById(R.id.button21);
btn4.setId(5);
btn4.setOnTouchListener(new mytouch(flagx21, flagy21));
btn5 = (Button) findViewById(R.id.button22);
btn5.setId(6);
btn5.setOnTouchListener(new mytouch(flagx22, flagy222));
btn6 = (Button) findViewById(R.id.button23);
btn6.setId(7);
btn6.setOnTouchListener(new mytouch(flagx23, flagy23));
btn8 = (Button) findViewById(R.id.button31);
btn8.setId(8);
btn8.setOnTouchListener(new mytouch(flagx31, flagy31));
btn9 = (Button) findViewById(R.id.button32);
btn9.setId(9);
btn9.setOnTouchListener(new mytouch(flagx32, flagy322));
btn10 = (Button) findViewById(R.id.button33);
btn10.setId(10);
btn10.setOnTouchListener(new mytouch(flagx33, flagy33));
btn12 = (Button) findViewById(R.id.button41);
btn12.setId(11);
btn12.setOnTouchListener(new mytouch(flagx41, flagy41));
btn13 = (Button) findViewById(R.id.button42);
btn13.setId(12);
btn13.setOnTouchListener(new mytouch(flagx422, flagy422));
btn14 = (Button) findViewById(R.id.button43);
btn14.setId(13);
btn14.setOnTouchListener(new mytouch(flagx43, flagy43));
btn7 = (Button) findViewById(R.id.button24);
btn7.setId(14);
btn7.setOnTouchListener(new mytouch(flagx24, flagx241, flagy24));
btn11 = (Button) findViewById(R.id.button34);
btn11.setId(15);
btn11.setOnTouchListener(new mytouch(flagx34, flagx341, flagy34));
btn15 = (Button) findViewById(R.id.button44);
btn15.setId(16);
btn15.setOnTouchListener(new mytouch(flagx44, flagx441, flagy44));
}
class mytouch implements  OnTouchListener {
int fl = 0, fl1 = 0, fl2 = 0, fl3 = 0;
String s = null;String copy=null;
public mytouch(int i, int j, int k) {
	fl = i;
	fl1 = j;
	fl2 = k;
	if(turn==1) { s="player0"; turn=0;}
	else {s="player1";turn=1;}
	if(set==0){s=copy; set=1;}
	if(splb1==1 && splb2==1 && splb3==1 && splb4==1 && splb5==1 && splb6==1 && splb1==7 && splb8==1 && splb9==1 && splb10==1 
			&& splb11==1 && splb12==1 && splb13==1 && splb14==1 && splb15==1 && splb16==1)
	{
		Toast.makeText(getBaseContext(),"GAME ENDSSS",Toast.LENGTH_SHORT).show();
		if(win0>win1)
			Toast.makeText(getBaseContext(),"Player 0 WINSS",Toast.LENGTH_SHORT).show();
		else
			Toast.makeText(getBaseContext(),"Player 1 WINSS",Toast.LENGTH_SHORT).show();
		if(win0==win1)
			Toast.makeText(getBaseContext(),"TIEE UP,RESTART AGAIN",Toast.LENGTH_SHORT).show();	
	}
}
public mytouch(int i, int j, int k, int l) {
	fl = i;
	fl1 = j;
	fl2 = k;
	fl3 = l;
	if(turn==1) { s="player0"; turn=0;}
	else {s="player1";turn=1;}
	if(set==0){s=copy; set=1;}
	if(splb1==1 && splb2==1 && splb3==1 && splb4==1 && splb5==1 && splb6==1 && splb1==7 && splb8==1 && splb9==1 && splb10==1 
			&& splb11==1 && splb12==1 && splb13==1 && splb14==1 && splb15==1 && splb16==1)
	{
		Toast.makeText(getBaseContext(),"GAME ENDSSS",Toast.LENGTH_SHORT).show();
		if(win0>win1)
			Toast.makeText(getBaseContext(),"Player 0 WINSS",Toast.LENGTH_SHORT).show();
		else
			Toast.makeText(getBaseContext(),"Player 1 WINSS",Toast.LENGTH_SHORT).show();
		if(win0==win1)
			Toast.makeText(getBaseContext(),"TIEE UP,RESTART AGAIN",Toast.LENGTH_SHORT).show();	
	}
}
public mytouch(int i, int j) {
	fl = i;
	fl1 = j;
	if(turn==1) { s="player0"; turn=0;}
	else {s="player1";turn=1;}
	if(set==0){s=copy; set=1;}
	if(splb1==1 && splb2==1 && splb3==1 && splb4==1 && splb5==1 && splb6==1 && splb1==7 && splb8==1 && splb9==1 && splb10==1 
			&& splb11==1 && splb12==1 && splb13==1 && splb14==1 && splb15==1 && splb16==1)
	{
		Toast.makeText(getBaseContext(),"GAME ENDSSS",Toast.LENGTH_SHORT).show();
		if(win0>win1)
			Toast.makeText(getBaseContext(),"Player 0 WINSS",Toast.LENGTH_SHORT).show();
		else
			Toast.makeText(getBaseContext(),"Player 1 WINSS",Toast.LENGTH_SHORT).show();
		if(win0==win1)
			Toast.makeText(getBaseContext(),"TIEE UP,RESTART AGAIN",Toast.LENGTH_SHORT).show();	
	}
}
@SuppressWarnings("deprecation")
public boolean onTouch(View v, MotionEvent event) {
	// TODO Auto-generated method stub
	Drawable c = null;
	float x = event.getX();
	float y = event.getY();
	int id = v.getId();
     v.playSoundEffect(SoundEffectConstants.CLICK);
	if (x < 20) {
		if (id == 1 || id == 2 || id == 3) {
			int sdk = android.os.Build.VERSION.SDK_INT;
			if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
				if (fl2 == 0 && fl1 == 0){
					v.setDrawingCacheEnabled(true);
					v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw1));}
			} else {
				if (fl2 == 0 && fl1 == 0){
					v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw1));}
			}
            if (fl1 == 0 && fl2 == 1)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw6));
			else if (fl1 == 1 && fl2 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw3));
			else if (fl1 == 1 && fl2 == 1) {
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw4));
				if (id == 1)
					cnt1 = 1;
				else if (id == 2)
					cnt2 = 1;
				else
					cnt3 = 1;
			}
			if (id == 1)
				flagx1 = 1;
			else if (id == 2)
				flagx2 = 1;
			else
				flagx3 = 1;
			if (cnt1 == 1 && flagx2 == 1 && splb1 == 0) {
				splb1 = 1;
				v = (Button) btn;set=0;
				copy=s; 
				if(s.equals("player0"))win0++;
				else win1++;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn.setText(s);
			} else if (cnt2 == 1 && flagx3 == 1 && splb2 == 0) {
				splb2 = 1;copy=s;
				v = (Button) btn1;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn1.setText(s);set=0;
				if(s.equals("player0"))win0++;
				else win1++;
			} else if (cnt3 == 1 && flagx4 == 1 && splb3 == 0) {
				splb3 = 1;copy=s;
				v = (Button) btn2;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn2.setText(s);set=0;
				if(s.equals("player0"))win0++;
				else win1++;
			}
			fl = 1;
		}
		if (id == 4) {
			if (fl1 == 0 && fl2 == 0 && fl3 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw23));
			else if (fl1 == 0 && fl2 == 1 && fl3 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw24));
			else if (fl1 == 1 && fl2 == 0 && fl3 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw25));
			else if (fl1 == 0 && fl2 == 0 && fl3 == 1)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw26));
			else if (fl1 == 1 && fl2 == 1 && fl3 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw29));
			else if (fl1 == 1 && fl2 == 0 && fl3 == 1)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw28));
			else if (fl1 == 0 && fl2 == 1 && fl3 == 1)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw27));
			else {
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				v.playSoundEffect(SoundEffectConstants.NAVIGATION_RIGHT);
				//v.startAnimation(anim);
				splb4 = 1;
				v = (Button) btn3;copy=s;
				btn3.setText(s);set=0;
				if(s.equals("player0"))win0++;
				else win1++;
			}
			fl = 1;
			flagx4 = 1;
			if (cnt3 == 1 && flagx4 == 1 && splb3 == 0) {
				splb3 = 1;
				v = (Button) btn2;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				copy=s;
				btn2.setText(s);set=0;
				if(s.equals("player0"))win0++;
				else win1++;
			}
		}
		if (id >= 5 && id <= 13) {
			if (fl1 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw50));
			else {
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw51));
				if (id == 5)
					cnt5 = 1;
				else if (id == 6)
					cnt6 = 1;
				else if (id == 7)
					cnt7 = 1;
				else if (id == 8)
					cnt9 = 1;
				else if (id == 9)
					cnt10 = 1;
				else if (id == 10)
					cnt11 = 1;
				else if (id == 11)
					cnt13 = 1;
				else if (id == 12)
					cnt14 = 1;
				else if (id == 13)
					cnt15 = 1;
			}
			fl = 1;
			if (id == 5)
				flagx21 = 1;
			else if (id == 6)
				flagx22 = 1;
			else if (id == 7)
				flagx23 = 1;
			else if (id == 8)
				flagx31 = 1;
			else if (id == 9)
				flagx32 = 1;
			else if (id == 10)
				flagx33 = 1;
			else if (id == 11)
				flagx41 = 1;
			else if (id == 12)
				flagx422 = 1;
			else if (id == 13)
				flagx43 = 1;
			if (flagy12 == 1 && flagx22 == 1 && splb5 == 0 && cnt5 == 1) {
				v = (Button) btn4;copy=s;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn4.setText(s);set=0;
				splb5 = 1;
				if(s.equals("player0"))win0++;
				else win1++;
			} else if (splb6 == 0 && flagy22 == 1 && flagx23 == 1 && cnt6 == 1) {
				v = (Button) btn5;set=0;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn5.setText(s);
				copy=s;
				splb6 = 1;
				if(s.equals("player0"))win0++;
				else win1++;
			} else if (splb7 == 0 && flagy32 == 1 && flagx24 == 1 && cnt7 == 1) {
				v = (Button) btn6;set=0;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn6.setText(s);copy=s;
				splb7 = 1;
				if(s.equals("player0"))win0++;
				else win1++;
			} else if (splb9 == 0 && flagy21 == 1 && flagx32 == 1 && cnt9 == 1) {
				v = (Button) btn8;set=0;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn8.setText(s);copy=s;
				splb9 = 1;
				if(s.equals("player0"))win0++;
				else win1++;
			} else if (splb10 == 0 && flagy222 == 1 && flagx33 == 1 && cnt10 == 1) {
				v = (Button) btn9;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn9.setText(s);set=0;copy=s;
				splb10 = 1;
				if(s.equals("player0"))win0++;
				else win1++;
			} else if (splb11 == 0 && flagy23 == 1 && flagx34 == 1 && cnt11 == 1) {
				v = (Button) btn10;copy=s;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn10.setText(s);set=0;
				splb11 = 1;
				if(s.equals("player0"))win0++;
				else win1++;
			} else if (splb13 == 0 && flagy31 == 1 && flagx422 == 1	&& cnt13 == 1) {
				v = (Button) btn12;copy=s;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
			btn12.setText(s);set=0;
				splb13 = 1;
				if(s.equals("player0"))win0++;
				else win1++;
			} else if (splb14 == 0 && flagy322 == 1 && flagx43 == 1	&& cnt14 == 1) {
				v = (Button) btn13;copy=s;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn13.setText(s);
				splb14 = 1;set=0;
				if(s.equals("player0"))win0++;
				else win1++;
			} else if (splb15 == 0 && flagy33 == 1 && flagx44 == 1 && cnt15 == 1) {
				v = (Button) btn14;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn14.setText(s);copy=s;
				splb15 = 1;set=0;
				if(s.equals("player0"))win0++;
				else win1++;
			}
		}
		if (id >= 14 && id <= 16) {
			if (fl1 == 0 && fl2 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw53));
			else if (fl1 == 1 && fl2 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw54));
			else if (fl1 == 0 && fl2 == 1)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw55));
			else
			{	v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw56));
			   if(id==14)cnt8=1;
			   else if(id==15) cnt12=1;
			   else if(id==16)cnt16=1;
			}
			fl = 1;
			if (id == 14)
				flagx24 = 1;
			else if (id == 15)
				flagx34 = 1;
			else if (id == 16)
				flagx44 = 1;
			if(splb8==0 && flagy42==1 && cnt8==1){set=0;copy=s;
			btn7.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn7.setText(s);splb8=1;
				if(s.equals("player0"))win0++;
				else win1++; }
			else if(splb12==0 && flagy24==1 && cnt12==1){set=0;copy=s;
				btn11.setText(s);splb12=1;
				btn11.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				if(s.equals("player0"))win0++;
				else win1++;}
			else if(splb16==0 && flagy34==1 && cnt16==1){set=0;copy=s;
			btn15.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));	
			btn15.setText(s);splb16=0;splb16=1;
				if(s.equals("player0"))win0++;
				else win1++;}
			if (splb7 == 0 && flagy32 == 1 && flagx24 == 1 && cnt7 == 1) {
					v = (Button) btn6;copy=s;
					v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
					btn6.setText(s);
					splb7 = 1;set=0;
					if(s.equals("player0"))win0++;
					else win1++;
				}
			if (splb11 == 0 && flagy23 == 1 && flagx34 == 1 && cnt11 == 1) {
				v = (Button) btn10;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn10.setText(s);set=0;copy=s;
				splb11 = 1;
				if(s.equals("player0"))win0++;
				else win1++;
			}
			if (splb15 == 0 && flagy33 == 1 && flagx44 == 1 && cnt15 == 1) {
				v = (Button) btn14;copy=s;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn14.setText(s);set=0;
					splb15 = 1;
					if(s.equals("player0"))win0++;
				else win1++;
			}	
		}
	}
	if (y < 15 && x > 0 && x < 108) {
		if (id == 1 || id == 2 || id == 3) {
			if (fl == 0 && fl2 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw2));
			else if (fl == 1 && fl2 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw3));
			else if (fl == 0 && fl2 == 1)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw8));
			else {
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw4));
				if (id == 1)
					cnt1 = 1;
				else if (id == 2)
					cnt2 = 1;
				else if (id == 3)
					cnt3 = 1;
			}
			if (id == 1)
				flagy1 = 1;
			else if (id == 2)
				flagy2 = 1;
			else if (id == 3)
				flagy3 = 1;
			if (cnt1 == 1 && flagx2 == 1 && splb1 == 0) {
				splb1 = 1;
				v = (Button) btn;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn.setText(s);set=0;copy=s;
				if(s.equals("player0"))win0++;
				else win1++;
				} else if (cnt2 == 1 && flagx3 == 1 && splb2 == 0) {
				splb2 = 1;
				v = (Button) btn1;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn1.setText(s);set=0;copy=s;
				if(s.equals("player0"))win0++;
				else win1++;
				} else if (cnt3 == 1 && flagx4 == 1 && splb3 == 0) {
				splb3 = 1;
				v = (Button) btn2;copy=s;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
		        btn2.setText(s);set=0;
		        if(s.equals("player0"))win0++;
				else win1++;
				}
			fl1 = 1;
		}
		if (id == 4) {
			if (fl == 0 && fl1 == 0 && fl3 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw31));
			else if (fl == 1 && fl1 == 0 && fl3 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw24));
			else if (fl == 0 && fl1 == 1 && fl3 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw32));
			else if (fl == 0 && fl1 == 0 && fl3 == 1)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw33));
			else if (fl == 1 && fl1 == 0 && fl3 == 1)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw27));
			else if (fl == 1 && fl1 == 1 && fl3 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw34));
			else if (fl == 0 && fl1 == 1 && fl3 == 1)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw35));
			else {
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				splb4 = 1;set=0;copy=s;
				v = (Button) btn3;btn3.setText(s);
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				if(s.equals("player0"))win0++;
				else win1++;
				}
			fl2 = 1;
			flagy4 = 1;
		}
	}
	if (y > 40 && x > 0 && x < 108) {
		if (id == 1 || id == 2 || id == 3) {
			if (fl == 0 && fl1 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw5));
			else if (fl == 1 && fl1 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw6));
			else if (fl == 0 && fl1 == 1)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw8));
			else {
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw4));
				if (id == 1)
					cnt1 = 1;
				else if (id == 2)
					cnt2 = 1;
				else if (id == 3)
					cnt3 = 1;
			}
			if (id == 1)
				flagy12 = 1;
			else if (id == 2)
				flagy22 = 1;
			else if (id == 3)
				flagy32 = 1;
			if (flagy12 == 1 && flagx22 == 1 && splb5 == 0 && cnt5 == 1) {
				splb5 = 1;set=0;copy=s;
				v = (Button) btn4;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn4.setText(s);
				if(s.equals("player0"))win0++;
				else win1++;
			} else if (splb6 == 0 && flagy22 == 1 && flagx23 == 1
					&& cnt6 == 1) {set=0;copy=s;
				v = (Button) btn5;		v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn5.setText(s);
				splb6 = 1;
				if(s.equals("player0"))win0++;
				else win1++;
			} else if (splb7 == 0 && flagy32 == 1 && flagx24 == 1 && cnt7 == 1) {
				v = (Button) btn6;v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn6.setText(s);copy=s;
				splb7 = 1;set=0;
				if(s.equals("player0"))win0++;
				else win1++;
			}
			if (cnt1 == 1 && flagx2 == 1 && splb1 == 0) {
				splb1 = 1;set=0;copy=s;
				v = (Button) btn;v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn.setText(s);
				if(s.equals("player0"))win0++;
				else win1++;
				} else if (cnt2 == 1 && flagx3 == 1 && splb2 == 0) {
				splb2 = 1;set=0;copy=s;
				v = (Button) btn1;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn1.setText(s);
				if(s.equals("player0"))win0++;
				else win1++;
				} else if (cnt3 == 1 && flagx4 == 1 && splb3 == 0) {
				splb3 = 1;set=0;copy=s;
				v = (Button) btn2;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn2.setText(s);
				if(s.equals("player0"))win0++;
				else win1++;
				}
			fl2 = 1;
		}
		if (id == 4) {
			if (fl == 0 && fl1 == 0 && fl2 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw36));
			else if (fl == 1 && fl1 == 0 && fl2 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw26));
			else if (fl == 0 && fl2 == 1 && fl1 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw33));
			else if (fl == 0 && fl1 == 1 && fl2 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw37));
			else if (fl == 1 && fl1 == 1 && fl2 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw28));
			else if (fl == 1 && fl1 == 0 && fl2 == 1)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw27));
			else if (fl == 0 && fl1 == 1 && fl2 == 1)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw35));
			else {
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				splb4 = 1;set=0;copy=s;
				v = (Button) btn3;v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn3.setText(s);
				if(s.equals("player0"))win0++;
				else win1++;
				}
			fl3 = 1;
			flagy42 = 1;
			if(cnt8==1 && splb8==0){set=0;copy=s;
			btn7.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn7.setText(s);splb8=1;
				if(s.equals("player0"))win0++;
				else win1++;}
		}
		if (id >= 5 && id <= 13) {
			if (fl == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw52));
			else {
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw51));
				if (id == 5)
					cnt5 = 1;
				else if (id == 6)
					cnt6 = 1;
				else if (id == 7)
					cnt7 = 1;
				else if (id == 8)
					cnt9 = 1;
				else if (id == 9)
					cnt10 = 1;
				else if (id == 10)
					cnt11 = 1;
				else if (id == 11)
					cnt13 = 1;
				else if (id == 12)
					cnt14 = 1;
				else if (id == 13)
					cnt15 = 1;
			}
			fl1 = 1;
			if (id == 5)
				flagy21 = 1;
			else if (id == 6)
				flagy222 = 1;
			else if (id == 7)
				flagy23 = 1;
			else if (id == 8)
				flagy31 = 1;
			else if (id == 9)
				flagy322 = 1;
			else if (id == 10)
				flagy33 = 1;
			else if (id == 11)
				flagy41 = 1;
			else if (id == 12)
				flagy422 = 1;
			else if (id == 13)
				flagy43 = 1;
			if (cnt1 == 1 && flagx2 == 1 && splb1 == 0) {
				splb1 = 1;set=0;copy=s;
				v = (Button) btn;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn.setText(s);
				if(s.equals("player0"))win0++;
				else win1++;
				} else if (cnt2 == 1 && flagx3 == 1 && splb2 == 0) {
				splb2 = 1;set=0;copy=s;
				v = (Button) btn1;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn1.setText(s);
				if(s.equals("player0"))win0++;
				else win1++;
			} else if (cnt3 == 1 && flagx4 == 1 && splb3 == 0) {
				splb3 = 1;set=0;copy=s;
				v = (Button) btn2;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn2.setText(s);
				if(s.equals("player0"))win0++;
				else win1++;
			}
			if (flagy12 == 1 && flagx22 == 1 && splb5 == 0 && cnt5 == 1) {
				splb5 = 1;set=0;copy=s;
				v = (Button) btn4;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn4.setText(s);
				if(s.equals("player0"))win0++;
				else win1++;
			}
			if (splb6 == 0 && flagy22 == 1 && flagx23 == 1 && cnt6 == 1) {
				v = (Button) btn5;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn5.setText(s);copy=s;
				splb6 = 1;set=0;
				if(s.equals("player0"))win0++;
				else win1++;
			}
			if (splb7 == 0 && flagy32 == 1 && flagx24 == 1 && cnt7 == 1) {
				v = (Button) btn6;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn6.setText(s);copy=s;
				splb7 = 1;set=0;
				if(s.equals("player0"))win0++;
				else win1++;
			}
			if (splb9 == 0 && flagy21 == 1 && flagx32 == 1 && cnt9 == 1) {
				v = (Button) btn8;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn8.setText(s);copy=s;
				splb9 = 1;set=0;
				if(s.equals("player0"))win0++;
				else win1++;
			}
			if (splb10 == 0 && flagy222 == 1 && flagx33 == 1 && cnt10 == 1) {
				v = (Button) btn9;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn9.setText(s);copy=s;
				splb10 = 1;set=0;
				if(s.equals("player0"))win0++;
				else win1++;
			}
			if (splb11 == 0 && flagy23 == 1 && flagx34 == 1 && cnt11 == 1) {
				v = (Button) btn10;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn10.setText(s);copy=s;
				splb11 = 1;set=0;
				if(s.equals("player0"))win0++;
				else win1++;
			}
			if (splb13 == 0 && flagy31 == 1 && flagx422 == 1 && cnt13 == 1) {
				v = (Button) btn12;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn12.setText(s);copy=s;
				splb13 = 1;set=0;
				if(s.equals("player0"))win0++;
				else win1++;
			}
			if (splb14 == 0 && flagy322 == 1 && flagx43 == 1 && cnt14 == 1) {
				v = (Button) btn13;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn13.setText(s);copy=s;
				splb14 = 1;set=0;
				if(s.equals("player0"))win0++;
				else win1++;
			}
			if (splb15 == 0 && flagy33 == 1 && flagx44 == 1	&& cnt15 == 1) {
				v = (Button) btn14;
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn14.setText(s);copy=s;
				splb15 = 1;set=0;
				if(s.equals("player0"))win0++;
				else win1++;
			}
		}
		if (id >= 14 && id <= 16) {
			if (fl == 0 && fl1 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw57));
			else if (fl == 1 && fl1 == 0)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw55));
			else if (fl == 0 && fl1 == 1)
				v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw58));
			else
			{	v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw56));
			   if(id==14) cnt8=1;
			   else if(id==15) cnt12=1;
			   else if(id==16) cnt16=1;
			}fl2 = 1;
			if (id == 14)
				flagy24 = 1;
			else if (id == 15)
				flagy34 = 1;
			else if (id == 16)
				flagy44 = 1;
			if(cnt8==1 && flagy42==1 && splb8==0){set=0;copy=s;
			btn7.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
				btn7.setText(s);splb8=1;
				if(s.equals("player0"))win0++;
				else win1++;}
			else if(splb12==0 && flagy24==1 && cnt12==1){set=0;copy=s;
			btn11.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));	
			btn11.setText(s);splb12=1;
				if(s.equals("player0"))win0++;
				else win1++;}
			else if(splb16==0 && flagy34==1 && cnt16==1){set=0;copy=s;
			btn15.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));	
			btn15.setText(s);splb16=1;
				if(s.equals("player0"))win0++;
				else win1++;}
		}
	}
	if (id == 4 && x > 40) {
		if (fl == 0 && fl2 == 0 && fl3 == 0)
			v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw38));
		else if (fl == 1 && fl2 == 0 && fl3 == 0)
			v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw39));
		else if (fl == 0 && fl2 == 1 && fl3 == 0)
			v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw34));
		else if (fl == 0 && fl2 == 0 && fl3 == 1)
			v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw37));
		else if (fl == 1 && fl2 == 1 && fl3 == 0)
			v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw29));
		else if (fl == 1 && fl2 == 0 && fl3 == 1)
			v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw28));
		else if (fl == 0 && fl2 == 1 && fl3 == 1)
			v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw35));
		else {
			v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
			splb4 = 1;set=0;copy=s;
			v = (Button) btn3;
			v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
			btn3.setText(s);
			if(s.equals("player0"))win0++;
			else win1++;
		}
		fl3 = 1;
		flagx42 = 1;
	}
	if (id >= 14 && id <= 16 && x > 40) {
		if (fl == 0 && fl2 == 0)
			v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw59));
		else if (fl == 1 && fl2 == 0)
			v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw54));
		else if (fl == 0 && fl2 == 1)
		v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw58));
		else{
			v.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw56));
		if(id==14) cnt8=1;
		else if(id==15)cnt12=1;
		else if(id==16)cnt16=1;}
			fl1 = 1;
		if (id == 14)
			flagx241 = 1;
		else if (id == 15)
			flagx341 = 1;
		else if (id == 16)
			flagx441 = 1;
		if(splb8==0 && flagy42==1 && cnt8==1){set=0;copy=s;
		btn7.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));
			btn7.setText(s);splb8=1;
			if(s.equals("player0"))win0++;
			else win1++;}
		else if(splb12==0 && flagy24==1 && cnt12==1){set=0;copy=s;
		btn11.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));	
		btn11.setText(s);splb12=1;
			if(s.equals("player0"))win0++;
			else win1++;}
		else if(splb16==0 && flagy34==1 && cnt16==1){set=0;copy=s;
		btn15.setBackgroundDrawable(getResources().getDrawable(R.drawable.draw30));	
			btn15.setText(s);splb16=1;
			if(s.equals("player0"))win0++;
			else win1++;}
	}
	//if(splb1==1)Toast.makeText(getBaseContext(),"GAME ENDSSS",Toast.LENGTH_SHORT).show();
	//Toast.makeText(getBaseContext(),"splbval :"+splb1+splb2+splb3+splb4+splb5+splb6+splb7+splb8+splb9+splb10+splb11+splb12+splb13+splb14+splb15+splb16,3).show();
	if(splb1==1 && splb2==1 && splb3==1 && splb4==1 && splb5==1 && splb6==1 && splb7==1 && splb8==1 && splb9==1 && splb10==1 && splb11==1 && splb12==1 && splb13==1 && splb14==1 && splb15==1 && splb16==1)
	{
		Toast.makeText(getBaseContext(),"GAME ENDSSS",Toast.LENGTH_SHORT).show();
		if(win0>win1)
			Toast.makeText(getBaseContext(),"Player 0 WINSS",Toast.LENGTH_SHORT).show();
		else
			Toast.makeText(getBaseContext(),"Player 1 WINSS",Toast.LENGTH_SHORT).show();
		if(win0==win1)
			Toast.makeText(getBaseContext(),"TIEE UP,RESTART AGAIN",Toast.LENGTH_SHORT).show();	
	}
	return true;
}

}
}