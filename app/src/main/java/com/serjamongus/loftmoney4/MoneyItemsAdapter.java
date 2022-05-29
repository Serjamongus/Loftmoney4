package com.serjamongus.loftmoney4;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.serjamongus.loftmoney4.models.MoneyItem;

import java.util.ArrayList;
import java.util.List;

public class MoneyItemsAdapter extends RecyclerView.Adapter<MoneyItemsAdapter.ItemViewHolder> {
    private final List<MoneyItem> itemsList = new ArrayList<>();

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        View itemView = View.inflate(parent.getContext(), R.layout.item_money, null);

        return new ItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ItemViewHolder holder, final int position) {
        holder.bindItem(itemsList.get(position));
    }

    public void addItem(MoneyItem item) {
        itemsList.add(item);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder {

        private final TextView mTextView;
        private final TextView mPriceView;

        public ItemViewHolder(@NonNull final View itemView) {
            super(itemView);

            mTextView = itemView.findViewById(R.id.ti_title);
            mPriceView = itemView.findViewById(R.id.ti_price);
        }

        public void bindItem(@NonNull final MoneyItem item) {
            mTextView.setText(item.getTitle());
            mPriceView.setText(String.valueOf(item.getPrice()));
        }
    }
}