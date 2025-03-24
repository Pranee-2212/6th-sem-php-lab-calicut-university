package addition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputNumber1;
    private EditText inputNumber2;
    private TextView resultText;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNumber1 = findViewById(R.id.inputNumber1);
        inputNumber2 = findViewById(R.id.inputNumber2);
        resultText = findViewById(R.id.resultText);
        addButton = findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberStr1 = inputNumber1.getText().toString();
                String numberStr2 = inputNumber2.getText().toString();
                if (!numberStr1.isEmpty() && !numberStr2.isEmpty()) {
                    int number1 = Integer.parseInt(numberStr1);
                    int number2 = Integer.parseInt(numberStr2);
                    int sum = number1 + number2;
                    resultText.setText("Result: " + sum);
                } else {
                    resultText.setText("Please enter both numbers.");
                }
            }
        });
    }
}