package Exercise_01;
class SituacaoCandidato{
  private double notaDaRedacao;
  private int questoesAcertadas;

  public SituacaoCandidato(double notaDaRedacao, int questoesAcertadas){
    this.notaDaRedacao = notaDaRedacao;
    this.questoesAcertadas = questoesAcertadas;
  }

  public String definirSituacao(double notaDaRedacao, int questoesAcertadas){
    if(notaDaRedacao < 0 || notaDaRedacao > 500 || questoesAcertadas < 0 || questoesAcertadas >50 ){
      throw new IllegalArgumentException("Valor inválido!");
    }
    if (notaDaRedacao < 250 || questoesAcertadas < 25) {
      return "Desclassificado.";
    }
    if(notaDaRedacao < 400 && questoesAcertadas < 40){
      return "Lista de espera.";
    }
    return "Classificado para o próxima fase.";
  }
  //get e set
  public int getQuestoesAcertadas(){
    return questoesAcertadas;
  }
  public void setQuestoesAcertadas(int questoesAcertadas){
    this.questoesAcertadas = questoesAcertadas;
  }
  public double getNotaDaRedacao(){
    return notaDaRedacao;
  }
  public void setNotaDaRedacao(double notaDaRedacao){
    this.notaDaRedacao = notaDaRedacao;
  }
}