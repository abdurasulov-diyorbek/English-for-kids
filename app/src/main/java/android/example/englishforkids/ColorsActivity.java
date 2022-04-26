package android.example.englishforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Red", "qizil"));
        words.add(new Word("Yellow", "sariq"));
        words.add(new Word("green", "yashil"));
        words.add(new Word("brown", "jigarrang")) ;
        words.add(new Word("gray", "gray"));
        words.add(new Word("black", "qora"));
        words.add(new Word("white", "oq"));
        words.add(new Word("orange", "sabzirang"));
        words.add(new Word("purple", "pushti"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}