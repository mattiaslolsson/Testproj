package testprojpackage.com;

//import java.net.URL;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import android.app.Activity;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import org.xml.sax.InputSource;

public class TestprojActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
      
        final Button button = (Button) findViewById(R.id.bt_next);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Perform action on clicks
            	try {

            		/** Handling XML */
            	/*SAXParserFactory spf = SAXParserFactory.newInstance();
            	SAXParser sp = spf.newSAXParser();
            	XMLReader xr = sp.getXMLReader();
            	*/
            	//URL sourceUrl = new URL(
            	//"/home/mattias/Development/database.xml");
            	
            	/** Create handler to handle XML Tags ( extends DefaultHandler ) */
            	/*DefaultHandler myXMLHandler = new DefaultHandler();
            
            	xr.setContentHandler(myXMLHandler);
            	xr.parse(new InputSource("database.xml"));

            	
            	TextView text = (TextView) findViewById(R.id.textView3);
            	text.setText(xr.toString());*/
            		
            		//XmlResourceParser xrp = this.getResources().getXml(R.xml.test);
            		
            	  } catch (Exception e) {
            	    	System.out.println("XML Pasing Exception = " + e);
            	    	}
            }
    });
}}