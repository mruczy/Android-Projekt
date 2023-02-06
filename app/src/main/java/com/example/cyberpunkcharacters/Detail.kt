package com.example.cyberpunkcharacters

import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.cyberpunkcharacters.databinding.DetailBinding

class Detail : Fragment() {

    private lateinit var itemId: String
    private lateinit var dbHandler: DBHandler
    private lateinit var item: Character

    val binding by lazy { DetailBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let { itemId = it.getString("itemId").toString() }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val context = this.context
        if (context != null) {
            dbHandler = DBHandler(context)

            item = dbHandler.getCharacter().find { item -> item.id.toString() == itemId }!!
            binding.textViewDetailNickname.text = Editable.Factory.getInstance().newEditable(item.nickname)
            binding.textViewDetailRole.text = Editable.Factory.getInstance().newEditable(item.role)

            binding.textViewWeaponName1.text = Editable.Factory.getInstance().newEditable(item.weaponName_1)
            binding.textViewWeaponDmg1.text = Editable.Factory.getInstance().newEditable(item.weaponDmg_1)
            binding.textViewWeaponAmmo1.text = Editable.Factory.getInstance().newEditable(item.weaponAmmo_1)
            binding.textViewWeaponComment1.text = Editable.Factory.getInstance().newEditable(item.weaponComment_1)
            binding.textViewWeaponName2.text = Editable.Factory.getInstance().newEditable(item.weaponName_2)
            binding.textViewWeaponDmg2.text = Editable.Factory.getInstance().newEditable(item.weaponDmg_2)
            binding.textViewWeaponAmmo2.text = Editable.Factory.getInstance().newEditable(item.weaponAmmo_2)
            binding.textViewWeaponComment2.text = Editable.Factory.getInstance().newEditable(item.weaponComment_2)
            binding.textViewWeaponName3.text = Editable.Factory.getInstance().newEditable(item.weaponName_3)
            binding.textViewWeaponDmg3.text = Editable.Factory.getInstance().newEditable(item.weaponDmg_3)
            binding.textViewWeaponAmmo3.text = Editable.Factory.getInstance().newEditable(item.weaponAmmo_3)
            binding.textViewWeaponComment3.text = Editable.Factory.getInstance().newEditable(item.weaponComment_3)
            binding.textViewWeaponName4.text = Editable.Factory.getInstance().newEditable(item.weaponName_4)
            binding.textViewWeaponDmg4.text = Editable.Factory.getInstance().newEditable(item.weaponDmg_4)
            binding.textViewWeaponAmmo4.text = Editable.Factory.getInstance().newEditable(item.weaponAmmo_4)
            binding.textViewWeaponComment4.text = Editable.Factory.getInstance().newEditable(item.weaponComment_4)

            binding.textViewArmorHeadDefense.text = Editable.Factory.getInstance().newEditable(item.armorHeadDef)
            binding.textViewArmorHeadPenalty.text = Editable.Factory.getInstance().newEditable(item.armorHeadPenalty)
            binding.textViewArmorBodyDefense.text = Editable.Factory.getInstance().newEditable(item.armorBodyDef)
            binding.textViewArmorBodyPenalty.text = Editable.Factory.getInstance().newEditable(item.armorBodyPenalty)
            binding.textViewArmorShieldDefense.text = Editable.Factory.getInstance().newEditable(item.armorShieldDef)
            binding.textViewArmorShieldPenalty.text = Editable.Factory.getInstance().newEditable(item.armorShieldPenalty)

            binding.textViewQeEquipment1.text = Editable.Factory.getInstance().newEditable(item.EqEquipment_1)
            binding.textViewQeComment1.text = Editable.Factory.getInstance().newEditable(item.EqComment_1)
            binding.textViewQeEquipment2.text = Editable.Factory.getInstance().newEditable(item.EqEquipment_2)
            binding.textViewQeComment2.text = Editable.Factory.getInstance().newEditable(item.EqComment_2)
            binding.textViewQeEquipment3.text = Editable.Factory.getInstance().newEditable(item.EqEquipment_3)
            binding.textViewQeComment3.text = Editable.Factory.getInstance().newEditable(item.EqComment_3)
            binding.textViewQeEquipment4.text = Editable.Factory.getInstance().newEditable(item.EqEquipment_4)
            binding.textViewQeComment4.text = Editable.Factory.getInstance().newEditable(item.EqComment_4)
            binding.textViewQeEquipment5.text = Editable.Factory.getInstance().newEditable(item.EqEquipment_5)
            binding.textViewQeComment5.text = Editable.Factory.getInstance().newEditable(item.EqComment_5)
            binding.textViewQeEquipment6.text = Editable.Factory.getInstance().newEditable(item.EqEquipment_6)
            binding.textViewQeComment6.text = Editable.Factory.getInstance().newEditable(item.EqComment_6)
            binding.textViewQeEquipment7.text = Editable.Factory.getInstance().newEditable(item.EqEquipment_7)
            binding.textViewQeComment7.text = Editable.Factory.getInstance().newEditable(item.EqComment_7)
            binding.textViewQeEquipment8.text = Editable.Factory.getInstance().newEditable(item.EqEquipment_8)
            binding.textViewQeComment8.text = Editable.Factory.getInstance().newEditable(item.EqComment_8)
            binding.textViewQeEquipment9.text = Editable.Factory.getInstance().newEditable(item.EqEquipment_9)
            binding.textViewQeComment9.text = Editable.Factory.getInstance().newEditable(item.EqComment_9)
            binding.textViewQeEquipment10.text = Editable.Factory.getInstance().newEditable(item.EqEquipment_10)
            binding.textViewQeComment10.text = Editable.Factory.getInstance().newEditable(item.EqComment_10)


            binding.save.setOnClickListener {

            }

            binding.back.setOnClickListener {
                Navigation.findNavController(binding.root).navigate(R.id.action_detail_to_list)
            }
        }
        return binding.root
    }
}