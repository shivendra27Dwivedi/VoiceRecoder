package com.example.voicerecoder;

import android.os.Build;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

public interface RecordingAdapterss extends RecordingAdapters {
    RecordingAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType);

    void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position);

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    void onBindViewHolder(RecordingAdapter.ViewHolder holder, int position);

    int getItemCount();
}
