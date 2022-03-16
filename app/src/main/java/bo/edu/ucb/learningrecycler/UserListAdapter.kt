package bo.edu.ucb.learningrecycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserListAdapter(val list: ArrayList<User>, val mainActivity: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_row, parent, false) //Enlace a user_row
        return UserViewHolder(view)
    }

    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user = list.get(position)
        holder.itemView.findViewById<TextView>(R.id.userNameTextView).text = user.name
        holder.itemView.findViewById<TextView>(R.id.userEmailTextView).text = user.email
    }

    override fun getItemCount(): Int {
        return list.size
    }

}
