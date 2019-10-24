package com.example.wayang;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;

        import com.example.wayang.adapters.WayangAdapter;
        import com.example.wayang.model.WayangModel;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvWayangModel;
    //instansiasi list superhero
    List<WayangModel> wayangList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menyambungkan rvSuperHero ke layout
        rvWayangModel = findViewById(R.id.rvWayangModel);
        //Membuat object hero
        WayangModel wayang = new WayangModel("Semar", this.getResources().getDrawable(R.drawable.semar));
        //menambahkan hero ke listSuperHero
        wayangList.add(wayang);
        //membuat object hero baru
        wayang = new WayangModel("Gareng",this.getResources().getDrawable(R.drawable.gareng));
        //menambahkan hero baru ke listSuperhero
        wayangList.add(wayang);
        //Instansiasi Adapter
        WayangAdapter wayangAdapter = new WayangAdapter(wayangList);
        //set adapter dan layoutmanager
        rvWayangModel.setAdapter(wayangAdapter);
        rvWayangModel.setLayoutManager(new LinearLayoutManager(this));
    }
}
