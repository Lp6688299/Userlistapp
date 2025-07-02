package com.example.userlistapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> userList;

    // Constructor: KHÔNG được null
    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }

    // Setter: update list và thông báo RecyclerView vẽ lại
    public void setUserList(List<User> userList) {
        this.userList = userList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = userList.get(position);

        // Set dữ liệu ra layout
        holder.nameText.setText(user.getName());
        holder.usernameText.setText(user.getUsername());
        holder.emailText.setText(user.getEmail());
    }

    @Override
    public int getItemCount() {
        return userList == null ? 0 : userList.size();
    }

    static class UserViewHolder extends RecyclerView.ViewHolder {
        TextView nameText, usernameText, emailText;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            nameText = itemView.findViewById(R.id.tvName);
            usernameText = itemView.findViewById(R.id.tvUsername);
            emailText = itemView.findViewById(R.id.tvEmail);
        }
    }
}
