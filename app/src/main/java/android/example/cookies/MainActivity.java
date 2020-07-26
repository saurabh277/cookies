package android.example.cookies;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
     display1();
     String message="I'm so full";
     display2(message);
    }
    public void display1(){
        ImageView setImage=(ImageView)findViewById(R.id.android_cookie_image_view);
        setImage.setImageResource(R.drawable.after_cookie);
    }
    public void display2(String message){
        TextView text=(TextView)findViewById(R.id.status_text_view);
        text.setText(message);
    }
}