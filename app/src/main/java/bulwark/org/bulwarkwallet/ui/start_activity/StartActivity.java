package bulwark.org.bulwarkwallet.ui.start_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import bulwark.org.bulwarkwallet.R;
import bulwark.org.bulwarkwallet.ui.base.BaseActivity;
import bulwark.org.bulwarkwallet.ui.restore_activity.RestoreActivity;
import bulwark.org.bulwarkwallet.ui.tutorial_activity.TutorialActivity;

import static bulwark.org.bulwarkwallet.ui.restore_activity.RestoreActivity.ACTION_RESTORE_AND_JUMP_TO_WIZARD;

/**
 * Created by mati on 18/04/17.
 */

public class StartActivity extends BaseActivity {

    private Button buttonCreate;
    private Button buttonRestore;

    @Override
    protected void onCreateView(Bundle savedInstanceState, ViewGroup container) {
        getLayoutInflater().inflate(R.layout.fragment_start, container);

        buttonCreate = (Button) findViewById(R.id.btnCreate);
        buttonCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open Create Wallet
                bulwarkModule.createWallet();
                Intent myIntent = new Intent(v.getContext(), TutorialActivity.class);
                startActivity(myIntent);
                finish();
            }
        });

        // Open Restore Wallet
        buttonRestore = (Button) findViewById(R.id.btnRestore);
        buttonRestore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), RestoreActivity.class);
                myIntent.setAction(ACTION_RESTORE_AND_JUMP_TO_WIZARD);
                startActivity(myIntent);
            }
        });

    }

    public boolean hasToolbar() {
        return false;
    }

    public boolean isFullScreen(){
        return true;
    }
}
