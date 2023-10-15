package gui.ceng.mu.edu.tr.week2lab;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AnimalAdapter extends BaseAdapter {

    private LayoutInflater layoutInflater;
    private List<Animal> animallist;

    public AnimalAdapter(Activity activity, List<Animal> animals) {
        layoutInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        this.animallist = animals;
    }

    @Override
    public int getCount() {
        return animallist.size();
    }

    @Override
    public Object getItem(int position) {
        return animallist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View rowView = layoutInflater.inflate(R.layout.listview_row, null);
        TextView textView = rowView.findViewById(R.id.label);
        ImageView imageView = rowView.findViewById(R.id.pic);

        Animal animal = animallist.get(position);
        textView.setText(animal.getType());
        imageView.setImageResource(animal.getPicId());

        return rowView;
    }
}
