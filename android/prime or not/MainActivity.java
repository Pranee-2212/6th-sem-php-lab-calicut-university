import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputNumber;
    private TextView resultText;
    private Button checkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNumber = findViewById(R.id.inputNumber);
        resultText = findViewById(R.id.resultText);
        checkButton = findViewById(R.id.checkButton);

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberStr = inputNumber.getText().toString();
                if (!numberStr.isEmpty()) {
                    int number = Integer.parseInt(numberStr);
                    if (isPrime(number)) {
                        resultText.setText(number + " is a prime number.");
                    } else {
                        resultText.setText(number + " is not a prime number.");
                    }
                } else {
                    resultText.setText("Please enter a number.");
                }
            }
        });
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
