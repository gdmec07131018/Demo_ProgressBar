package cn.edu.gdmec.s07131018.demo_progressbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends Activity {
	private ProgressBar pb1,pb2,pb3,pb4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb1 = (ProgressBar) findViewById(R.id.progressBar1);
        pb2 = (ProgressBar) findViewById(R.id.progressBar2);
        pb3 = (ProgressBar) findViewById(R.id.progressBar3);
        pb4 = (ProgressBar) findViewById(R.id.progressBar4);
        
        pb4.setMax(200);
        pb4.setProgress(100);
        
        pb1.setVisibility(View.VISIBLE);
        pb2.setVisibility(View.GONE);
        pb3.setVisibility(View.INVISIBLE);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
