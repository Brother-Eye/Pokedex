package br.com.fiap.pokedex.dao

import br.com.fiap.pokedex.model.Pokemon

class PokemonLocalDAO{

    fun pegarPokemon() : List<Pokemon>{
        return listOf(
            getBubasauro(),
            getDugtrio(),
            getHypno(),
            getLapras(),
            getArticuno(),
            getDragonite()
        )

    }

    private fun getArticuno() : Pokemon{
        return Pokemon("https://assets.pokemon.com/assets/cms2/img/pokedex/full/144.png",
                "Articuno",
                "Gelo",
                "Articuno é um lendário pássaro Pokémon que pode controlar o gelo. " +
                        "O bater de suas asas arrepia o ar. Como resultado, é dito que quando este Pokémon voa, a neve cairá.",
                1,
                4,
                4,
                4,
                5)
    }

    private fun getBubasauro() : Pokemon{
        return Pokemon("https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png",
                "Bulbasauro",
                "Grama",
                "Bulbasaur pode ser visto dormindo na luz do sol. " +
                        "Há uma semente nas costas. Ao absorver os raios do sol, a semente cresce progressivamente.",
                1,
                2,
                3,
                2,
                3)
    }

    private fun getHypno() : Pokemon{
        return Pokemon("https://assets.pokemon.com/assets/cms2/img/pokedex/full/097.png",
                "Hypno",
                "Psíquico",
                "Hypno segura um pêndulo na mão. " +
                        "O movimento de arco e o brilho do pêndulo acalmam o inimigo em um estado profundo de hipnose. " +
                        "Enquanto este Pokémon procura por presa, ele lustra o pêndulo..",
                1,
                3,
                4,
                3,
                4)
    }

    private fun getDugtrio() : Pokemon{
        return Pokemon("https://assets.pokemon.com/assets/cms2/img/pokedex/full/051.png",
                "Dugtrio",
                "Terra",
                "Dugtrio são na verdade trigêmeos que emergiram de um corpo. " +
                        "Como resultado, cada trio pensa exatamente como os outros dois trios. " +
                        "Eles trabalham cooperativamente para escavar sem parar.",
                1,
                2,
                4,
                2,
                6)
    }

    private fun getDragonite() : Pokemon{
        return Pokemon("https://assets.pokemon.com/assets/cms2/img/pokedex/full/149.png",
                "Dragonite",
                "Dragão",
                "Dragonite é capaz de circundar o globo em apenas 16 horas. " +
                        "É um Pokémon de bom coração que leva os navios perdidos e afundando em uma tempestade para a segurança da terra.",
                1,
                4,
                7,
                4,
                4)
    }

    private fun getLapras() : Pokemon{
        return Pokemon("https://assets.pokemon.com/assets/cms2/img/pokedex/full/131.png",
                "Lapras",
                "Agua",
                "As pessoas levaram Lapras quase ao ponto de extinção. " +
                        "À noite, diz-se que esse Pokémon canta de forma lúgubre, " +
                        "à medida que busca o que poucos outros de seu tipo ainda permanecem.",
                1,
                5,
                4,
                4,
                3)
    }

}