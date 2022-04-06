package android.example.englishforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One", "Bir"))
        words.add(new Word("Two", "Ikki"))
        words.add(new Word("Three", "Uch"))
        words.add(new Word("Four", "To`rt")) 
        words.add(new Word("Five", "Besh"))
        words.add(new Word("Six", "olti"))
        words.add(new Word("Seven", "Yetti"))
        words.add(new Word("Eight", "Sakkiz"))
        words.add(new Word("Nine", "To`qqiz")) 
        words.add(new Word("Ten", "O`n"))
            

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }
}
