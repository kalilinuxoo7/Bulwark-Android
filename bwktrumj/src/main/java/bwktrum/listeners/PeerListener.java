package bwktrum.listeners;

import bwktrum.BwktrumPeer;

/**
 * Created by kaali on 6/17/17.
 */

public interface PeerListener {

    void onConnected(BwktrumPeer bwktrumPeer);

    void onDisconnected(BwktrumPeer bwktrumPeer);

    void onExceptionCaught(BwktrumPeer bwktrumPeer, Exception e);
}
