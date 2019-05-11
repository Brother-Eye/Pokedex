package br.com.fiap.pokedex.model

import android.os.Parcel
import android.os.Parcelable

data class Pokemon(
        val imagem: String,
        val nome: String,
        val tipo: String,
        val descricao: String,
        val geracao: Int,
        val PS : Int,
        val ataque : Int,
        val defesa : Int,
        val velocidade : Int
): Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readInt(),
            parcel.readInt(),
            parcel.readInt(),
            parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(imagem)
        parcel.writeString(nome)
        parcel.writeString(tipo)
        parcel.writeString(descricao)
        parcel.writeInt(geracao)
        parcel.writeInt(PS)
        parcel.writeInt(ataque)
        parcel.writeInt(defesa)
        parcel.writeInt(velocidade)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Pokemon> {
        override fun createFromParcel(parcel: Parcel): Pokemon {
            return Pokemon(parcel)
        }

        override fun newArray(size: Int): Array<Pokemon?> {
            return arrayOfNulls(size)
        }
    }
}