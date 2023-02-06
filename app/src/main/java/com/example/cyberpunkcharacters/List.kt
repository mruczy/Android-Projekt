package com.example.cyberpunkcharacters


import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cyberpunkcharacters.databinding.ListBinding
import com.example.cyberpunkcharacters.databinding.DialogAddBinding

class List : Fragment() {

    private lateinit var dbHandler: DBHandler
    private val binding by lazy { ListBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val context = this.context
        if (context != null) {
            dbHandler = DBHandler(context)
        }

        binding.dataBaseRecyclerView.apply {
            layoutManager = LinearLayoutManager(this.context)
            adapter = CharacterAdapter(dbHandler, this.context)
        }


        binding.addButton.setOnClickListener {
            setupDialog()
        }

        return  binding.root
    }

    private fun setupDialog() {
        val context = this.context
        if (context != null) {
            val dialog = Dialog(context)
            val dialogBinding = DialogAddBinding.inflate(LayoutInflater.from(context))
            dialog.apply {
                setCancelable(false)
                setContentView(dialogBinding.root)
            }

            dialogBinding.apply {

                buttonAddCharacter.setOnClickListener {
                    val nickname = addTextNickname.text.toString()
                    val role = addTextRole.text.toString()

                    if (nickname.isNotEmpty() && role.isNotEmpty()) {
                        dbHandler.addCharacter(Character(nickname, role))
                        addTextNickname.text.clear()
                        addTextRole.text.clear()
                    }

                    binding.dataBaseRecyclerView.adapter?.notifyItemInserted(dbHandler.getCharacter().size)
                    dialog.dismiss()
                }

                buttonCancelCharacter.setOnClickListener {
                    dialog.dismiss()
                }
            }
            dialog.show()
        }
    }

    override fun onDestroy() {
        dbHandler.close()
        super.onDestroy()
    }
}
