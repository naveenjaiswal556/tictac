package com.nj.tictacnj;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    Button c1,c2,c3,c4,c5,c6,c7,c8,c9,st,rt;
    TextView t1;
    int t;
    final char ply2 = 'X', ply1 = 'O';




    public void check(){

        if (c1.getText() == ""+ply1&&c2.getText() == ""+ply1&&c3.getText() == ""+ply1){
            t1.setText("'O' Player Win... :)");
            Intent yo = new Intent(MainActivity.this,winsh.class);
            yo.putExtra("win",1);
            startActivity(yo);
        }else if (c4.getText() == ""+ply1&&c5.getText() == ""+ply1&&c6.getText() == ""+ply1){
            t1.setText("'O' Player Win... :)");
            Intent yo = new Intent(MainActivity.this,winsh.class);
            yo.putExtra("win",1);
            startActivity(yo);
        }else if (c7.getText() == ""+ply1&&c8.getText() == ""+ply1&&c9.getText() == ""+ply1){
            t1.setText("'O' Player Win... :)");
            Intent yo = new Intent(MainActivity.this,winsh.class);
            yo.putExtra("win",1);
            startActivity(yo);
        }else if (c1.getText() == ""+ply1&&c4.getText() == ""+ply1&&c7.getText() == ""+ply1){
            t1.setText("'O' Player Win... :)");
            Intent yo = new Intent(MainActivity.this,winsh.class);
            yo.putExtra("win",1);
            startActivity(yo);
        }else if (c2.getText() == ""+ply1&&c5.getText() == ""+ply1&&c8.getText() == ""+ply1){
            t1.setText("'O' Player Win... :)");
            Intent yo = new Intent(MainActivity.this,winsh.class);
            yo.putExtra("win",1);
            startActivity(yo);
        }else if (c3.getText() == ""+ply1&&c6.getText() == ""+ply1&&c9.getText() == ""+ply1){
            t1.setText("'O' Player Win... :)");
            Intent yo = new Intent(MainActivity.this,winsh.class);
            yo.putExtra("win",1);
            startActivity(yo);
        }else if (c3.getText() == ""+ply1&&c5.getText() == ""+ply1&&c7.getText() == ""+ply1){
            t1.setText("'O' Player Win... :)");
            Intent yo = new Intent(MainActivity.this,winsh.class);
            yo.putExtra("win",1);
            startActivity(yo);
        }else if (c1.getText() == ""+ply1&&c5.getText() == ""+ply1&&c9.getText() == ""+ply1){
            t1.setText("'O' Player Win... :)");
            Intent yo = new Intent(MainActivity.this,winsh.class);
            yo.putExtra("win",1);
            startActivity(yo);
        }else if (c1.getText() == ""+ply2&&c2.getText() == ""+ply2&&c3.getText() == ""+ply2){
            t1.setText("'X' Player Win... :)");
            Intent yo = new Intent(MainActivity.this,winsh.class);
            yo.putExtra("win",2);;
            startActivity(yo);
        }else if (c4.getText() == ""+ply2&&c5.getText() == ""+ply2&&c6.getText() == ""+ply2){
            t1.setText("'X' Player Win... :)");
            Intent yo = new Intent(MainActivity.this,winsh.class);
            yo.putExtra("win",2);
            startActivity(yo);
        }else if (c7.getText() == ""+ply2&&c8.getText() == ""+ply2&&c9.getText() == ""+ply2){
            t1.setText("'X' Player Win... :)");
            Intent yo = new Intent(MainActivity.this,winsh.class);
            yo.putExtra("win",2);
            startActivity(yo);
        }else if (c1.getText() == ""+ply2&&c4.getText() == ""+ply2&&c7.getText() == ""+ply2){
            t1.setText("'X' Player Win... :)");
            Intent yo = new Intent(MainActivity.this,winsh.class);
            yo.putExtra("win",2);
            startActivity(yo);
        }else if (c2.getText() == ""+ply2&&c5.getText() == ""+ply2&&c8.getText() == ""+ply2){
            t1.setText("'X' Player Win... )");
            Intent yo = new Intent(MainActivity.this,winsh.class);
            yo.putExtra("win",2);
            startActivity(yo);
        }else if (c3.getText() == ""+ply2&&c6.getText() == ""+ply2&&c9.getText() == ""+ply2){
            t1.setText("'X' Player Win... :)");
            Intent yo = new Intent(MainActivity.this,winsh.class);
            yo.putExtra("win",2);
            startActivity(yo);
        }else if (c3.getText() == ""+ply2&&c5.getText() == ""+ply2&&c7.getText() == ""+ply2){
            t1.setText("'X' Player Win... :)");
            Intent yo = new Intent(MainActivity.this,winsh.class);
            yo.putExtra("win",2);
            startActivity(yo);
        }else if (c1.getText() == ""+ply2&&c5.getText() == ""+ply2&&c9.getText() == ""+ply2){
            t1.setText("'X' Player Win... :)");
            Intent yo = new Intent(MainActivity.this,winsh.class);
            yo.putExtra("win",2);
            startActivity(yo);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = (Button) findViewById(R.id.b1);
        c2 = (Button) findViewById(R.id.b2);
        c3 = (Button) findViewById(R.id.b3);
        c4 = (Button) findViewById(R.id.b4);
        c5 = (Button) findViewById(R.id.b5);
        c6 = (Button) findViewById(R.id.b6);
        c7 = (Button) findViewById(R.id.b7);
        c8 = (Button) findViewById(R.id.b8);
        c9 = (Button) findViewById(R.id.b9);
        st = (Button) findViewById(R.id.stt);
        t1 = (TextView) findViewById(R.id.tv);
        rt = (Button) findViewById(R.id.rst);




        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c1.getText()==st.getText()) {
                    if (t == 1) {
                        t = 2;
                        c1.setText("" + ply1);
                    } else {
                        t = 1;
                        c1.setText("" + ply2);
                    }
                }else{
                    t1.setText("It's Already Used... :|");
                }


                check();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (c2.getText()==st.getText()) {
                    if (t == 1) {
                        t = 2;
                        c2.setText("" + ply1);
                    } else {
                        t = 1;
                        c2.setText("" + ply2);
                    }
                }else{
                    t1.setText("It's Already Used... :|");
                }

                check();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (c3.getText()==st.getText()) {
                    if (t == 1) {
                        t = 2;
                        c3.setText("" + ply1);
                    } else {
                        t = 1;
                        c3.setText("" + ply2);
                    }
                }else{
                    t1.setText("It's Already Used... :|");
                }

                check();
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (c4.getText()==st.getText()) {
                    if (t == 1) {
                        t = 2;
                        c4.setText("" + ply1);
                    } else {
                        t = 1;
                        c4.setText("" + ply2);
                    }
                }else{
                    t1.setText("It's Already Used... :|");
                }

                check();
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (c5.getText()==st.getText()) {
                    if (t == 1) {
                        t = 2;
                        c5.setText("" + ply1);
                    } else {
                        t = 1;
                        c5.setText("" + ply2);
                    }
                }else{
                    t1.setText("It's Already Used... :|");
                }

                check();
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (c6.getText()==st.getText()) {
                    if (t == 1) {
                        t = 2;
                        c6.setText("" + ply1);
                    } else {
                        t = 1;
                        c6.setText("" + ply2);
                    }
                }else{
                    t1.setText("It's Already Used... :|");
                }

                check();
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (c7.getText()==st.getText()) {
                    if (t == 1) {
                        t = 2;
                        c7.setText("" + ply1);
                    } else {
                        t = 1;
                        c7.setText("" + ply2);
                    }
                }else{
                    t1.setText("It's Already Used... :|");
                }

                check();
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (c8.getText()==st.getText()) {
                    if (t == 1) {
                        t = 2;
                        c8.setText("" + ply1);
                    } else {
                        t = 1;
                        c8.setText("" + ply2);
                    }
                }else{
                    t1.setText("It's Already Used... :|");
                }

                check();
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (c9.getText()==st.getText()) {
                    if (t == 1) {
                        t = 2;
                        c9.setText("" + ply1);
                    } else {
                        t = 1;
                        c9.setText("" + ply2);
                    }
                }else{
                    t1.setText("It's Already Used... :|");
                }

                check();
            }
        });
        rt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c1.setText(st.getText());
                c2.setText(st.getText());
                c3.setText(st.getText());
                c4.setText(st.getText());
                c5.setText(st.getText());
                c6.setText(st.getText());
                c7.setText(st.getText());
                c8.setText(st.getText());
                c9.setText(st.getText());
                t=2;
                t1.setText("Welcome Again");
            }
        });

    }
}
