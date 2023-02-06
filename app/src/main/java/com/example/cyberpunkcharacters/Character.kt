package com.example.cyberpunkcharacters


data class Character(val nickname: String, val role:String) {
    var id:Int = 0

    //obrazenia i obrone zapisuje sie w formie np 1d4 (1 rzut koscia d4) dlatego String
    var weaponName_1:String = ""
    var weaponDmg_1: String = ""
    var weaponAmmo_1: String = ""
    var weaponComment_1: String = ""
    var weaponName_2:String = ""
    var weaponDmg_2: String = ""
    var weaponAmmo_2: String = ""
    var weaponComment_2: String = ""
    var weaponName_3:String = ""
    var weaponDmg_3: String = ""
    var weaponAmmo_3: String = ""
    var weaponComment_3: String = ""
    var weaponName_4:String = ""
    var weaponDmg_4: String = ""
    var weaponAmmo_4: String = ""
    var weaponComment_4: String = ""

    var armorHeadDef:String = ""
    var armorHeadPenalty: String = ""
    var armorBodyDef:String = ""
    var armorBodyPenalty: String = ""
    var armorShieldDef:String = ""
    var armorShieldPenalty: String = ""

    var EqEquipment_1:String = ""
    var EqComment_1:String = ""
    var EqEquipment_2:String = ""
    var EqComment_2:String = ""
    var EqEquipment_3:String = ""
    var EqComment_3:String = ""
    var EqEquipment_4:String = ""
    var EqComment_4:String = ""
    var EqEquipment_5:String = ""
    var EqComment_5:String = ""
    var EqEquipment_6:String = ""
    var EqComment_6:String = ""
    var EqEquipment_7:String = ""
    var EqComment_7:String = ""
    var EqEquipment_8:String = ""
    var EqComment_8:String = ""
    var EqEquipment_9:String = ""
    var EqComment_9:String = ""
    var EqEquipment_10:String = ""
    var EqComment_10:String = ""


    constructor(id: Int, nickname: String, role: String) : this(nickname, role){
        this.id = id
    }
}