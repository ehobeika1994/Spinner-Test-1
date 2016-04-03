package org.me.myandroidstuff;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class SpinnerTest1Activity extends Activity implements OnItemSelectedListener
{
	private Spinner spinner1;
	private View mainView;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        spinner1 = (Spinner)findViewById(R.id.cSpinner);
        mainView = (View)findViewById(R.id.mainView);        
        
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                this, R.array.colours, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);        
        spinner1.setOnItemSelectedListener(this);
    }
    
	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,long arg3) 
	{
		// TODO Auto-generated method stub
		if (arg0 == spinner1)
		{
			String text = (String)spinner1.getSelectedItem();
			if (text.equals("RED"))
			{
				mainView.setBackgroundColor(Color.RED);
			}
			else
				if (text.equals("GREEN"))
				{
					mainView.setBackgroundColor(Color.GREEN);
				}
				else
					if (text.equals("BLUE"))
					{
						mainView.setBackgroundColor(Color.BLUE);						
					}
		}
		
	}
	@Override
	public void onNothingSelected(AdapterView<?> arg0) 
	{
		// Nothing implemented on this occasion
		
	}
}