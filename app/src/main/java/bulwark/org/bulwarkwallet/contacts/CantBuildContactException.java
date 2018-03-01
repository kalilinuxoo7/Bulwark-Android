package bulwark.org.bulwarkwallet.contacts;

/**
 * Created by furszy on 7/1/17.
 */
public class CantBuildContactException extends RuntimeException {
    public CantBuildContactException(Exception e) {
        super(e);
    }
}
