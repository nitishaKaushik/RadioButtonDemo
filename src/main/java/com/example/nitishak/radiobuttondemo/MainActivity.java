package com.example.nitishak.radiobuttondemo;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static RadioGroup radio_g;
    // private static  RadioButton radio1,radio2,radio3;
    private static  RadioButton radio;

    private static Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickListner();
    }
    public void onClickListner(){
        radio_g =(RadioGroup)findViewById(R.id.radioGroup);
        // radio1 = (RadioButton)findViewById(R.id.radioButton);
        //radio2 =(RadioButton)findViewById(R.id.radioButton2);
        // radio3 = (RadioButton)findViewById(R.id.radioButton3);
        btn =(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radio_g.getCheckedRadioButtonId();
                radio = (RadioButton)findViewById(selectedId);
                Toast.makeText(MainActivity.this,radio.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
