package bulwark.org.bulwarkwallet.ui.initial;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import bulwark.org.bulwarkwallet.BulwarkApplication;
import bulwark.org.bulwarkwallet.ui.splash_activity.SplashActivity;
import bulwark.org.bulwarkwallet.ui.wallet_activity.WalletActivity;
import bulwark.org.bulwarkwallet.utils.AppConf;

/**
 * Created by kaali on 8/19/17.
 */

public class InitialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BulwarkApplication bulwarkApplication = BulwarkApplication.getInstance();
        AppConf appConf = bulwarkApplication.getAppConf();
        // show report dialog if something happen with the previous process
        Intent intent;
        if (!appConf.isAppInit() || appConf.isSplashSoundEnabled()){
            intent = new Intent(this, SplashActivity.class);
        }else {
            intent = new Intent(this, WalletActivity.class);
        }
        startActivity(intent);
        finish();
    }
}
