package gui.ceng.mu.edu.tr.week2lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {

    final List<Animal> animalList = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        animalList.add(new Animal("Ant", R.mipmap.ant));
        animalList.add(new Animal("Bear", R.mipmap.bear));
        animalList.add(new Animal("Bird", R.mipmap.bird));
        animalList.add(new Animal("Cat", R.mipmap.cat));
        animalList.add(new Animal("Dog", R.mipmap.dog));
        animalList.add(new Animal("Donkey", R.mipmap.donkey));
        animalList.add(new Animal("Elephant", R.mipmap.elephant));
        animalList.add(new Animal("Giraffe", R.mipmap.giraffe));
        animalList.add(new Animal("Goat", R.mipmap.goat));
        animalList.add(new Animal("Monkey", R.mipmap.monkey));
        animalList.add(new Animal("Pig", R.mipmap.pig));
        animalList.add(new Animal("Rat", R.mipmap.rat));
        animalList.add(new Animal("Snake", R.mipmap.snake));
        animalList.add(new Animal("Spider", R.mipmap.spider));



        final ListView listview = findViewById(R.id.listview);

        AnimalAdapter animalAdapter = new AnimalAdapter(this,animalList);
        listview.setAdapter(animalAdapter);
    }
}