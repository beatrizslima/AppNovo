package br.com.etecia.appnovo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listaFilmes;

    // criando a base de dados para os filmes
    String titulo[] = {"O Rei da Montanha", "O Apocalipse", "Um Contratempo", "A Origem", "Ilha do medo", "Salt"};
    String descricao[] = {"Espen Ash Lad, filho de um pobre agricultor, embarca em uma missão perigosa " +
            "com seus irmãos para salvar a princesa de um vilão conhecido como o Rei da Montanha. " +
            "O objetivo é ganhar uma recompensa e salvar a fazenda da sua família da ruína.", "Após um longo tempo, " +
            "Chloe decide visitar os pais. Ela andava irritava com a mãe, Irene, que há cerca de um ano " +
            "insistia na pregação religiosa a todos à sua volta. Ainda no aeroporto, ela encontra por acaso" +
            " com seu pai, Rayford, um piloto de avião. Durante a viagem, algo repentino acontece em todo " +
            "o planeta... Milhões de pessoas simplesmente desaparecem, sem deixar vestígios.", "Adrian desperta em um hotel, " +
            "e encontra sua amante morta coberta de dinheiro. Ele recorre a melhor advogada de defesa, e eles tentam " +
            "descobrir o que realmente aconteceu na noite anterior.", "Dom Cobb é um ladrão com a rara habilidade de roubar " +
            "segredos do inconsciente, obtidos durante o estado de sono. Impedido de retornar para sua família, ele recebe a " +
            "oportunidade de se redimir ao realizar uma tarefa aparentemente impossível: plantar uma ideia na mente do herdeiro de um império.",
            "Nos anos 1950, a fuga de uma assassina leva o detetive Teddy Daniels e seu parceiro a investigarem o seu desaparecimento " +
            "de um quarto trancado em um hospital psiquiátrico. Lá, uma rebelião se inicia e o agente terá que enfrentar seus próprios medos.",
            "Evelyn Salt jurou servir e honrar seu país. Trabalhando como agente da CIA, ela é colocada à prova ao ser acusada por um desertor russo" +
            "de ser uma espiã russa infiltrada. Decidida a provar sua inocência, ela foge e passa a usar suas habilidades para proteger " +
                    "não apenas sua vida, mas também a de seu marido."};
    String avaliacao[] = {"4.5", "4.0", "4.9", "5.0", "4.0", "4.7"};
    int filmes[] = {R.drawable.capafilme2, R.drawable.capafilme, R.drawable.contrat, R.drawable.origem, R.drawable.ilha, R.drawable.salt};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //método construtor

        listaFilmes = findViewById(R.id.listaFilmes);
        MyAdapter adapter = new MyAdapter();

        // preparar para instanciar o adaptador.
        // adaptador pega o modelo e o liga na lista.
        // ou seja, conectando na janela

        listaFilmes.setAdapter(adapter);
    // herança extende classe principal
    }
    // criando uma inner class MyAdapter
    public class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return filmes.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imagemFilme;
            TextView txtTituloFilme, txtSinopse, txtAvaliacaoFilme;

            // adaptador ligando ao modelo
            View v = getLayoutInflater().inflate(R.layout.modelo_layout, null);

            // apresentar as variáveis do java ao modelo xml
            imagemFilme = v.findViewById(R.id.imgFilmes);
            txtTituloFilme = v.findViewById(R.id.txtTituloFilme);
            txtSinopse = v.findViewById(R.id.txtSinopse);
            txtAvaliacaoFilme = v.findViewById(R.id.txtAvaliacaoFilme);

            // inserindo valores
            imagemFilme.setImageResource(filmes[position]);
            txtSinopse.setText(descricao[position]);
            txtTituloFilme.setText(titulo[position]);
            txtAvaliacaoFilme.setText(avaliacao[position]);

            return v;
        }
    }

}