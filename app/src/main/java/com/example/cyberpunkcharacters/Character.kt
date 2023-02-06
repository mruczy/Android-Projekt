package com.example.cyberpunkcharacters

//data class Character(val nickname: String, val role:String) {
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


    constructor(id: Int, nickname: String, role: String,
                weaponName1: String, weaponDmg1: String, weaponAmmo1: String,
                weaponName2: String, weaponDmg2: String, weaponAmmo2: String,
                weaponName3: String, weaponDmg3: String, weaponAmmo3: String,
                weaponName4: String, weaponDmg4: String, weaponAmmo4: String,

                armorHeadDef: String, armorHeadPenalty: String,
                armorBodyDef: String, armorBodyPenalty: String,
                armorShieldDef: String, armorShieldPenalty: String,

                eqEqipment1: String, eqComment1: String,
                eqEqipment2: String, eqComment2: String,
                eqEqipment3: String, eqComment3: String,
                eqEqipment4: String, eqComment4: String,
                eqEqipment5: String, eqComment5: String,
                eqEqipment6: String, eqComment6: String,
                eqEqipment7: String, eqComment7: String,
                eqEqipment8: String, eqComment8: String,
                eqEqipment9: String, eqComment9: String,
                eqEqipment10: String, eqComment10: String,) : this(nickname, role){

        this.id = id
        this.weaponName1 = weaponName1
        this.weaponDmg1 = weaponDmg1
        this.weaponAmmo1 = weaponAmmo1
        this.weaponName2 = weaponName2
        this.weaponDmg2 = weaponDmg2
        this.weaponAmmo2 = weaponAmmo2
        this.weaponName3 = weaponName3
        this.weaponDmg3 = weaponDmg3
        this.weaponAmmo3 = weaponAmmo3
        this.weaponName4 = weaponName4
        this.weaponDmg4 = weaponDmg4
        this.weaponAmmo4 = weaponAmmo4
        this.armorHeadDef = armorHeadDef
        this.armorHeadPenalty = armorHeadPenalty
        this.armorBodyDef = armorBodyDef
        this.armorBodyPenalty = armorBodyPenalty
        this.armorShieldDef = armorShieldDef
        this.armorShieldPenalty = armorShieldPenalty
        this.EqEquipment1 = eqEqipment1
        this.EqComment1 = eqComment1
        this.EqEquipment2 = eqEqipment2
        this.EqComment2 = eqComment2
        this.EqEquipment3 = eqEqipment3
        this.EqComment3 = eqComment3
        this.EqEquipment4 = eqEqipment4
        this.EqComment4 = eqComment4
        this.EqEquipment5 = eqEqipment5
        this.EqComment5 = eqComment5
        this.EqEquipment6 = eqEqipment6
        this.EqComment6 = eqComment6
        this.EqEquipment7 = eqEqipment7
        this.EqComment7 = eqComment7
        this.EqEquipment8 = eqEqipment8
        this.EqComment8 = eqComment8
        this.EqEquipment9 = eqEqipment9
        this.EqComment9 = eqComment9
        this.EqEquipment10 = eqEqipment10
        this.EqComment10 = eqComment10
    }
}