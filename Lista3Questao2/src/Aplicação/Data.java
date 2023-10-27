package Aplicação;

public class Data {
	private int Dia;
	private int Mes;
	private int Ano;
	public Data(int dia,int mes,int ano) {
		if (ano < 1 || ano > 9999) {
			this.Dia=1;
			this.Mes=1;
			this.Ano=0001;
		}else if(mes < 1 || mes > 12) {
			this.Dia=1;
			this.Mes=1;
			this.Ano=1;
		}else {
			if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 30)) {
			this.Dia=1;
			this.Mes=1;
			this.Ano=1;
		}else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia > 31)) {
			this.Dia=1;
			this.Mes=1;
			this.Ano=1;
		}else if (mes == 2) {
            if ((ano % 4 != 0) || (ano % 100 == 0 && ano % 400 != 0)) {
                if (dia > 28) {
                	this.Dia=1;
        			this.Mes=1;
        			this.Ano=1;
                }
            } else if (dia > 29) {
            	this.Dia=1;
    			this.Mes=1;
    			this.Ano=1;
            	}
        	}else {
        		this.Dia=dia;
        		this.Mes=mes;
        		this.Ano=ano;
        	}
		}
	}
	public int Getdia() {
	return Dia;
	}
	public int Getmes() {
	return Mes;
	}
	public int Getano() {
	return Ano;
	}
	public int Comparar(Data d) {
		if(Dia == d.Getdia() && Mes == d.Getmes() && Ano==d.Getano() ) {
		return 0;
	}else {
		if(Dia+Mes+Ano>d.Getano()+d.Getmes()+d.Getdia()) {
			return 1;
		}else {
			return -1;
			}
		}
	}

	public void setDia(int dia) {
	this.Dia=dia;
	}
	public void setMes(int Mes) {
	this.Mes=Mes;
	}
	public void setAno(int Ano) {
	this.Ano=Ano;
	}
	public String getMesExtenso() {
		String nomeMes;
        switch (Mes) {
            case 1:
                nomeMes = "Janeiro";
                break;
            case 2:
                nomeMes = "Fevereiro";
                break;
            case 3:
                nomeMes = "Março";
                break;
            case 4:
                nomeMes = "Abril";
                break;
            case 5:
                nomeMes = "Maio";
                break;
            case 6:
                nomeMes = "Junho";
                break;
            case 7:
                nomeMes = "Julho";
                break;
            case 8:
                nomeMes = "Agosto";
                break;
            case 9:
                nomeMes = "Setembro";
                break;
            case 10:
                nomeMes = "Outubro";
                break;
            case 11:
                nomeMes = "Novembro";
                break;
            case 12:
                nomeMes = "Dezembro";
                break;
            default:
                nomeMes = "Mês inválido";
                break;
        }
        return nomeMes;
    }
  public Data Clone() {
	  Data copia = new Data(this.Dia,this.Mes,this.Ano);
	  return copia;
  }
}
