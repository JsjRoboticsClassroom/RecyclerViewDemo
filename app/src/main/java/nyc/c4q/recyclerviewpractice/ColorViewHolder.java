package nyc.c4q.recyclerviewpractice;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ColorViewHolder extends RecyclerView.ViewHolder {
    private final View mView;

    public ColorViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        mView = itemView;
    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.color_view_holder, parent, false);
    }

    public void bind(Integer holderColor) {
        mView.setBackgroundColor(holderColor);
    }
}
