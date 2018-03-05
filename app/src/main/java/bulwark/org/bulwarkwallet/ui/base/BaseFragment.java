package bulwark.org.bulwarkwallet.ui.base;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;

import bulwark.org.bulwarkwallet.BulwarkApplication;
import bulwark.org.bulwarkwallet.module.BulwarkModule;

/**
 * Created by kaali on 6/29/17.
 */

public class BaseFragment extends Fragment {

    protected BulwarkApplication bulwarkApplication;
    protected BulwarkModule bulwarkModule;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bulwarkApplication = BulwarkApplication.getInstance();
        bulwarkModule = bulwarkApplication.getModule();
    }

    protected boolean checkPermission(String permission) {
        int result = ContextCompat.checkSelfPermission(getActivity(),permission);
        return result == PackageManager.PERMISSION_GRANTED;
    }
}
