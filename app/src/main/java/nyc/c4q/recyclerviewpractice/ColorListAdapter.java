package nyc.c4q.recyclerviewpractice;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;
import static android.support.v7.widget.RecyclerView.ViewHolder;

public class ColorListAdapter extends RecyclerView.Adapter {

    private List<Integer> mColorList = Arrays.asList(
            0xFFFF0000,
            0xFF00FF00,
            0xFF0000FF,
            0xFF123456,
            0xFF654321,
            0xFFFF6677,
            0xFF123654,
            0xFFFF0000,
            0xFF00FF00,
            0xFF0000FF,
            0xFF123456,
            0xFF654321,
            0xFFFF6677,
            0xFF123654
    );

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ColorViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ColorViewHolder colorHolder = (ColorViewHolder) holder;
        Integer holderColor = mColorList.get(position);
        colorHolder.bind(holderColor);
    }

    @Override
    public int getItemCount() {
        return mColorList.size();
    }
}
