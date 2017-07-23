package com.example.android.usbstorageaccess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    UsbCommunicationManager usb = null;
    String returnValue = "";
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //performFileSearch();
        tv = (TextView) findViewById(R.id.textView);
        if(usb == null)
        {
            usb = new UsbCommunicationManager(this);
            usb.connect();
            returnValue += "Trying to establish connection";
            tv.setText(returnValue);
        }
        returnValue += usb.listUsbDevices();
        tv.setText(returnValue);
        StringBuilder data = new StringBuilder();
        tv.setText("Here!!");
        usb.read(data);
        returnValue += data.toString();
        tv.setText(returnValue);
        }
}
    /*


    private static final int READ_REQUEST_CODE = 42;
    /**
     * Fires an intent to spin up the "file chooser" UI and select an image.
     */

    /*
    public void performFileSearch() {

        // ACTION_OPEN_DOCUMENT is the intent to choose a file via the system's file
        // browser.
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);

        // Filter to only show results that can be "opened", such as a
        // file (as opposed to a list of contacts or timezones)
        intent.addCategory(Intent.CATEGORY_OPENABLE);

        // Filter to show only images, using the image MIME data type.
        // If one wanted to search for ogg vorbis files, the type would be "audio/ogg".
        // To search for all documents available via installed storage providers,
        // it would be "*/
            /*
        intent.setType("image/*");

        startActivityForResult(intent, READ_REQUEST_CODE);
        */


