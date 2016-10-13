package nyc.c4q.recyclerviewpractice.iceCream;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public class IceCreamAdapter extends RecyclerView.Adapter {

    private List<String> mData;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup xmlParent, int viewType) {
        return new IceCreamViewHolder(xmlParent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        IceCreamViewHolder thingToAddDataTo = (IceCreamViewHolder) holder;
        String dataToDisplay = mData.get(position);
        thingToAddDataTo.getTextView().setText(dataToDisplay);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setData(List<String> data) {
        mData = data;
    }
}
