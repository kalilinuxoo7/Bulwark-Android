package bwktrum.listeners;

import java.util.List;

import bwktrum.BwktrumPeer;
import bwktrum.messages.responses.StatusHistory;
import bwktrum.messages.responses.Unspent;
import bwktrum.utility.TxHashHeightWrapper;

/**
 * Created by kaali on 6/17/17.
 */

public interface PeerDataListener {

    void onSubscribedAddressChange(BwktrumPeer bwktrumPeer, String address, String status);

    void onListUnpent(BwktrumPeer bwktrumPeer,String address, List<Unspent> unspent);

    void onBalanceReceive(BwktrumPeer bwktrumPeer, String address, long confirmed, long unconfirmed);

    void onGetHistory(BwktrumPeer bwktrumPeer, StatusHistory statusHistory);
}
