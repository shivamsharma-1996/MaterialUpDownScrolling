package jrsinnovation.com.msvsearchview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerItemAdapter extends RecyclerView.Adapter<RecyclerItemAdapter.holder>
{
    private Context context;
    private List<String> list;

    private RecyclerView mRecyclerView;

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        mRecyclerView = recyclerView;
    }

    public RecyclerItemAdapter(Context context, List<String> list)
    {
        this.context = context;
        this.list = list;
        }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.single_item_layout1, null);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final holder holder, int position)
    {
        holder.tv.setText(list.get(position));

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //       showBottomSheetDialogFragment();

                onItemRemove(holder, mRecyclerView);
            }
        });
    }

    @Override
    public long getItemId(int position)
    {
        return super.getItemId(position);
    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

    public static class holder extends RecyclerView.ViewHolder
    {
        private View view;
        private TextView tv;

        public holder(View itemView)
        {
            super(itemView);
            view = itemView;
            tv = view.findViewById(R.id.tvName);
        }
    }

    public void onItemRemove(final RecyclerView.ViewHolder viewHolder, final RecyclerView recyclerView)
    {
        final int adapterPosition = viewHolder.getAdapterPosition();
        final String mPhoto = list.get(adapterPosition);
        Snackbar snackbar = Snackbar
                .make(recyclerView, "PHOTO REMOVED", Snackbar.LENGTH_LONG)
                .setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        int mAdapterPosition = viewHolder.getAdapterPosition();
                        list.add(mAdapterPosition, mPhoto);
                        notifyItemInserted(mAdapterPosition);
                        recyclerView.scrollToPosition(mAdapterPosition);
                        // photosToDelete.remove(mPhoto);
                    }
                });
        snackbar.show();
        list.remove(adapterPosition);
        notifyItemRemoved(adapterPosition);
        // photosToDelete.add(mPhoto);
    }




}
