package app.inuk.drinkorderer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class DrinksView
        extends RecyclerView.Adapter<DrinksView.DrinksViewHolder> {

    private String[] mDataset;

    public static class DrinksViewHolder
            extends RecyclerView.ViewHolder {
        public TextView textView;
        public DrinksViewHolder(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.DrinksName);
        }
    }

    public DrinksView(String[] dataset) {
        mDataset = dataset;
    }

    @Override
    public DrinksView.DrinksViewHolder
    onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.drinks_view, parent, false);

        return new DrinksViewHolder(v);
    }

    @Override
    public void onBindViewHolder(DrinksViewHolder holder, int position) {
        holder.textView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
