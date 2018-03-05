package bulwark.org.bulwarkwallet.rate;

/**
 * Created by kaali on 7/5/17.
 */
public class RequestBulwarkRateException extends Exception {
    public RequestBulwarkRateException(String message) {
        super(message);
    }

    public RequestBulwarkRateException(String message, Throwable cause) {
        super(message, cause);
    }

    public RequestBulwarkRateException(Exception e) {
        super(e);
    }
}
