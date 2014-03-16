package jp.yokomark.widget.license.internal.model;

import java.util.ArrayList;
import java.util.List;

import jp.yokomark.widget.license.CreditEntry;

/**
 * @author yokomakukeishin
 * @since 2014/03/15
 */
public class CreditEntryCollection {
    private final List<CreditEntry> mEntries;

    public CreditEntryCollection() {
        mEntries = new ArrayList<CreditEntry>();
    }

    public List<CreditEntry> get() {
        return mEntries;
    }

    public CreditEntry get(int position) {
        return mEntries.get(position);
    }

    public void add(CreditEntry entry) {
        mEntries.add(entry);
    }
}
