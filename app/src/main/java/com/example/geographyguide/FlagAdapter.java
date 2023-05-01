package com.example.geographyguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class  FlagAdapter  extends RecyclerView.Adapter<FlagAdapter.ViewHolder> {
    // поля адаптера
    private final LayoutInflater inflater; // поле для трансформации layout-файла во View-элемент
    private final List<Flags> flag; // поле коллекции контейнера для хранения данных

    // конструктор адаптера
    public FlagAdapter(Context context, List<Flags> flag) {
        this.inflater = LayoutInflater.from(context);
        this.flag = flag;
    }

    // метод onCreateViewHolder()
    @Override
    public FlagAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false); // трансформация layout-файла во View-элемент
        return new ViewHolder(view);
    }

    // метод onBindViewHolder()
    @Override
    public void onBindViewHolder(FlagAdapter.ViewHolder holder, int position) {
        Flags flags = flag.get(position);
        holder.flagsView.setImageResource(flags.getResource());
        holder.nameView.setText(flags.getName());
        holder.descriptionView.setText(flags.getDescription());
        holder.squareView.setText(flags.getSquare());
    }

    // метод getItemCount() возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return flag.size();
    }

    // созданный статический класс ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {

        // неизменяемые поля представления
        final ImageView flagsView;
        final TextView nameView, descriptionView, squareView;

        // конструктор класса ViewHolder с помощью которого мы связываем поля и представление list_item.xml
        ViewHolder(View view) {
            super(view);
           flagsView = view.findViewById(R.id.resource);
           nameView = view.findViewById(R.id.name);
           descriptionView = view.findViewById(R.id.description);
           squareView = view.findViewById(R.id.square);
        }
    }
}
