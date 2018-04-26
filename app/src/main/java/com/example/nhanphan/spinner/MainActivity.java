package com.example.nhanphan.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    TextView text;
    Spinner spin;
    String[] arr = { "Khoa Quản Trị Kinh Doanh",
            "Khoa Kế Toán Kiểm Toán",
            "Khoa Tài Chính - Ngân hàng",
            "Khoa Kinh Tế và Luật",
            "Khoa Công Nghệ Thông Tin",
            "Khoa Công Nghệ Sinh Học",
            "Khoa Xây Dựng và Điện",
            "Khoa Ngoại Ngữ"}; // tạo ra 1 mảng chứa các giá trị muốn show
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textTitle);
        spin = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> list = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, arr); // lấy giá trị mảng arr bỏ vào 1 ArrayAdapter với dạng simple_spinner_dropdown_item là dạng xổ xuống

        spin.setAdapter(list); // bỏ cái list đó vào spin ( spin là Spinner được tạo ở trên)

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // này có tác dụng xổ xuống và lúc mình nhấn chọn giá trị thì hành động tiếp theo sẽ được thực hiện
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                text.setText(arr[position]); // gán cho textview giá trị là giá trị mảng arr ở vị trí position mà positon ở đây đc tự  hiểu là giá trị mình chọn cái position này k cần code
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}


