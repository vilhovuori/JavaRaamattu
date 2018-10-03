package Interface;

public class Mechanical implements College{
    @Override
    public void exam() {
        System.out.println("Mecha ezxam will be in Feb");
    }

    @Override
    public void score() {
        System.out.println("Mecha scores will be in Mar");
    }
}


/*
package com.example.administrator.randomizerapp

        import android.support.v7.app.AppCompatActivity
        import android.os.Bundle
        import android.widget.Button
        import android.widget.SeekBar
        import android.widget.TextView
        import java.util.*

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        rollButton.setOnClickListener {
        val rand = Random().nextInt(seekBar.progress)
        resultsTextView.text = rand.toString()
        }
        }
        }

        ----------------------------------


        package com.example.administrator.guessinggame;

        import android.os.Bundle;
        import android.support.design.widget.FloatingActionButton;
        import android.support.design.widget.Snackbar;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.View;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtGuess;
    private Button btnGuess;
    private TextView lblOutput;
    private int theNumber;

    public void checkGuess(){
        String guessText=txtGuess.getText().toString();
        String message="";
        try {
            int guess = Integer.parseInt(guessText);
            if(guess<theNumber)
                message=guess + " is too low. Try again.";
            else if (guess>theNumber)
                message=guess + " is too high. Try again.";
            else {
                message=guess + " is correct. You win! Let's play again";
                newGame();
            }
        }catch (Exception e) {
            message="Enter a whole number between 1 and 100.";
        } finally {
            lblOutput.setText(message);
            txtGuess.requestFocus();
            txtGuess.selectAll();
        }
    }
    public void newGame() {
        theNumber = (int)(Math.random() * 100 + 1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtGuess = (EditText) findViewById(R.id.txtGuess);
        btnGuess=(Button)findViewById(R.id.btnGuess);
        lblOutput=(TextView)findViewById(R.id.lblOutput);
        newGame();
        btnGuess.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                checkGuess();
            }});

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
}





*/