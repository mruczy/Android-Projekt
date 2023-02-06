package com.example.cyberpunkcharacters


data class Character(val nickname: String, val role:String) {
    var id:Int = 0

    //obrazenia i obrone zapisuje sie w formie np 1d4 (1 rzut koscia d4) dlatego String
    var weaponName1:String = ""
    var weaponDmg1: String = ""
    var weaponAmmo1: String = ""
    var weaponComment1: String = ""
    var weaponName2:String = ""
    var weaponDmg2: String = ""
    var weaponAmmo2: String = ""
    var weaponComment2: String = ""
    var weaponName3:String = ""
    var weaponDmg3: String = ""
    var weaponAmmo3: String = ""
    var weaponComment3: String = ""
    var weaponName4:String = ""
    var weaponDmg4: String = ""
    var weaponAmmo4: String = ""
    var weaponComment4: String = ""

    var armorHeadDef:String = ""
    var armorHeadPenalty: String = ""
    var armorBodyDef:String = ""
    var armorBodyPenalty: String = ""
    var armorShieldDef:String = ""
    var armorShieldPenalty: String = ""

    var EqEquipment1:String = ""
    var EqComment1:String = ""
    var EqEquipment2:String = ""
    var EqComment2:String = ""
    var EqEquipment3:String = ""
    var EqComment3:String = ""
    var EqEquipment4:String = ""
    var EqComment4:String = ""
    var EqEquipment5:String = ""
    var EqComment5:String = ""
    var EqEquipment6:String = ""
    var EqComment6:String = ""
    var EqEquipment7:String = ""
    var EqComment7:String = ""
    var EqEquipment8:String = ""
    var EqComment8:String = ""
    var EqEquipment9:String = ""
    var EqComment9:String = ""
    var EqEquipment10:String = ""
    var EqComment10:String = ""


    constructor(id: Int, nickname: String, role: String) : this(nickname, role){
        this.id = id
    }
}