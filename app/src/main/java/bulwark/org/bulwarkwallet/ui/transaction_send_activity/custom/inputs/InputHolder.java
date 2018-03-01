package bulwark.org.bulwarkwallet.ui.transaction_send_activity.custom.inputs;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import bulwark.org.bulwarkwallet.R;
import bulwark.org.bulwarkwallet.ui.base.tools.adapter.BaseRecyclerViewHolder;

/**
 * Created by furszy on 8/4/17.
 */

public class InputHolder extends BaseRecyclerViewHolder{

    ImageView radio_select;
    TextView txt_amount;
    TextView txt_address;
    TextView txt_confirmations_amount;
    TextView txt_date;

    public InputHolder(View itemView, int holderType) {
        super(itemView, holderType);
        txt_amount = (TextView) itemView.findViewById(R.id.txt_amount);
        radio_select = (ImageView) itemView.findViewById(R.id.radio_select);
        txt_address = (TextView) itemView.findViewById(R.id.txt_address);
        txt_confirmations_amount = (TextView) itemView.findViewById(R.id.txt_confirmations_amount);
        txt_date = (TextView) itemView.findViewById(R.id.txt_date);
    }
}
