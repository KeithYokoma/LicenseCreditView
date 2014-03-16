package jp.yokomark.widget.license;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * @author yokomakukeishin
 * @since 2014/03/15
 */
public class CreditEntryAdapter extends ArrayAdapter<CreditEntry> {
    public CreditEntryAdapter(Context context, List<CreditEntry> entries) {
        super(context, R.layout.list_item_license_credit, R.id.label_library_name, entries);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = super.getView(position, convertView, parent);
        TextView libraryName = (TextView) view.findViewById(R.id.label_library_name);
        TextView header = (TextView) view.findViewById(R.id.label_license_header);
        TextView content = (TextView) view.findViewById(R.id.label_license_body);

        CreditEntry entry = getItem(position);
        CreditEntry.LicenseType type = entry.getType();

        libraryName.setText(entry.getLibraryName());
        header.setText(getContext().getString(type.getHeaderResource(), entry.getSince(), entry.getOwnerName()));
        content.setText(type.getBodyResource());
        return view;
    }
}