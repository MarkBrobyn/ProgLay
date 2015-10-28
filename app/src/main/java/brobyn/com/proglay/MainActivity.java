// http://android-coding.blogspot.co.uk/2011/05/resize-button-programmatically-using.html
// http://stackoverflow.com/questions/11484579/android-programmatically-set-button-layout
// http://stackoverflow.com/questions/6535648/how-can-i-dynamically-set-the-position-of-view-in-android
// http://stackoverflow.com/questions/9636467/listview-pushes-other-views-off-the-screen
// http://stackoverflow.com/questions/24474380/trying-to-create-nested-multiple-linear-layout-programmatically
// http://stackoverflow.com/questions/2481455/set-margins-in-a-linearlayout-programmatically

package brobyn.com.proglay;

//import android.graphics.Point;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;


public class MainActivity extends ActionBarActivity {
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    LinearLayout row1;
    LinearLayout row2;
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    int step;
    int stepDiv=12;
    int textViewStep=4; // width in (window width)/stepDiv
    int textViewDimen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Display display = getWindowManager().getDefaultDisplay();
        int width = display.getWidth();
        int height = display.getHeight();
        step=width/stepDiv;
        textViewDimen=step*textViewStep;

        /*
        textView1=(TextView)findViewById(R.id.textview1);
        textView2=(TextView)findViewById(R.id.textview2);
        textView3=(TextView)findViewById(R.id.textview3);
        textView4=(TextView)findViewById(R.id.textview4);
        */

        row1=(LinearLayout)findViewById(R.id.row1);
        row2=(LinearLayout)findViewById(R.id.row2);
        button1=(Button)findViewById(R.id.button_1);
        button2=(Button)findViewById(R.id.button_2);
        button3=(Button)findViewById(R.id.button_3);
        button4=(Button)findViewById(R.id.button_4);

        //textView1.setText("width: "+width + ", height: " + height);
        /*
        ViewGroup.LayoutParams params1 = textView1.getLayoutParams();
        ViewGroup.LayoutParams params2 = textView2.getLayoutParams();
        ViewGroup.LayoutParams params3 = textView3.getLayoutParams();
        ViewGroup.LayoutParams params4 = textView3.getLayoutParams();
        */

        /*
        params1.width=(textViewDimen);
        params1.height=(textViewDimen);
        textView1.setLayoutParams(params1);

        params2.width=(textViewDimen);
        params2.height=(textViewDimen);
        textView2.setLayoutParams(params2);

        params3.width=(textViewDimen);
        params3.height=(textViewDimen);
        textView3.setLayoutParams(params3);

        params4.width=(textViewDimen);
        params4.height=(textViewDimen);
        textView4.setLayoutParams(params3);
        */

        ViewGroup.LayoutParams row1Lp = row1.getLayoutParams();
        if( row1Lp instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) row1Lp).topMargin = ((width-(textViewDimen*2))/2)-step/2;
            ((ViewGroup.MarginLayoutParams) row1Lp).leftMargin = ((width-(textViewDimen*2))/2)-step/2;
        }

        ViewGroup.LayoutParams row2Lp = row2.getLayoutParams();
        if( row1Lp instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) row2Lp).topMargin = step;
            ((ViewGroup.MarginLayoutParams) row2Lp).leftMargin = ((width-(textViewDimen*2))/2)-step/2;
        }



        // for button
        //LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
        LayoutParams params1 = new LayoutParams(textViewDimen,textViewDimen);
        //params2.setMargins(step, 0, 0, 0);
        button1.setLayoutParams(params1);

        LayoutParams params2 = new LayoutParams(textViewDimen,textViewDimen);
        params2.setMargins(step, 0, 0, 0);
        button2.setLayoutParams(params2);

        LayoutParams params3 = new LayoutParams(textViewDimen,textViewDimen);
        //params2.setMargins(step, 0, 0, 0);
        button3.setLayoutParams(params3);

        LayoutParams params4 = new LayoutParams(textViewDimen,textViewDimen);
        params4.setMargins(step, 0, 0, 0);
        button4.setLayoutParams(params4);
        /*
            LayoutParams lp = ((ViewGroup) something).getLayoutParams();
            if( lp instanceof MarginLayoutParams )
            {
                ((MarginLayoutParams) lp).topMargin = ...;
                ((MarginLayoutParams) lp).leftMargin = ...;
                //... etc
            }
            else
        */

        /*
        LayoutParams layoutParams;

        layoutParams=new LayoutParams(textViewDimen,textViewDimen);
        layoutParams.setMargins(step,0,0,0);
        textView2.setLayoutParams(layoutParams);

        layoutParams=new LayoutParams(textViewDimen,textViewDimen);
        layoutParams.setMargins(step,0,0,0);
        textView4.setLayoutParams(layoutParams);

        //layoutParams=new LayoutParams(textViewDimen,textViewDimen);
        //layoutParams.setMargins(step, step*2, 0, 0);
        //textView3.setLayoutParams(layoutParams);
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
