package com.example.listfood;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[]={"Cơm tấm Vườn chuối","Tiệm ăn Chợ Lớn","Quán chay Phước Vegan","Cơm chay Đà Nẵng","Quán ngon Đà Thành","Cơm gà xối mỡ","Cơm tấm Hà Nội"};
    String mDescription[]={"216 Hải Phòng","94 Ông Ích Khêm","02 Thanh Sơn","Sơn Trà - Đà Nẵng","233 Ngô Quyền","12 Cao Thắng","93 Thanh Hải"};
    int images[]={R.drawable.pic5,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic5,R.drawable.pic1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Toast.makeText(MainActivity.this, "Cơm 1 Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(MainActivity.this, "Cơm 2 Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(MainActivity.this, "Cơm 3 Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(MainActivity.this, "Cơm 4 Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(MainActivity.this, "Cơm 5 Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(MainActivity.this, "Cơm 6 Description", Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(MainActivity.this, "Cơm 7 Description", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row_list, R.id.txttitle, title);
            this.context =c;
            this.rTitle= title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row_list, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.txttitle);
            TextView myDescription = row.findViewById(R.id.txtadr);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);
            return row;
        }
    }

}