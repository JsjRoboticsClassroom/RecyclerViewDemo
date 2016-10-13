package nyc.c4q.recyclerviewpractice.iceCream;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import nyc.c4q.recyclerviewpractice.R;

public class IceCreamViewHolder extends RecyclerView.ViewHolder {
    private final TextView mTextView;

    public IceCreamViewHolder(ViewGroup viewGroup) {
        super(inflateView(viewGroup));
        mTextView = (TextView) itemView.findViewById(R.id.ice_cream_flavor);
    }

    public TextView getTextView(){
        return mTextView;
    }

    private static View inflateView(ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        return inflater.inflate(R.layout.ice_cream_holder, viewGroup, false );
    }
}
