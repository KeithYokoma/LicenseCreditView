package jp.yokomark.widget.license;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.ListView;

import jp.yokomark.widget.license.internal.model.CreditEntryCollection;

/**
 * @author yokomakukeishin
 * @since 2014/03/15
 * @version 1.0.0
 */
@SuppressWarnings("unused") // public APIs
public class LicenseCreditView extends ListView {
    public static final String TAG = LicenseCreditView.class.getSimpleName();
    private final CreditEntryCollection mCollection;
    private final CreditEntryAdapter mAdapter;

    public LicenseCreditView(Context context) {
        super(context);
        mCollection = new CreditEntryCollection();
        mAdapter = new CreditEntryAdapter(context, mCollection.get());
        setAdapter(mAdapter);

        setDivider(new ColorDrawable(Color.TRANSPARENT));
        setDividerHeight(context.getResources().getDimensionPixelSize(R.dimen.divider_height_license_credits));
    }

    public LicenseCreditView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mCollection = new CreditEntryCollection();
        mAdapter = new CreditEntryAdapter(context, mCollection.get());
        setAdapter(mAdapter);

        setDivider(new ColorDrawable(Color.TRANSPARENT));
        setDividerHeight(context.getResources().getDimensionPixelSize(R.dimen.divider_height_license_credits));
    }

    public LicenseCreditView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mCollection = new CreditEntryCollection();
        mAdapter = new CreditEntryAdapter(context, mCollection.get());
        setAdapter(mAdapter);

        setDivider(new ColorDrawable(Color.TRANSPARENT));
        setDividerHeight(context.getResources().getDimensionPixelSize(R.dimen.divider_height_license_credits));
    }

    public void addCredit(CreditEntry entry) {
        mCollection.add(entry);
        mAdapter.notifyDataSetChanged();
    }

    public CreditEntry getCreditAt(int position) {
        return mCollection.get(position);
    }
}
