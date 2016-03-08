package stockWatcher.client;

import java.io.Serializable;

/**
 * Created by jkrzeminski on 3/8/2016.
 */
public class DelistedException extends Exception implements Serializable {
    private String symbol;

    public DelistedException() {
    }

    public DelistedException(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }
}
