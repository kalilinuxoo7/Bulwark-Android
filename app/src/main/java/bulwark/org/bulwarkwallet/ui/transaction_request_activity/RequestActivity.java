package bulwark.org.bulwarkwallet.ui.transaction_request_activity;

import android.os.Bundle;
import android.view.ViewGroup;

import bulwark.org.bulwarkwallet.R;
import bulwark.org.bulwarkwallet.ui.base.BaseActivity;

/**
 * Created by Neoperol on 5/11/17.
 */

public class RequestActivity extends BaseActivity{
    @Override
    protected void onCreateView(Bundle savedInstanceState,ViewGroup container) {
        getLayoutInflater().inflate(R.layout.fragment_transaction_request, container);
        setTitle("Request");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }
}
