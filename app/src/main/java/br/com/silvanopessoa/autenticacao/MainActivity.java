package br.com.silvanopessoa.autenticacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dd.processbutton.iml.ActionProcessButton;
import com.joanzapata.iconify.Iconify;
import com.joanzapata.iconify.fonts.EntypoModule;
import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.joanzapata.iconify.fonts.MaterialCommunityModule;
import com.joanzapata.iconify.fonts.MaterialModule;
import com.joanzapata.iconify.fonts.MeteoconsModule;
import com.joanzapata.iconify.fonts.SimpleLineIconsModule;
import com.joanzapata.iconify.fonts.TypiconsModule;
import com.joanzapata.iconify.fonts.WeathericonsModule;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ActionProcessButton btnSignIn = (ActionProcessButton) findViewById(R.id.btnSignIn);


        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSignIn.setMode(ActionProcessButton.Mode.PROGRESS);
// no progress
        btnSignIn.setProgress(0);
// progressDrawable cover 50% of button width, progressText is shown
        btnSignIn.setProgress(50);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
// progressDrawable cover 75% of button width, progressText is shown
        btnSignIn.setProgress(75);
// completeColor & completeText is shown
        btnSignIn.setProgress(100);

// you can display endless google like progress indicator
        btnSignIn.setMode(ActionProcessButton.Mode.ENDLESS);
            }
        });
//
//// no progress
//        btnSignIn.setProgress(0);
//// progressDrawable cover 50% of button width, progressText is shown
//        btnSignIn.setProgress(50);
//// progressDrawable cover 75% of button width, progressText is shown
//        btnSignIn.setProgress(75);
//// completeColor & completeText is shown
//        btnSignIn.setProgress(100);
//
//// you can display endless google like progress indicator
//        btnSignIn.setMode(ActionProcessButton.Mode.ENDLESS);
//// set progress > 0 to start progress indicator animation
//        btnSignIn.setProgress(1);
    }
}
