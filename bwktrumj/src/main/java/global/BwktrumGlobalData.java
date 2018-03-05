package global;

import java.util.ArrayList;
import java.util.List;

import bwktrum.BwktrumPeerData;

/**
 * Created by kaali on 7/2/17.
 */

public class BwktrumGlobalData {

    public static final String KAALI_TESTNET_SERVER = "185.101.98.175";

    public static final String[] TRUSTED_NODES = new String[]{"node.bulwarkwiki.org"};

    public static final List<BwktrumPeerData> listTrustedHosts(){
        List<BwktrumPeerData> list = new ArrayList<>();
        list.add(new BwktrumPeerData(KAALI_TESTNET_SERVER,8443,55552));
        for (String trustedNode : TRUSTED_NODES) {
            list.add(new BwktrumPeerData(trustedNode,51472,55552));
        }
        return list;
    }

}
