package lifecounter.wyliao.washington.edu.lifecounter;

import android.app.ActionBar;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;



public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    int addedPlayerNum = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        LayoutInflater mInflater = LayoutInflater.from(this);
        View contentView = mInflater.inflate(R.layout.activity_main,null);
//
        LinearLayout root = (LinearLayout) contentView.findViewById(R.id.main);
        root.getWidth();
        int cellHigh = root.getHeight()/4;
        Log.i("Wen", String.valueOf(root.getHeight()));
//
//        RelativeLayout player1 = (RelativeLayout) contentView.findViewById(R.id.player1);
//        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,20);
//        player1.setLayoutParams(params);
        //params.width = cellHigh;
        setContentView(R.layout.activity_main);



        //control

        Button onePlus = (Button) findViewById(R.id.btnPlus1);
        onePlus.setOnClickListener(this);
        Button onePlusFive1 = (Button) findViewById(R.id.btnPlusFive1);
        onePlusFive1.setOnClickListener(this);
        Button oneMinus = (Button) findViewById(R.id.btnMinus1);
        oneMinus.setOnClickListener(this);
        Button oneMinusFive1 = (Button) findViewById(R.id.btnMinusFive1);
        oneMinusFive1.setOnClickListener(this);

        Button onePlus2 = (Button) findViewById(R.id.btnPlus2);
        onePlus2.setOnClickListener(this);
        Button onePlusFive2 = (Button) findViewById(R.id.btnPlusFive2);
        onePlusFive2.setOnClickListener(this);
        Button oneMinus2 = (Button) findViewById(R.id.btnMinus2);
        oneMinus2.setOnClickListener(this);
        Button oneMinusFive2 = (Button) findViewById(R.id.btnMinusFive2);
        oneMinusFive2.setOnClickListener(this);

        Button onePlus3 = (Button) findViewById(R.id.btnPlus3);
        onePlus3.setOnClickListener(this);
        Button onePlusFive3 = (Button) findViewById(R.id.btnPlusFive3);
        onePlusFive3.setOnClickListener(this);
        Button oneMinus3 = (Button) findViewById(R.id.btnMinus3);
        oneMinus3.setOnClickListener(this);
        Button oneMinusFive3 = (Button) findViewById(R.id.btnMinusFive3);
        oneMinusFive3.setOnClickListener(this);

        Button onePlus4 = (Button) findViewById(R.id.btnPlus4);
        onePlus4.setOnClickListener(this);
        Button onePlusFive4 = (Button) findViewById(R.id.btnPlusFive4);
        onePlusFive4.setOnClickListener(this);
        Button oneMinus4 = (Button) findViewById(R.id.btnMinus4);
        oneMinus4.setOnClickListener(this);
        Button oneMinusFive4 = (Button) findViewById(R.id.btnMinusFive4);
        oneMinusFive4.setOnClickListener(this);

        Button onePlus5 = (Button) findViewById(R.id.btnPlus5);
        onePlus5.setOnClickListener(this);
        Button onePlusFive5 = (Button) findViewById(R.id.btnPlusFive5);
        onePlusFive5.setOnClickListener(this);
        Button oneMinus5 = (Button) findViewById(R.id.btnMinus5);
        oneMinus5.setOnClickListener(this);
        Button oneMinusFive5 = (Button) findViewById(R.id.btnMinusFive5);
        oneMinusFive5.setOnClickListener(this);

        Button onePlus6 = (Button) findViewById(R.id.btnPlus6);
        onePlus6.setOnClickListener(this);
        Button onePlusFive6 = (Button) findViewById(R.id.btnPlusFive6);
        onePlusFive6.setOnClickListener(this);
        Button oneMinus6 = (Button) findViewById(R.id.btnMinus6);
        oneMinus6.setOnClickListener(this);
        Button oneMinusFive6 = (Button) findViewById(R.id.btnMinusFive6);
        oneMinusFive6.setOnClickListener(this);

        Button onePlus7 = (Button) findViewById(R.id.btnPlus7);
        onePlus7.setOnClickListener(this);
        Button onePlusFive7 = (Button) findViewById(R.id.btnPlusFive7);
        onePlusFive7.setOnClickListener(this);
        Button oneMinus7 = (Button) findViewById(R.id.btnMinus7);
        oneMinus7.setOnClickListener(this);
        Button oneMinusFive7 = (Button) findViewById(R.id.btnMinusFive7);
        oneMinusFive7.setOnClickListener(this);

        Button onePlus8 = (Button) findViewById(R.id.btnPlus8);
        onePlus8.setOnClickListener(this);
        Button onePlusFive8 = (Button) findViewById(R.id.btnPlusFive8);
        onePlusFive8.setOnClickListener(this);
        Button oneMinus8 = (Button) findViewById(R.id.btnMinus8);
        oneMinus8.setOnClickListener(this);
        Button oneMinusFive8 = (Button) findViewById(R.id.btnMinusFive8);
        oneMinusFive8.setOnClickListener(this);

        Button addPlayerBtn = (Button) findViewById(R.id.addPlayer);
        addPlayerBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        //Add player btn
        int idTag = v.getId();

        if(idTag== R.id.addPlayer) {
            addedPlayerNum++;
            Log.i("Wen","test");
            ViewGroup viewGroup;
            LinearLayout player;
            switch (addedPlayerNum) {
                case 5:
                    viewGroup = (ViewGroup) v.getParent();
                    player = (LinearLayout) viewGroup.findViewById(R.id.player5);
                    player.setVisibility(View.VISIBLE);
                    break;
                case 6:
                    viewGroup = (ViewGroup) v.getParent();
                    player = (LinearLayout) viewGroup.findViewById(R.id.player6);
                    player.setVisibility(View.VISIBLE);
                    break;
                case 7:
                    viewGroup = (ViewGroup) v.getParent();
                    player = (LinearLayout) viewGroup.findViewById(R.id.player7);
                    player.setVisibility(View.VISIBLE);
                    break;
                case 8:
                    viewGroup = (ViewGroup) v.getParent();
                    player = (LinearLayout) viewGroup.findViewById(R.id.player8);
                    player.setVisibility(View.VISIBLE);
                    break;
            }
            return;

        }

        Log.i("Wen","Get in");

        int tag =0;
        int change =0;
        int playerNum =0;
        switch (idTag) {
            case R.id.btnPlus1:
                change = 1;
                tag = R.id.life1;
                playerNum =1;
                break;
            case R.id.btnPlusFive1:
                change = 5;
                tag = R.id.life1;
                playerNum =1;
                break;
            case R.id.btnMinus1:
                change = -1;
                tag = R.id.life1;
                playerNum =1;
                break;
            case R.id.btnMinusFive1:
                change = -5;
                tag = R.id.life1;
                playerNum =1;
                break;

            case R.id.btnPlus2:
                change = 1;
                tag = R.id.life2;
                playerNum =2;
                break;
            case R.id.btnPlusFive2:
                change = 5;
                tag = R.id.life2;
                playerNum =2;
                break;
            case R.id.btnMinus2:
                change = -1;
                tag = R.id.life2;
                playerNum =2;
                break;
            case R.id.btnMinusFive2:
                change = -5;
                tag = R.id.life2;
                playerNum =2;
                break;

            case R.id.btnPlus3:
                change = 1;
                tag = R.id.life3;
                playerNum =3;
                break;
            case R.id.btnPlusFive3:
                change = 5;
                tag = R.id.life3;
                playerNum =3;
                break;
            case R.id.btnMinus3:
                change = -1;
                tag = R.id.life3;
                playerNum =3;
                break;
            case R.id.btnMinusFive3:
                change = -5;
                tag = R.id.life3;
                playerNum =3;
                break;

            case R.id.btnPlus4:
                change = 1;
                tag = R.id.life4;
                playerNum =4;
                break;
            case R.id.btnPlusFive4:
                change = 5;
                tag = R.id.life4;
                playerNum =4;
                break;
            case R.id.btnMinus4:
                change = -1;
                tag = R.id.life4;
                playerNum =4;
                break;
            case R.id.btnMinusFive4:
                change = -5;
                tag = R.id.life4;
                playerNum =4;
                break;

            case R.id.btnPlus5:
                change = 1;
                tag = R.id.life5;
                playerNum =5;
                break;
            case R.id.btnPlusFive5:
                change = 5;
                tag = R.id.life5;
                playerNum =5;
                break;
            case R.id.btnMinus5:
                change = -1;
                tag = R.id.life5;
                playerNum =5;
                break;
            case R.id.btnMinusFive5:
                change = -5;
                tag = R.id.life5;
                playerNum =5;
                break;

            case R.id.btnPlus6:
                change = 1;
                tag = R.id.life6;
                playerNum =6;
                break;
            case R.id.btnPlusFive6:
                change = 5;
                tag = R.id.life6;
                playerNum =6;
                break;
            case R.id.btnMinus6:
                change = -1;
                tag = R.id.life6;
                playerNum =6;
                break;
            case R.id.btnMinusFive6:
                change = -5;
                tag = R.id.life6;
                playerNum =6;
                break;

            case R.id.btnPlus7:
                change = 1;
                tag = R.id.life7;
                playerNum =7;
                break;
            case R.id.btnPlusFive7:
                change = 5;
                tag = R.id.life7;
                playerNum =7;
                break;
            case R.id.btnMinus7:
                change = -1;
                tag = R.id.life7;
                playerNum =7;
                break;
            case R.id.btnMinusFive7:
                change = -5;
                tag = R.id.life7;
                playerNum =7;
                break;

            case R.id.btnPlus8:
                change = 1;
                tag = R.id.life8;
                playerNum =8;
                break;
            case R.id.btnPlusFive8:
                change = 5;
                tag = R.id.life8;
                playerNum =8;
                break;
            case R.id.btnMinus8:
                change = -1;
                tag = R.id.life8;
                playerNum =8;
                break;
            case R.id.btnMinusFive8:
                change = -5;
                tag = R.id.life8;
                playerNum =8;
                break;
        }



        TextView textView = (TextView)findViewById(tag);
        int life = (Integer.valueOf((String) textView.getText())+change);
        if(life <=0) {
            //show the message
            TextView diedAlert =(TextView)findViewById(R.id.playerLost);
            diedAlert.setText("Player "+playerNum +" LOSES!");
            diedAlert.setVisibility(View.VISIBLE);
            life =0;
        }
        textView.setText(String.valueOf(life));
        Log.i("Wen","Get in 2");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    //Prevent destory for rotation
    static final String Life1 = "life_1";
    static final String Life2 = "life_2";
    static final String Life3 = "life_3";
    static final String Life4 = "life_4";
    static final String Life5 = "life_5";
    static final String Life6 = "life_6";
    static final String Life7 = "life_7";
    static final String Life8 = "life_8";
    static final String Added_Num_Player="added_num_player";
    public void onSaveInstanceState(Bundle savedInstanceState) {
        //save the user's current state


        savedInstanceState.putInt(Added_Num_Player, addedPlayerNum);
        //player life score
        TextView textView = (TextView) findViewById(R.id.life1);
        savedInstanceState.putString(Life1, (String) textView.getText());

        textView = (TextView) findViewById(R.id.life2);
        savedInstanceState.putString(Life2, (String) textView.getText());

        textView = (TextView) findViewById(R.id.life3);
        savedInstanceState.putString(Life3, (String) textView.getText());

        textView = (TextView) findViewById(R.id.life4);
        savedInstanceState.putString(Life4, (String) textView.getText());

        textView = (TextView) findViewById(R.id.life5);
        savedInstanceState.putString(Life5, (String) textView.getText());

        textView = (TextView) findViewById(R.id.life6);
        savedInstanceState.putString(Life6, (String) textView.getText());

        textView = (TextView) findViewById(R.id.life7);
        savedInstanceState.putString(Life7, (String) textView.getText());

        textView = (TextView) findViewById(R.id.life8);
        savedInstanceState.putString(Life8, (String) textView.getText());
    }


    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        //Restore data

        addedPlayerNum = savedInstanceState.getInt(Added_Num_Player);

        LinearLayout playerLayout;
        for(int i=addedPlayerNum;i>4;i--) {
            if(i==8) {
                playerLayout = (LinearLayout) findViewById(R.id.player8);
                playerLayout.setVisibility(View.VISIBLE);
            }
            if(i==7) {
                playerLayout = (LinearLayout) findViewById(R.id.player7);
                playerLayout.setVisibility(View.VISIBLE);
            }
            if(i==6) {
                playerLayout = (LinearLayout) findViewById(R.id.player6);
                playerLayout.setVisibility(View.VISIBLE);
            }
            if(i==5) {
                playerLayout = (LinearLayout) findViewById(R.id.player5);
                playerLayout.setVisibility(View.VISIBLE);
            }
        }



        TextView textView = (TextView) findViewById(R.id.life1);
        textView.setText(savedInstanceState.getString(Life1));

        textView = (TextView) findViewById(R.id.life2);
        textView.setText(savedInstanceState.getString(Life2));

        textView = (TextView) findViewById(R.id.life3);
        textView.setText(savedInstanceState.getString(Life3));

        textView = (TextView) findViewById(R.id.life4);
        textView.setText(savedInstanceState.getString(Life4));

        textView = (TextView) findViewById(R.id.life5);
        textView.setText(savedInstanceState.getString(Life5));

        textView = (TextView) findViewById(R.id.life6);
        textView.setText(savedInstanceState.getString(Life6));

        textView = (TextView) findViewById(R.id.life7);
        textView.setText(savedInstanceState.getString(Life7));

        textView = (TextView) findViewById(R.id.life8);
        textView.setText(savedInstanceState.getString(Life8));
    }




}
