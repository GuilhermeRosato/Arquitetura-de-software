public class Narguile {
        private String rosh;
        private String essencia;
        private String tpCarvao;
        private int qtdCarvao;
        //construtor
        public Narguile(String rosh, String essencia, String tpCarvao,
        int qtdCarvao){
            this.rosh = rosh;
            this.essencia = essencia;
            this.tpCarvao = tpCarvao;
            this.qtdCarvao = qtdCarvao;
        }
        // get e set
        public String getRosh(){
            return this.rosh;
        }
        public int getQtdCarvao(){
            return this.qtdCarvao;
        }
        public String getEssencia(){
            return this.essencia;
        }
        public String getTpCarvao(){
            return this.tpCarvao;
        }
        public void setRosh(String rosh){
            this.rosh = rosh;
        }
        public void setTpCarvao(String tpCarvao){
            this.tpCarvao = tpCarvao;
        }
        public void setEssencia(String essencia){
            this.essencia = essencia;
        }
        public void setQtdCarvao(int qtdCarvao){
            this.qtdCarvao = qtdCarvao;
        }
}
