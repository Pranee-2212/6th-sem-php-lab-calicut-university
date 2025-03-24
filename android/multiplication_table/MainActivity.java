import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputNumber;
    private TextView resultText;
    private Button generateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNumber = findViewById(R.id.inputNumber);
        resultText = findViewById(R.id.resultText);
        generateButton = findViewById(R.id.generateButton);

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberStr = inputNumber.getText().toString();
                if (!numberStr.isEmpty()) {
                    int number = Integer.parseInt(numberStr);
                    resultText.setText(generateMultiplicationTable(number));
                } else {
                    resultText.setText("Please enter a number.");
                }
            }
        });
    }

    private String generateMultiplicationTable(int number) {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            table.append(number).append(" x ").append(i).append(" = ").append(number * i).append("\n");
        }
        return table.toString();
    }
}