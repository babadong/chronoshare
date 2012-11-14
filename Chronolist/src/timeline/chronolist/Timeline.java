package timeline.chronolist;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Timeline extends Activity {
	
	//TESTING
	//TESTING
	//TESTING
	
	//THIS IS A TEST
	
	//THIS DOES NOTHING
	
	//BECAUSE IT IS A TEST
	
	//HI THIS IS A TEST BACK FROM BEN

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_timeline, menu);
        return true;
    }
    
  boolean cow;
}
