package nyc.c4q.recyclerviewpractice.iceCream;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

import nyc.c4q.recyclerviewpractice.R;

public class IceCreamActivity extends Activity {

    private RecyclerView recyclerView;

    private List<String> mFlavors = Arrays.asList(
            "Chocolate",
            "Vanilla",
            "Peanut Butter",
            "Pistachio",
            "Coconut",
            "CheeseBurger",
            "Corn",
            "Red Bean",
            "Green Tea",
            "Butter Pecan"
    );
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ice_cream_activity);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        IceCreamAdapter adapter = new IceCreamAdapter();
        adapter.setData(mFlavors);
        recyclerView.setAdapter(adapter);
    }
}
