package stockWatcher.client;

import com.google.gwt.i18n.client.Constants;
import com.google.gwt.i18n.client.Constants.DefaultStringValue;

/**
 * Created by jkrzeminski on 3/11/2016.
 */
public interface StockWatcherConstants extends Constants {
    @DefaultStringValue("StockWatcher")
    String stockWatcher();

    @DefaultStringValue("Symbol")
    String symbol();

    @DefaultStringValue("Price")
    String price();

    @DefaultStringValue("Change")
    String change();

    @DefaultStringValue("Remove")
    String remove();

    @DefaultStringValue("Add")
    String add();
}
