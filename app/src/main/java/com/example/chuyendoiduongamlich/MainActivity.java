package com.example.chuyendoiduongamlich;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtduonglich, edtnamamlich,etMenh, etNhuan;
    Button Chuyen,Tiep,Thoat;
    TextView txtamlich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtduonglich = findViewById(R.id.edtduonglich);
        Chuyen = findViewById(R.id.BtnChuyen);
        edtnamamlich = findViewById(R.id.edtnamamlich);
        etMenh = findViewById(R.id.etMenh);
        etNhuan = findViewById(R.id.etNhuan);
        Chuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtduonglich.getText().toString().isEmpty()) {
                    Toast.makeText(getApplication(), "Vui Lòng Nhập Đủ Nam", Toast.LENGTH_LONG).show();
                } else {
                    String can = "", chi = "", thienCan = "", diaChi = "", menh = "";
                    int iThienCan = 0, iDiachi = 0, iMenh = 0;
                    int namduong = Integer.parseInt(edtduonglich.getText().toString());
                    switch (namduong % 10) {
                        case 0:
                            can = "Canh";
                            iThienCan = 4;
                            break;
                        case 1:
                            can = "Tân";
                            iThienCan = 4;
                            break;
                        case 2:
                            can = "Nhâm";
                            iThienCan = 5;
                            break;
                        case 3:
                            can = "Quý";
                            iThienCan = 5;
                            break;
                        case 4:
                            can = "Giáp";
                            iThienCan = 1;
                            break;
                        case 5:
                            can = "Ất";
                            iThienCan = 1;
                            break;
                        case 6:
                            can = "Bính";
                            iThienCan = 2;
                            break;
                        case 7:
                            can = "Đinh";
                            iThienCan = 2;
                            break;
                        case 8:
                            can = "Mậu";
                            iThienCan = 3;
                            break;
                        case 9:
                            can = "Kỷ";
                            iThienCan = 3;
                            break;
                    }
                    switch (namduong % 12) {
                        case 0:
                            chi = "Thân";
                            iDiachi = 1;
                            break;
                        case 1:
                            chi = "Dậu";
                            iDiachi = 1;
                            break;
                        case 2:
                            chi = "Tuất";
                            iDiachi = 2;
                            break;
                        case 3:
                            chi = "Hợi";
                            iDiachi = 2;
                            break;
                        case 4:
                            chi = "Tý";
                            iDiachi = 0;
                            break;
                        case 5:
                            chi = "Sửu";
                            iDiachi = 0;
                            break;
                        case 6:
                            chi = "Dần";
                            iDiachi = 1;
                            break;
                        case 7:
                            chi = "Mẹo";
                            iDiachi = 1;
                            break;
                        case 8:
                            chi = "Thìn";
                            iDiachi = 2;
                            break;
                        case 9:
                            chi = "Tỵ";
                            iDiachi = 2;
                            break;
                        case 10:
                            chi = "Ngọ";
                            iDiachi = 0;
                            break;
                        case 11:
                            chi = "Mùi";
                            iDiachi = 0;
                            break;
                    }
                    iMenh = iThienCan + iDiachi;
                    if(iMenh>5) iMenh-=5;

                    switch(iMenh){
                        case 1: menh = "Kim"; break;
                        case 2: menh = "Thủy"; break;
                        case 3: menh = "Hỏa"; break;
                        case 4: menh = "Thổ"; break;
                        case 5: menh = "Mộc"; break;
                    }

                    if(Integer.parseInt(edtduonglich.getText().toString())%4 == 0) etNhuan.setText("Năm nhuận");
                    else etNhuan.setText("Năm không nhuận");

                    etMenh.setText(String.valueOf(menh));
                    edtnamamlich.setText(can + " " + chi);
                }
            }
        });
        Tiep = findViewById(R.id.BtnTiep);
        Thoat = findViewById(R.id.BtnThoat);
        edtnamamlich = findViewById(R.id.edtnamamlich);
        Tiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnamamlich.setText("");
                edtduonglich.setText("");
                etNhuan.setText("");
                etMenh.setText("");
            }
        });
        Thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}