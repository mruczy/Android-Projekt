package com.example.cyberpunkcharacters

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.cyberpunkcharacters.databinding.ItemBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.cyberpunkcharacters.databinding.ListBinding

class CharacterAdapter(private val dbHandler: DBHandler, private val context: Context) :
    RecyclerView.Adapter<CharacterAdapter.ViewHolder>() {


inner class ViewHolder(private val itemBinding: ItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        fun bind(item: Character) {
            itemBinding.textViewId.text = item.id.toString()
            itemBinding.textViewNickname.text = item.nickname
            itemBinding.textViewRole.text = item.role

            itemBinding.itemView.setOnClickListener {
                val action = ListDirections.actionListToDetail(itemId = item.id.toString())
                Navigation.findNavController(itemView).navigate(action)
            }

            itemBinding.imageViewDelete.setOnClickListener{
                dbHandler.deleteCharacter(item)
                notifyItemRemoved(adapterPosition)
            }
        }
}



override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }



override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dbHandler.getCharacter()[position]
        holder.bind(item)
    }


    override fun getItemCount() = dbHandler.getCharacter().size
}
