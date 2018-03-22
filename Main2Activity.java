package com.example.jacka.gfgallery;

import android.content.Intent;
import android.graphics.PointF;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private ImageView im1;
    private ScaleGestureDetector SGD;
    Button back;
    TextView girl_name;
    boolean prpr = true;
    float scale = 1f;
    PointF focus = new PointF();
    int normal_id;
    int damage_id;
    boolean scaleend = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        im1 = findViewById(R.id.imageview1);
        back = findViewById(R.id.return_button);
        girl_name = findViewById(R.id.text_title);
        SGD = new ScaleGestureDetector(this,new ScaleListener());
        Intent intent = getIntent();
        String which_girl = intent.getStringExtra("girl_name");
        String normal_pic = intent.getStringExtra("normal");
        String damage_pic = intent.getStringExtra("damage");

        girl_name.setText(which_girl);

        normal_id = getResources().getIdentifier(normal_pic, "drawable", getPackageName());
        damage_id = getResources().getIdentifier(damage_pic, "drawable", getPackageName());

        im1.setImageResource(normal_id);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {

       final int action = MotionEventCompat.getActionMasked(event);
       SGD.onTouchEvent(event);
       switch (action) {
           case MotionEvent.ACTION_DOWN: {

           }
           case MotionEvent.ACTION_UP: {
               if (!scaleend) {
                   if (prpr) {
                       im1.setImageResource(damage_id);
                       prpr = false;
                   } else {
                       im1.setImageResource(normal_id);
                       prpr = true;
                   }
               }
               scaleend = false;
               break;
           }
       }
       return true;
    }

    public class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        float last_Touch_X;
        float last_Touch_Y;

        @Override
        public boolean onScaleBegin(ScaleGestureDetector detector) {
            last_Touch_X = detector.getFocusX();
            last_Touch_Y = detector.getFocusY();
            return true;
        }
        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            scale *=detector.getScaleFactor();
            scale = Math.max(1f, Math.min(scale, 5.0f));
            float old_image_focus_X = im1.getPivotX();
            float old_image_focus_Y = im1.getPivotY();

            float touch_focus_X = detector.getFocusX();
            float touch_focus_Y = detector.getFocusY();
            float image_width = im1.getWidth();
            float image_height = im1.getHeight();
            float focus_move_X = touch_focus_X - last_Touch_X;
            float focus_move_Y = touch_focus_Y - last_Touch_Y;
            float image_focusX = old_image_focus_X - focus_move_X;
            float image_focusY = old_image_focus_Y - focus_move_Y;

            focus.set(touch_focus_X, touch_focus_Y);

            Log.d("Debug","the x: "+focus.x+"  "+"the y: "+focus.y);
            Log.d("Debug","image width: "+image_width+"  "+"image height: "+image_height);
            Log.d("Debug","old image focus X: "+old_image_focus_X+"  "+"old image focus Y: "+old_image_focus_Y);
            Log.d("Debug","image focus X: "+ image_focusX+"   "+"image focus Y: "+image_focusY);


            im1.setPivotX(image_focusX);
            im1.setPivotY(image_focusY);
            im1.setScaleX(scale);
            im1.setScaleY(scale);

            last_Touch_X = touch_focus_X;
            last_Touch_Y = touch_focus_Y;
            return true;
        }
        @Override
        public void onScaleEnd(ScaleGestureDetector detector) {
            scaleend = true;
        }

    }


}
