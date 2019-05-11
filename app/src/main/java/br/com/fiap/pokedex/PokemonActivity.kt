package br.com.fiap.pokedex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import br.com.fiap.pokedex.model.Pokemon
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_pokemon.*
import kotlinx.android.synthetic.main.pokemon_item.view.*

class PokemonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val pokemon = intent.extras.getParcelable<Pokemon>("POKEMON")
        Toast.makeText(this,pokemon.nome,Toast.LENGTH_LONG).show()

        Picasso.get().load(pokemon.imagem).into(ivImagem);
        tvNomedetalhe.text = pokemon.nome
        tvDescricao.text = pokemon.descricao
        tvPS.text = pokemon.PS.toString()
        tvAtaque.text = pokemon.ataque.toString()
        tvDefesa.text = pokemon.defesa.toString()
        tvVelocidade.text = pokemon.velocidade.toString()
    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)

    }
}
